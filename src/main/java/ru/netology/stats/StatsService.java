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
        int salesMax = monthSales[0];
        int i = 1;
        int monthMaxSales = 1;
        while (i < monthSales.length) {
            if (monthSales[i] >= salesMax) {
                salesMax = monthSales[i];
                monthMaxSales = i + 1;
            }
            i++;
        }
        return monthMaxSales;
    }

    //номер месяца, в котором минимум продаж
    public int calcMonthMin (int[] monthSales) {
        int salesMin = monthSales[0];
        int monthMinSales = 1;
        for (int i = 1; i < monthSales.length; i++) {
            if (monthSales[i] <= salesMin) {
                salesMin = monthSales[i];
                monthMinSales = i + 1;}
        }
    return monthMinSales;
    }

    //кол-во месяцев с выше среднего
    public int calcBelowAverage(int[] monthSales) {
        double average = calcAverageSales(monthSales);
        int monthAboveCounter = 0;
        for (int monthSale : monthSales) {
            if (monthSale > average) {
                monthAboveCounter++;
            }
        }
        return monthAboveCounter;
    }

    //кол-во месяцев в ниже среднего
    public int calcAboveAverage(int[] monthSales) {
        double average = calcAverageSales(monthSales);
        int monthBelowCounter = 0;
        for (int monthSale : monthSales) {
            if (monthSale < average) {
                monthBelowCounter++;
            }
        }
        return monthBelowCounter;
    }
}


