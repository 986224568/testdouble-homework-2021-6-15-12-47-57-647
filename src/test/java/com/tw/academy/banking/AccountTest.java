package com.tw.academy.banking;

import com.tw.banking.Account;
import com.tw.banking.Printer;
import com.tw.banking.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
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
        Account account = new Account(transactionRepository, printer);
        int amount = 1;
        // when
        account.deposit(amount);
        // then
        Mockito.verify(transactionRepository, Mockito.times(1)).addDeposit(amount);
    }

    @Test
    void should_call_addWithdraw_from_repository_when_call_addWithdraw_in_account() {
        MockitoAnnotations.openMocks(this);
        // given
        Account account = new Account(transactionRepository, printer);
        int amount = 1;
        // when
        account.withdraw(amount);
        // then
        Mockito.verify(transactionRepository, Mockito.times(1)).addWithdraw(amount);
    }

    @Test
    void should_call_allTransactions_from_repository_when_call_printStatement_in_account() {
        MockitoAnnotations.openMocks(this);
        // given
        // when
        // then
    }

}
