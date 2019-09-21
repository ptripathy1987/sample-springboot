package com.pt.volvo.samplespringboot.generators;

import com.pt.volvo.samplespringboot.payment.ChequePayment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChequePaymentDataGenerator {
    public static List<ChequePayment> generate(){
        List<ChequePayment> chequePayments = new ArrayList<>();
        chequePayments.add(new ChequePayment(1L,1L,2L,2201008.00, LocalDate.now().minusMonths(1), generateChequeNumber(),getRandomBankIFSC()));
        chequePayments.add(new ChequePayment(2L,2L,3L,1101008.00, LocalDate.now().minusYears(1), generateChequeNumber(),getRandomBankIFSC()));
        chequePayments.add(new ChequePayment(3L,3L,4L,401008.00, LocalDate.now().minusMonths(5), generateChequeNumber(),getRandomBankIFSC()));
        chequePayments.add(new ChequePayment(4L,4L,5L,721008.00, LocalDate.now().minusMonths(2), generateChequeNumber(),getRandomBankIFSC()));


        return chequePayments;
    }


    static Long generateChequeNumber(){
        Random r = new Random();
        int low = 45489454;
        int high = 74454545;
        int result = r.nextInt(high-low) + low;
        return Long.valueOf(result);
    }
    public static String getRandomBankIFSC() {


        return "BNKIFS" + randomNumber();
    }

    static String randomNumber(){
        Random r = new Random();
        int low = 4589454;
        int high = 74824545;
        int result = r.nextInt(high-low) + low;
        return String.valueOf(result);
    }
}
