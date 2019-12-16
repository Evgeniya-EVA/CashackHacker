package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldShowExceptionIfAmountIsOrUnderZero() {
        // подготовка
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 0;
        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(amount));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testdata.csv", numLinesToSkip = 1)
    void remainCalculation(int amount, int expected, String message) {
        // подготовка
        CashbackHackService cashbackHackService = new CashbackHackService();

        // выполнение действия
        int actual = cashbackHackService.remain(amount);

        // сравнение результата
        assertEquals(expected, actual, message);
    }
}