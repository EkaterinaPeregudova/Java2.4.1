package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void sumArray() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumArray(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void arithmeticMean() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.arithmeticMean(sales);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void montOfMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.montOfMaxSale(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void montOfMinSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.montOfMinSale(sales);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void sumMontMinMean() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.sumMontMinMean(sales);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void sumMontMaxMean() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.sumMontMaxMean(sales);

        assertEquals(expected, actual);
    }
}