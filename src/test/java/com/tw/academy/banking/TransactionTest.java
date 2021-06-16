package com.tw.academy.banking;

import com.tw.banking.Transaction;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import static com.tw.banking.Clock.DATE_FORMAT;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {
    @Test
    void should_return_minus_1_when_transactionA_earlier_than_transactionB() {
        // given
        String date = LocalDate.now().toString(DATE_FORMAT);
        String date1 = LocalDate.now().plusDays(1).toString(DATE_FORMAT);
        int amount = 1;
        Transaction transactionA = new Transaction(date, amount);
        Transaction transactionB = new Transaction(date1, amount);

        // when
        int result = transactionA.compareTo(transactionB);

        // then
        assertEquals(-1, result);
    }

    @Test
    void should_return_1_when_transactionA_later_than_transactionB() {
        // given
        String date = LocalDate.now().toString(DATE_FORMAT);
        String date1 = LocalDate.now().plusDays(1).toString(DATE_FORMAT);
        int amount = 1;
        Transaction transactionA = new Transaction(date1, amount);
        Transaction transactionB = new Transaction(date, amount);

        // when
        int result = transactionA.compareTo(transactionB);

        // then
        assertEquals(1, result);
    }
}
