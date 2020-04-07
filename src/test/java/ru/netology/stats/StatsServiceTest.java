package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void calcAllSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calcAllSales(monthSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcAverageSales() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.calcAverageSales(monthSales);
        assertEquals(expected , actual);
    }

    @org.junit.jupiter.api.Test
    void calcMountMax() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.calcMountMax(monthSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcMonthMin() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.calcMonthMin(monthSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calcBelowAverage(monthSales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calcAboveAverage(monthSales);
        assertEquals(expected, actual);
    }
}