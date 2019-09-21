package com.pt.volvo.samplespringboot.payment;

import com.pt.volvo.samplespringboot.generators.ChequePaymentDataGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChequePaymentService {

    List<ChequePayment> chequePaymentList = new ArrayList<>();

    @PostConstruct
    public void init() {
        chequePaymentList = ChequePaymentDataGenerator.generate();
    }

    public List<ChequePayment> getAllChequePayments() {
        return chequePaymentList;
    }
}
