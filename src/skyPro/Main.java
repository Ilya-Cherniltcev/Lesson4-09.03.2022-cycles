package skyPro;

public class Main {
    // Задача 1 =============================================================
    public static void main(String[] args) {
        byte i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (byte f = 10; f > 0; f--) {
            System.out.print(f + " ");
        }
        System.out.println();
        System.out.println("**********    Конец задачи 1     **********");
        fridayReport();
        System.out.println("**********    Конец задачи 2     **********");
        whenComet();
        System.out.println("**********    Конец задачи 3     **********");
    }

    // Задача 2 =============================================================
    public static void fridayReport() {
        int reportDay = 4;
        while (reportDay <= 31) {
            System.out.println("Сегодня пятница, " + reportDay + "-е число. Необходимо подготовить отчет.");
            reportDay += 7;
        }
    }

    // Задача 3 =============================================================
    public static void whenComet() {
        int thisYear = 2000;
        int earlyYear = thisYear - 200;
        int lastYear = thisYear + 100;
        while (earlyYear <= lastYear) {
            if (earlyYear % 79 == 0) {
                System.out.println("Комета пролетала (будет пролетать) в " + earlyYear + " г.");
                earlyYear += 79;
            } else {
                earlyYear++;
            }
        }
    }
}