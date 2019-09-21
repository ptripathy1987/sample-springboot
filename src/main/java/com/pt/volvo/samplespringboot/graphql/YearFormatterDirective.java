package com.pt.volvo.samplespringboot.graphql;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetcherFactories;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLFieldsContainer;
import graphql.schema.idl.SchemaDirectiveWiring;
import graphql.schema.idl.SchemaDirectiveWiringEnvironment;

import java.time.LocalDate;

public class YearFormatterDirective implements SchemaDirectiveWiring {

    @Override
    public GraphQLFieldDefinition onField(SchemaDirectiveWiringEnvironment<GraphQLFieldDefinition> environment) {


        GraphQLFieldDefinition field = environment.getElement();
        GraphQLFieldsContainer parentType = environment.getFieldsContainer();
        DataFetcher originalFetcher = environment.getCodeRegistry().getDataFetcher(parentType, field);
        DataFetcher wrappedFetcher = DataFetcherFactories.wrapDataFetcher(originalFetcher, (((dataFetchingEnvironment, value) -> {
            if(value instanceof Long) {
                return getFormattedYear(((Long) value).longValue());
            }
            return value;
        })));
        environment.getCodeRegistry().dataFetcher(parentType, field,wrappedFetcher);
        return field;
    }
    public Object getFormattedYear(Long value) {
        int currentYear = LocalDate.now().getYear();
        int diffYears = (int)currentYear-value.intValue();
        if (diffYears== 0) {
            return new String("This Year");
        } else if(diffYears==1) {
            return new String("1 Year back");
        }else {
            return new String(diffYears+" Year back");
        }
    }
}
