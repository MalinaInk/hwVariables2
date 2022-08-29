public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1: Объявляем переменные разных типов:\n");
        int grapesCount = 8;
        System.out.println("Значение переменной grapesCount с типом int равно " + grapesCount);
        byte man = 5;
        System.out.println("Значение переменной man с типом byte равно " + man);
        short women = 14;
        System.out.println("Значение переменной women с типом short авно " + women);
        long waveLength = 4_000_000;
        System.out.println("Значение переменной waveLength с типом long равно " + waveLength);
        float movementSpeed = 5.4f;
        System.out.println("Значение переменной movementSpeed с типом float равно " + movementSpeed);
        double molecularMass = 0.000005614;
        System.out.println("Значение переменной molecularMass с типом double равно " + molecularMass);

        // Задача 2
        System.out.println("\nЗадача 2: Инициализируем переменные согласно заданным значениям:\n");
        double a = 27.12;
        long b = 987_678_965_549L;
        float c = 2.786f;
        boolean flag1 = false;
        short sh = 569;
        int n = -159;
        long l = 27_897L;
        byte t = 67;
        System.out.println(a + "\n" + b + "\n" + c + "\n" + flag1 + "\n" + sh + "\n" + n + "\n" + l + "\n" + t);

        // Задача 3
        System.out.println("\nЗадача 3: Расчет количества листов\n");
        int count1Students = 23;
        int count2Students = 27;
        int count3Students = 30;
        int sumPapers = 480;
        int papersForPerson = sumPapers / (count1Students + count2Students + count3Students);
        System.out.println("На каждого ученика рассчитано " + papersForPerson + " листов бумаги");

        // Задача 4
        System.out.println("\nЗадача 4: Расчет производительности машины\n");
        int perform1 = 16;
        int time1 = 2;
        int performOneMinute = perform1 / time1;
        int time2 = 20;
        int time3 = 60 * 24;
        int time4 = time3 * 3;
        int time5 = time3 * 30;
        System.out.println("За 20 минут машина произвела бутылок " + time2 / performOneMinute + " штук");
        System.out.println("За сутки машина произвела бутылок " + time3 / performOneMinute + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + time4 / performOneMinute + " штук");
        System.out.println("За 30 дней машина произвела бутылок " + time5 / performOneMinute + " штук");

        // Задача 5
        System.out.println("\nЗадача 5: Расчет количества банок краски\n");
        int whitePaintOnClass = 2;
        int brownPaintOnClass = 4;
        int totalPaint = 120;
        int sumPaintOnClass = whitePaintOnClass + brownPaintOnClass;
        int countOfClass = totalPaint / sumPaintOnClass;
        int sumWhitePaint = whitePaintOnClass * countOfClass;
        int sumBrownPaint = brownPaintOnClass * countOfClass;
        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски\n", countOfClass, sumWhitePaint, sumBrownPaint);

        //Задача 6
        System.out.println("\nЗадача 6: Расчет веса спортзавтрака в граммах/килограммах\n");
        int bananaWeightOnGram = 80;
        int milkWeightOnGram = 105;
        int iceCreamWeightOnGram = 100;
        int eggWeightOnGram = 70;
        int totalWeightOnGram = 5*bananaWeightOnGram +
                        2*milkWeightOnGram +
                        2*iceCreamWeightOnGram +
                        4*eggWeightOnGram;
        double totalWeightOnKilogram = (double)(totalWeightOnGram/1000);
        System.out.printf("Вес всех продуктов равен %d грамм, или %.3f килограмм\n", totalWeightOnGram, totalWeightOnKilogram);

        //Задача 7
        System.out.println("\nЗадача 7: За сколько дней похудеет спортсмен: минимум, максимум, в среднем\n");
        int requiredWeightOnGram = 7_000;
        double minimumWeightLostInDay = 250;
        double maximumWeightLostInDay = 500;
        double mediumWeightLostInDay = (minimumWeightLostInDay + maximumWeightLostInDay)/2;
        double minimumDays = requiredWeightOnGram/minimumWeightLostInDay;
        double maximumDays = requiredWeightOnGram/maximumWeightLostInDay;
        double mediumDays = requiredWeightOnGram/mediumWeightLostInDay;
        System.out.printf("Спортсмен сбросит нужный вес минимум за %.0f дней, максимум за %.0f дней, в среднем - за %.0f дней\n", minimumDays, maximumDays, mediumDays);

        //Задача 8
        System.out.println("\nЗадача 8: Расчет новой зарплаты сотрудников и величины прибавки к ней\n");
        int mashaSalary = 67_770;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;
        double mashaSalaryIncrease = (double)(mashaSalary*0.1);
        double denisSalaryIncrease = (double)(denisSalary*0.1);
        double kristinaSalaryIncrease = (double)(kristinaSalary*0.1);
        double newMashaSalary = mashaSalary + mashaSalaryIncrease;
        double newDenisSalary = denisSalary + denisSalaryIncrease;
        double newKristinaSalary = kristinaSalary + kristinaSalaryIncrease;
        System.out.printf("Маша теперь получает %.0f рублей. Годовой доход вырос на %.0f рублей\n", newMashaSalary,mashaSalaryIncrease);
        System.out.printf("Денис теперь получает %.0f рублей. Годовой доход вырос на %.0f рублей\n", newDenisSalary,denisSalaryIncrease);
        System.out.printf("Кристина теперь получает %.0f рублей. Годовой доход вырос на %.0f рублей\n", newKristinaSalary,kristinaSalaryIncrease);
    }
}