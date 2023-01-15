public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        byte numberCat = 5;
        short numberDog = 3000;
        int numberSnow = 2837487;
        long numberStar = 387493874L;
        float sizeCucumber = 1.34f;
        double sizeVirus = 1.28374673;
        System.out.println("Значение переменной numberCat  с типом byte равно " + numberCat);
        System.out.println("Значение переменной numberDog с типом short равно " + numberDog);
        System.out.println("Значение переменной numberSnow c типом int равно " + numberSnow);
        System.out.println("Значение переменной numberStar c типом long  равно " + numberStar);
        System.out.println("Значение переменной sizeCucumber c типом flot равно " + sizeCucumber);
        System.out.println("Значение переменной sizeVirus c типом double равно " + sizeVirus);

        //Задача №2
        System.out.println("Задача №2");
        float size23 = 27.2f;
        long numStar = 987_678_965_549L;
        double size123 = 2.786;
        short num1 = 569;
        int num3 = - 159;
        short num4 = 27897;
        byte num5 = 67;
        System.out.println(size23);
        System.out.println(numStar);
        System.out.println(size123);
        System.out.println(num1);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num4);
        System.out.println(num5);

        //Задача №3
        int studentTeacherLP = 23;
        int studentTeacherAS = 27;
        int studentTeacherEA = 30;
        int totalPaper = 480;
        int studentPaper = totalPaper/(studentTeacherLP + studentTeacherAS + studentTeacherEA);
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");

        //Задача №4
        System.out.println("Задача №4");
        int machinePerformance = 16;
        int timePerformance = 2;
        int performance1min = machinePerformance/timePerformance;
        int performance20min = performance1min*20;
        int performanceHour = performance20min*3;
        int performance24hour = performanceHour*24;
        int performance3days = performance24hour*3;
        int performance1month = performance3days*10;
        System.out.println("За 20 минут машина произвела " + performance20min + " штук бутылок");
        System.out.println("За сутки машина произвела " + performance24hour + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + performance3days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + performance1month + " штук бутылок");

        //Задача №5
        System.out.println("Задача №5");
        int totalPot = 120;
        int potWhite = 2;
        int potBrown = 4;
        int totalClass = totalPot/(potWhite+potBrown);
        int totalPotWhite = totalClass*potWhite;
        int totalPotBrown = totalClass*potBrown;
        System.out.println("В школе, где " + totalClass + " классов, нужно " +totalPotWhite + " банок белой краски и " + totalPotBrown + " банок коричневой краски.");

        //Задача №6
        System.out.println("Задача № 6");
        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int egg = 4;
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        float kg = 1000f;
        int cocktailGr = bananas*bananaWeight+milk*milkWeight+iceCreamWeight*iceCream+egg*eggWeight;
        float cocktailKg = cocktailGr/kg;
        System.out.println("Вес спортивного питания в граммах составит " + cocktailGr + " вес спортивного питания в килограммах составит " + cocktailKg);

        //Задача №7
        System.out.println("Задача №7");
        int totalWeightKg = 7;
        double totalWeightGr = totalWeightKg * 1000;
        double weightMin = 250;
        double weightMax = 500;
        double dayMin = totalWeightGr / weightMax;
        double dayMax = totalWeightGr / weightMin;
        double weightAverage = (weightMin+weightMax)/2;
        double dayAverage = totalWeightGr/weightAverage;
        System.out.println("Если спортсмен будет терять " + weightMin + " то на похудение уйдет " + dayMax);
        System.out.println("Если спортсмен будет терять " + weightMax + " то на похудение уйдет " + dayMin);
        System.out.println("В среднем на похудение уйдет " + dayAverage + " дней");

        //Задача №8
        System.out.println("Задача №8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristi = 76230;
        float proc10salary = 1.1f;
        float salaryNewMasha = salaryMasha*proc10salary;
        float salaryNewDenis = salaryDenis*proc10salary;
        float salaryNewKristi = salaryKristi*proc10salary;
        int salaryYearMasha =salaryMasha*12;
        int salaryYearDenis = salaryDenis*12;
        int salaryYearKristi = salaryKristi*12;
        float differenceMasha = salaryYearMasha*proc10salary-salaryYearMasha;
        float differenceDenis = salaryYearDenis*proc10salary-salaryYearDenis;
        float differenceKristi = salaryYearKristi*proc10salary-salaryYearKristi;
        System.out.println("Маша теперь получает " + salaryNewMasha + " рублей. Ее годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryNewDenis + " рублей. Ее годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryNewKristi + " рублей. Ее годовой доход вырос на " + differenceKristi + " рублей");












    }
}