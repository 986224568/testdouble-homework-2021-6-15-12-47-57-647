package com.tw.academy.banking;

import com.tw.banking.Console;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PrinterTest {
    @Mock
    Console console;

    @Test
    void should_call_printStatementLines_when_call_print() {
        MockitoAnnotations.openMocks(this);
        // given

        // when
        // then
    }
}
