package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldShowExceptionIfAmountIsUnderZero() {
        // подготовка
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = -100;
        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(amount));
    }

    @Test
    void return100IfAmountIs900() {
        // подготовка
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        // выполнение действия
        int actual = cashbackHackService.remain(amount);

        // сравнение результата
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void returnZeroIfAmountIs1000() {
        // подготовка
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        // выполнение действия
        int actual = cashbackHackService.remain(amount);

        // сравнение результата
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void returnZeroIfAmountIs1100() {
        // подготовка
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;

        // выполнение действия
        int actual = cashbackHackService.remain(amount);

        // сравнение результата
        int expected = 0;
        assertEquals(expected, actual);
    }
}