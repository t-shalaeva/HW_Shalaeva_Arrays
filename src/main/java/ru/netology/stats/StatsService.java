package ru.netology.stats;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long sumAllSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumAllSales = sumAllSales + sales[i];
        }
        return sumAllSales;
    }

    public long averageSale(long[] sales) {
        return sumAllSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int countMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale(sales)) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public int salesAboveAverage(long[] sales) {
        int countMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale(sales)) {
                countMonth++;
            }
        }
        return countMonth;
    }

}
