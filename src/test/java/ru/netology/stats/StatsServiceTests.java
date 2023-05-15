package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sum(sales);
        int expected = 180;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void averageMonthTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageMonth(sales);
        int expected = 180 / 12;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void monthMaxTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthMax(sales);
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void monthMinTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthMin(sales);
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void belowTheAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.belowTheAverage(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void aboveTheAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.aboveTheAverage(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }
}
