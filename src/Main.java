public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадача 1");
        int accumulation = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total += accumulation;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("\nЗадача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }

        System.out.println();
        for (; a > 0; a--) {
            System.out.print(a + " ");
        }

        System.out.println("\nЗадача 3");
        int populationInY = 12_000_000;
        int birthRate;
        int mortalityRate;
        for (int c = 1; c <= 10; c++) {
            birthRate = populationInY / 1000 * 17;
            mortalityRate = populationInY / 1000 * 8;
            populationInY = populationInY + birthRate - mortalityRate;
            System.out.printf("Год %S, численность населения составляет %S.\n", c, populationInY);
        }

        System.out.println("\nЗадача 4");
        double contribution = 15000;
        for (int j = 1; contribution < 12_000_000; j++) {
            contribution = contribution * 1.07;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей.\n", j, contribution);
        }

        System.out.println("\nЗадача 5");
        double contribution2 = 15000;
        for (int e = 1; contribution2 < 12_000_000; e++) {
            contribution2 = contribution2 * 1.07;
            if (e % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей.\n", e, contribution2);
            }
        }

        System.out.println("\nЗадача 6.1");
        double contribution3 = 15000;
        int f = 0;
        int accumulationTime = 9 * 12;
        while (f <= accumulationTime) {
            contribution3 = contribution3 * 1.07;
            f++;
            if (f % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей.\n", f, contribution3);
            }
        }

        System.out.println("\nЗадача 6.2");
        double contribution4 = 15000;
        int accumulationTime2 = 9 * 12;
        for (int k = 1; k <= accumulationTime2; k++) {
            contribution4 = contribution4 * 1.07;
            if (k % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей.\n", k, contribution4);
            }
        }

        System.out.println("\nЗадача 7");
        int firstFriday = 0;
        int p = 1;
        do {
            System.out.println(" ");
            firstFriday++;
            for (p = firstFriday; p <= 31; p += 7) {
                System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет.\n", p);
            }
        }
        while (firstFriday < 7);

        System.out.println("\nЗадача 8");
        int thisYear = 2024;
        int start = 2024 - 200;
        int end = thisYear + 100;

        for (int m = 0; m < end; m += 79) {
            if (m >= start) {
                System.out.println(m);
            }
        }


    }
}