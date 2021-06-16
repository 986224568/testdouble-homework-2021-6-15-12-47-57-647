package com.tw.academy.banking;

import com.tw.banking.Console;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsoleTest {
    @Test
    void should_print_hahaha_when_call_printLine() {
        // given
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        String str = "hahaha";
        Console console = new Console();
        // when
        console.printLine(str);
        // then
        assertEquals(str + "\r\n", byteArrayOutputStream.toString());
    }
}
