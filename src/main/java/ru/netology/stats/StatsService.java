
package ru.netology.stats;

public class StatsService {
    public int amountOfSales(int[] sales) {
        int sum = 0;
        int salesInMonth = sales[0];
        for (int s : sales) {
            sum = sum + s;
        }
        return sum;
    }

    public int averageAmountOfSalesPerMonth (int[] sales) {
        int sum = amountOfSales(sales);
        int average = sum / sales.length;
        return average;
    }
    public int numberMonthMaxSales (int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale:
             sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    public int monthsBelowAverage(int[] sales) {
        int belowAverage = 0;
        int average = averageAmountOfSalesPerMonth(sales);
        for (int s:
             sales) {
            if (s < average) {
                belowAverage++;
            }
        }
         return belowAverage;
    }

    public int monthsOverAverage(int[] sales) {
        int overAverage = 0;
        int month = 0;
        int average = averageAmountOfSalesPerMonth(sales);
        for (int s:
                sales) {
            if (s > average) {
                overAverage++;
            }
        }
        return overAverage;
    }
}
