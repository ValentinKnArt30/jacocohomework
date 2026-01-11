package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldfindMaxequality() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {5, 5, 8, 4, 12, 3, 8, 6, 11, 11, 12};
        //Исходя из отчета Jococo, не прокрыта тестами строка сервиса,
        // а именно равенства currentMax = income;,
        // чтобы покрыть тестами данную строку, поменяем входные данные
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
