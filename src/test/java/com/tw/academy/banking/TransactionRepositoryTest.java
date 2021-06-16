package com.tw.academy.banking;

import com.tw.banking.Clock;
import com.tw.banking.Transaction;
import com.tw.banking.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionRepositoryTest {
    @Mock
    Clock clock;
    @Test
    void should_call_todayAsString_when_call_addDeposit() {
        MockitoAnnotations.openMocks(this);
        // given
        TransactionRepository transactionRepository = new TransactionRepository(clock);
        int mount = 1;
        // when
        transactionRepository.addDeposit(mount);
        // then
        Mockito.verify(clock, Mockito.times(1)).todayAsString();
    }

    @Test
    void should_return_all_transactions_when_call_allTransactions() {
        MockitoAnnotations.openMocks(this);
        // given
        TransactionRepository transactionRepository = new TransactionRepository(clock);
        // when
        List<Transaction> transactions = transactionRepository.allTransactions();
        // then
        assertEquals(0, transactions.size());
    }

    @Test
    void should_call_todayAsString_when_call_addWithdraw() {
        MockitoAnnotations.openMocks(this);
        // given
        TransactionRepository transactionRepository = new TransactionRepository(clock);
        int mount = 1;
        // when
        transactionRepository.addWithdraw(mount);
        // then
        Mockito.verify(clock, Mockito.times(1)).todayAsString();
    }
}
