package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void sumArray() {
        assertEquals(180, service.sumArray(sales));
    }

    @org.junit.jupiter.api.Test
    void arithmeticMean() {
        assertEquals(15, service.arithmeticMean(sales));
    }

    @org.junit.jupiter.api.Test
    void montOfMaxSale() {
        assertEquals(8, service.montOfMaxSale(sales));
    }

    @org.junit.jupiter.api.Test
    void montOfMinSale() {
        assertEquals(9, service.montOfMinSale(sales));
    }
    @org.junit.jupiter.api.Test
    void sumMontMinMean() {
        assertEquals(5, service.sumMontMinMean(sales));
    }

    @org.junit.jupiter.api.Test
    void sumMontMaxMean() {
//        StatsService service = new StatsService();
//        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        long expected = 5;
//
//        long actual = service.sumMontMaxMean(sales);

        assertEquals(5, service.sumMontMaxMean(sales));
    }
}