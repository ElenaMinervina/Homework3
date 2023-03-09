public class Main {
    public static void main(String[] args) {
        Variables2_1();
        Variables2_2();
        Variables2_3();
        Variables2_4();
        Variables2_5();
        Variables2_6();
        Variables2_7();
        Variables2_8();
    }
    public static void Variables2_1() {
        byte yorkshireTerrier = 120;
        System.out.println("Значение переменной yorkshireTerrier с типом byte равно "+ yorkshireTerrier);
        short frenchBulldog = -30000;
        System.out.println("Значение переменной frenchBulldog с типом short равно "+ frenchBulldog);
        int spaniel = 987654321;
        System.out.println("Значение переменной spaniel с типом int равно "+ spaniel);
        long dachshund = 1234567891234567890L;
        System.out.println("Значение переменной dachshund с типом long равно "+ dachshund);
        float a = 0.1f;
        System.out.println("Значение переменной a с типом long равно "+ a);
        double b = 45612.123456789;
        System.out.println("Значение переменной b с типом double равно "+ b);
    }
    public static void Variables2_2() {
        float a = 27.2f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        long h = (long) (a+b+c+d+e+f+g);
        System.out.println(h);
    }
    public static void Variables2_3() {
        byte ludmilaPavlovnasStudents = 23;
        byte annaSergeevnasStudents = 27;
        byte ekaterinaAndreevnasStudents = 30;
        short totalSheets = 480;
        int eachStudentSheets = totalSheets / (ludmilaPavlovnasStudents + annaSergeevnasStudents + ekaterinaAndreevnasStudents);
        System.out.println("На каждого ученика рассчитано " + eachStudentSheets + " листов бумаги");
    }
    public static void Variables2_4() {
        byte time = 2;
        byte numberInTime = 16;
        int speedInMinute = numberInTime / time;
        int number20 = speedInMinute * 20;
        System.out.println("За 20 минут машина произвела " + number20 + " бутылок");
        int numberDay = speedInMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + numberDay + " бутылок");
        int number3Days = numberDay * 3;
        System.out.println("За 3 дня машина произвела " + number3Days + " бутылок");
        int numberMonth  = numberDay * 30;
        System.out.println("За месяц машина произвела " + numberMonth + " бутылок");
    }
    public static void Variables2_5() {
        byte whiteAndBrown = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        int numberClasses = whiteAndBrown / (oneClassWhite + oneClassBrown);
        int white = numberClasses * oneClassWhite;
        int brown = numberClasses * oneClassBrown;
        System.out.println("В школе, где " + numberClasses + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }
    public static void Variables2_6() {
        byte bananasNumber = 5;
        byte bananaMassGram = 80;
        byte milkAmount = 2;
        short milkMassGram = 105;
        byte iceCreamAmount = 2;
        byte iceCreamMassGram = 100;
        byte eggNumber = 4;
        byte eggMassGram = 70;
        int breakfastMassGram = bananasNumber * bananaMassGram + milkAmount * milkMassGram + iceCreamAmount * iceCreamMassGram + eggNumber * eggMassGram;
        System.out.println("Вес спортзавтрака в граммах равен " + breakfastMassGram);
        float breakfastMassKilogram = (float) breakfastMassGram / 1000;
        System.out.println("Вес спортзавтрака в килограммах равен " + breakfastMassKilogram);
    }
    public static void Variables2_7() {
        byte weightKg = 7;
        short diet1G = 250;
        short diet2G = 500;
        int weightG = weightKg * 1000;
        int daysDiet1 = weightG / diet1G;
        int daysDiet2 = weightG / diet2G;
        System.out.println("При потере веса " + diet1G + "г в день спортсмен похудеет за " + daysDiet1 + " дней");
        System.out.println("При потере веса " + diet2G + "г в день спортсмен похудеет за " + daysDiet2 + " дней");
        int daysAverage = (daysDiet1 + daysDiet2) / 2;
        System.out.println("В среднем для похудения на " + weightKg + "кг потребуется " + daysAverage + " день");
    }
    public static void Variables2_8() {
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float percentageSalaryIncrease = 0.1f;
        float mashaSalaryIncrease = mashaSalary * (1 + percentageSalaryIncrease);
        float denisSalaryIncrease = denisSalary * (1 + percentageSalaryIncrease);
        float kristinaSalaryIncrease = kristinaSalary * (1+ percentageSalaryIncrease);
        int monthQuantity = 12;
        float mashaYearIncrease = (mashaSalaryIncrease - mashaSalary) * monthQuantity;
        float denisYearIncrease = (denisSalaryIncrease - denisSalary) * monthQuantity;
        float kristinaYearIncrease = (kristinaSalaryIncrease - kristinaSalary) * monthQuantity;
        System.out.println("Маша теперь получает " + mashaSalaryIncrease + " рублей. Годовой доход вырос на " + mashaYearIncrease + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryIncrease + " рублей. Годовой доход вырос на " + denisYearIncrease + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryIncrease + " рублей. Годовой доход вырос на " + kristinaYearIncrease + " рублей");
    }
}