package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int saleResult = 0;
        for (int sale : sales) {
            saleResult += sale;
        }
        return saleResult;
    }

    public int averageMonth(int[] sales) {
        int averageMonth = sum(sales) / 12;
        return averageMonth;
    }

    public int monthMax(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthMin(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int belowTheAverage(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale < averageMonth(sales)) {
                month++;
            }
        }
        return month;
    }

    public int aboveTheAverage(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale > averageMonth(sales)) {
                month++;
            }
        }
        return month;
    }
}
