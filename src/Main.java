public class Main {
    public static void main(String[] args) {
        Variables2_1();
        Variables2_2();
        Variables2_3();
        Variables2_4();
        Variables2_5();
        Variables2_6();
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

    }
}