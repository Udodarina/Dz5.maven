package ru.netology.mymavenDz5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidayServiceTest {

    @Test
    public void HolidayWithLowSalary() {
        int expected = 3;
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        HolidayService service = new HolidayService();
        int actual = (int) service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void HolidayWithHighSalaru() {
        int expected = 2;
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        HolidayService service = new HolidayService();
        int actual = (int) service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}