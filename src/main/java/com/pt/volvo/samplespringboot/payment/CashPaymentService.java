package com.pt.volvo.samplespringboot.payment;

import com.pt.volvo.samplespringboot.generators.CardPaymentDataGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CashPaymentService {
    List<CardPayment> cardPaymentList = new ArrayList<>();

    @PostConstruct
    public void init() {
        cardPaymentList = CardPaymentDataGenerator.generate();
    }

    public List<CardPayment> getAllCardPayments() {
        return cardPaymentList;
    }
}
