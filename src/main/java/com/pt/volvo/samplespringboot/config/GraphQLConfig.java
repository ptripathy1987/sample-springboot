package com.pt.volvo.samplespringboot.config;

import com.oembedler.moon.graphql.boot.SchemaDirective;
import com.pt.volvo.samplespringboot.graphql.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {

    @Bean
    public VehicleQueryResolver vehicleQueryResolver() {
        return new VehicleQueryResolver();
    }
@Bean
public ChequePaymentResolver chequePaymentResolver() {
        return new ChequePaymentResolver();
}
@Bean
    public CashPaymentResolver cashPaymentResolver() {
        return new CashPaymentResolver();
}
    @Bean
    public DealerQueryResolver dealerQueryResolver() {
        return new DealerQueryResolver();
    }

    @Bean
    public SchemaDirective yearFormatterDirective() {
        return new SchemaDirective("yearFormatter", new YearFormatterDirective());
    }
}
