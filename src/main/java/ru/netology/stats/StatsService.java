package ru.netology.stats;

public class StatsService {
    //сумма всех продаж
    public int calcAllSales(int[] monthSales) {
        int allSales = 0;
        for (long monthSale : monthSales) {
            allSales += monthSale;
        }
        return allSales;
    }

    //средняя сумма продаж в месяц
    public int calcAverageSales(int[] monthSales) {
        int allSales = 0;
        for (long monthSale : monthSales) {
            allSales += monthSale;
        }
        return allSales / monthSales.length;
    }

    //номер месяца, в котором пик продаж
    public int calcMountMax (int[] monthSales) {
        int salesMax = 0;
        int monthMaxSales = 0;
        for ( int i = 0; i < monthSales.length; i++) {
            if (salesMax <= monthSales[i]) {
                salesMax = monthSales[i];
                monthMaxSales = i;
            }
        }
        return monthMaxSales+1;
    }

    //номер месяца, в котором минимум продаж
    public int calcMonthMin (int[] monthSales) {
        int salesMin = monthSales[0];
        int monthMinSales = 0;
        for ( int i = 0; i < monthSales.length; i++) {
            if (salesMin > monthSales[i]) {
                salesMin = monthSales[i];
                monthMinSales = i;
            }
        }
    return monthMinSales+1;
    }

    //кол-во месяцев с выше среднего
    public int calcBelowAverage(int[] monthSales) {
        int average = calcAverageSales(monthSales);
        int monthAboveCounter = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] < average) {
                monthAboveCounter++;
            }
        }
        return monthAboveCounter;
    }

    //кол-во месяцев в ниже среднего
    public int calcAboveAverage(int[] monthSales) {
        int average = calcAverageSales(monthSales);
        int monthBelowCounter = 0;
        for (int i = 0; i < monthSales[i]; i++) {
            if (average < monthSales[i]) {
                monthBelowCounter++;
            }
        }
        return monthBelowCounter+1;
    }
}


