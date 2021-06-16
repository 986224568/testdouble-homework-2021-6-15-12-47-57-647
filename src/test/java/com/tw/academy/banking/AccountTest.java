package com.tw.academy.banking;

import com.tw.banking.Account;
import com.tw.banking.Printer;
import com.tw.banking.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class AccountTest {
    @Mock
    Printer printer;
    @Mock
    TransactionRepository transactionRepository;

    @Test
    void should_call_addDeposit_from_repository_when_call_addDeposit_in_account() {
        MockitoAnnotations.openMocks(this);
        // given
        // when
        // then
    }

}
