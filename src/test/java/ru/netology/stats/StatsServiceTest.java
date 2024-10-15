package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = new long[]{
            2_147_483_648L,
            20_008_500_000L,
            30_000_000_000L,
            1_033_301_222,
            9_999_999,
            5_500_000_000L,
            835_082,
            4_805_634,
            71_277_400,
            3_077_000_055L,
            173_000_013,
            29_000_366};

    @Test
    public void shouldSumAllSales() {
        StatsService stats = new StatsService();

        long actual = stats.sumAllSales(sales);
        long expected = 62_055_203_419L;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSale() {
        StatsService stats = new StatsService();

        long actual = stats.averageSale(sales);
        long expected = 5_171_266_951L;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMaxMonth() {
        StatsService stats = new StatsService();

        int actual = stats.maxSales(sales);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinMonth() {
        StatsService stats = new StatsService();

        int actual = stats.minSales(sales);
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthsBelowAverage() {
        StatsService stats = new StatsService();

        long actual = stats.salesBelowAverage(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthsAboveAverage() {
        StatsService stats = new StatsService();

        long actual = stats.salesAboveAverage(sales);
        long expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}
