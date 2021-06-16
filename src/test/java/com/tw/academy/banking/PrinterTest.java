package com.tw.academy.banking;

import com.tw.banking.Console;
import com.tw.banking.Printer;
import com.tw.banking.Transaction;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static com.tw.banking.Clock.DATE_FORMAT;
import static com.tw.banking.Printer.STATEMENT_HEADER;
import static org.mockito.ArgumentMatchers.any;

public class PrinterTest {
    @Mock
    Console console;

    @Test
    void should_call_printLine_in_console_when_call_print() {
        MockitoAnnotations.openMocks(this);
        // given
        Printer printer = new Printer(console);
        List<Transaction> transactions = new ArrayList<>();
        String date = LocalDate.now().toString(DATE_FORMAT);
        int amount = 1;
        Transaction transaction = new Transaction(date, amount);
        transactions.add(transaction);
        transactions.add(transaction);
        transactions.add(transaction);
        transactions.add(transaction);
        // when
        printer.print(transactions);
        // then
        Mockito.verify(console, Mockito.times(1 + transactions.size())).printLine(any());
    }
}
