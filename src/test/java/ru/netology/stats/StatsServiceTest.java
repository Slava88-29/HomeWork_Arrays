package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void minSales() {

        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        // вызываем целевой метод:
        int actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void sumSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        // вызываем целевой метод:
        long actual = service.sumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void averageSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        // вызываем целевой метод:
        long actual = service.averageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        // вызываем целевой метод:
        int actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void lowSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        // вызываем целевой метод:
        int actual = service.lowSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void highSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        // вызываем целевой метод:
        int actual = service.highSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
}