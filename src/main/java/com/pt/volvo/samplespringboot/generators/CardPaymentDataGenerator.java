package com.pt.volvo.samplespringboot.generators;

import com.pt.volvo.samplespringboot.payment.CardPayment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardPaymentDataGenerator {
    public static List<CardPayment> generate(){
        List<CardPayment> cardPayments = new ArrayList<>();
        cardPayments.add(new CardPayment(1L,1L,2L,2201008.00, LocalDate.now().minusMonths(1),generateCard(),"VISA"));
        cardPayments.add(new CardPayment(2L,2L,3L,1101008.00, LocalDate.now().minusYears(1),generateCard(),"MASTER"));
        cardPayments.add(new CardPayment(3L,3L,4L,401008.00, LocalDate.now().minusMonths(5),generateCard(),"AMEX"));
        cardPayments.add(new CardPayment(4L,4L,5L,721008.00, LocalDate.now().minusMonths(2),generateCard(),"VISA"));


        return cardPayments;
    }


    static Random random = new Random(System.currentTimeMillis());


    static String randomBin(){
        Random r = new Random();
        int low = 4589;
        int high = 7482;
        int result = r.nextInt(high-low) + low;
        return String.valueOf(result);
    }

    private static String generateCard() {


        String bin = randomBin();
        int length = 16;

        // The number of random digits that we need to generate is equal to the
        // total length of the card number minus the start digits given by the
        // user, minus the check digit at the end.
        int randomNumberLength = length - (bin.length() + 1);

        StringBuilder builder = new StringBuilder(bin);
        for (int i = 0; i < randomNumberLength; i++) {
            int digit = random.nextInt(10);
            builder.append(digit);
        }

        // Do the Luhn algorithm to generate the check digit.
        int checkDigit = getCheckDigit(builder.toString());
        builder.append(checkDigit);

        return builder.toString();
    }

    /**
     * Generates the check digit required to make the given credit card number
     * valid (i.e. pass the Luhn check)
     *
     * @param number
     *            The credit card number for which to generate the check digit.
     * @return The check digit required to make the given credit card number
     *         valid.
     */
    private static int getCheckDigit(String number) {


        int sum = 0;
        for (int i = 0; i < number.length(); i++) {

            // Get the digit at the current position.
            int digit = Integer.parseInt(number.substring(i, (i + 1)));

            if ((i % 2) == 0) {
                digit = digit * 2;
                if (digit > 9) {
                    digit = (digit / 10) + (digit % 10);
                }
            }
            sum += digit;
        }


        int mod = sum % 10;
        return ((mod == 0) ? 0 : 10 - mod);
    }
}
