package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StatsServiceTest {
    StatsService service = new StatsService();
    @Test
    public void shouldCountAmount() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.amountOfSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmountOfSalesPerMonth(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldShowNumberMonthMaxSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.numberMonthMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldShowNumberMonthMinSales () {
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldShowAmountMonthBelowAverage () {
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowAmountMonthOverAverage () {
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsOverAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
