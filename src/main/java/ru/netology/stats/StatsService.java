package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }
    public long averageSales(long[] sales) {
        long averageSales = sumSales(sales)/sales.length;

        return averageSales;
    }
    public int maxSales(long[] sales) {

        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }
    public int lowSales(long[] sales) {
        int lowSales = 0;
        long average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) { // значит, в рассматриваемом i-м месяце продаж меньше
                lowSales ++; // запомним его как минимальный
            }
        }
        return lowSales;
    }

    public int highSales(long[] sales) {
        int highSales = 0;
        long average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) { // значит, в рассматриваемом i-м месяце продаж меньше
                highSales++; // запомним его как минимальный
            }
        }
        return highSales;
    }
}
