package com.tw.academy.banking;

import com.tw.banking.Clock;
import com.tw.banking.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

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
    void should_call_todayAsString_when_call_addWithdraw() {
        MockitoAnnotations.openMocks(this);
        // given
        // when
        // then
    }
}
