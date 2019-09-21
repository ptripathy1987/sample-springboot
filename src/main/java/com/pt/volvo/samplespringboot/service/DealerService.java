package com.pt.volvo.samplespringboot.service;

import com.pt.volvo.samplespringboot.dto.Dealer;
import com.pt.volvo.samplespringboot.generators.DealerDataGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class DealerService {

    List<Dealer> dealerList = new ArrayList<>();

    @PostConstruct
    public void init() {
        dealerList = DealerDataGenerator.generate();
    }

    public List<Dealer> getDealerList() {
        return dealerList;
    }

    public Dealer getId(Long id) {
        return dealerList.stream().filter(dealer -> id==dealer.getId())
                .findFirst().orElse(null);
    }
}
