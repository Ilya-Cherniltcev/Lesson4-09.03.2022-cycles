package skyPro;

public class Main {
    // Задача 1 ==============================================================
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
        System.out.println("*******************************************");
        pingPong();
        System.out.println("**********    Конец задачи 4     **********");
        sequenceOfFib();
        System.out.println("**********    Конец задачи 5     **********");
        creditCards();
        System.out.println("**********    Конец задачи 6     **********");
        auditCredit();
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

    // Задача 4 =============================================================
    public static void pingPong() {
        for (byte i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i);
            }
        }

    }

    // Задача 5 =============================================================
    public static void sequenceOfFib() {
        int first = 0, second = 1;
        System.out.print(first + " " + second);
        byte i = 2;
        int sum;
        do {
            sum = first + second;
            System.out.print(" " + sum);
            first = second;
            second = sum;
            i++;
        } while (i <= 10);
        System.out.println();
    }

    // Задача 6 =============================================================
    public static void creditCards() {
        byte age = 19;
        int salary = 58_000, limit;
        if (age >= 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }
        if (salary >= 50_000) {
            if (salary >= 80_000) {
                limit *= 1.5;
            } else {
                limit *= 1.2;
            }
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }

    // Задача 7 =============================================================
    public static void auditCredit() {
        float rate = 10f;
        byte age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        int maxPayment = salary / 2;
        if (age < 30) {
            if (age < 23) {
                rate += 1;
            } else {
                rate += 0.5;
            }
        }
        if (salary > 80_000) {
            rate -= 0.7;
        }
        float payment = (wantedSum + wantedSum * rate / 100) / 12;
        if (payment > maxPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей. Отказано");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей. ОДОБРЕНО!");
        }
    }
}