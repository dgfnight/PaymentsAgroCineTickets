package Grupo1.service;

import Grupo1.request.CardRequest;
import org.springframework.stereotype.Service;

import java.time.YearMonth;
import java.util.Random;

import static java.lang.Long.parseLong;

@Service
public class PaymentService {

    public boolean cardValidator(CardRequest card) {
        return isValid(card);
    }

    private boolean isValid(CardRequest card) {
        long number = parseLong(String.valueOf(card.getNumber()));
        return (isValidCvv(card.getCvv()) &&
                unexpiredDate(card.getExpirationDate()) &&
                getSize(number) >= 13 &&
                getSize(number) <= 16) &&
                (prefixMatched(number, 4) ||
                        prefixMatched(number, 5) ||
                        prefixMatched(number, 37) ||
                        prefixMatched(number, 6)) &&
                ((sumOfDoubleEvenPlace(number) +
                        sumOfOddPlace(number)) % 10 == 0);
    }

    private boolean isValidCvv(String cvv) {
        return cvv.matches("\\d{3,4}");
    }

    private boolean unexpiredDate(YearMonth yearMonth) {
        return yearMonth.isAfter(YearMonth.now());
    }

    private int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2)
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);

        return sum;
    }

    private int getDigit(int number) {
        if (number < 9)
            return number;
        return number / 10 + number % 10;
    }

    private int sumOfOddPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2)
            sum += Integer.parseInt(num.charAt(i) + "");
        return sum;
    }

    private boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    private int getSize(long d) {
        String num = d + "";
        return num.length();
    }

    private long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String num = number + "";
            return parseLong(num.substring(0, k));
        }
        return number;
    }

    public boolean pixValidator() {
        var number = new Random().nextInt(3);
        return number < 2;
    }
}
