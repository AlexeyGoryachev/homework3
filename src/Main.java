public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        byte cats = 127;
        short owls = 32767;
        int dogs = 2147483647;
        long humans = 999999999999L;
        float x = 20.6666666f;
        double y = 20.6666666666;
        System.out.println("Значение переменной с типом byte = " + cats);
        System.out.println("Значение переменной с типом short = " + owls);
        System.out.println("Значение переменной с типом int = " + dogs);
        System.out.println("Значение переменной с типом long = " + humans);
        System.out.println("Значение переменной с типом float = " + x);
        System.out.println("Значение переменной с типом double = " + y);
        //
        System.out.println("Task 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        //
        System.out.println("Task 3");
        byte ludasPupils = 23;
        System.out.println("У Людмилы " + ludasPupils + " ученика.");
        byte annasPupils = 27;
        System.out.println("У Анны " + annasPupils + " учеников.");
        byte katesPupils = 30;
        System.out.println("У Катерины " + katesPupils + " учеников.");
        byte totalPupils = (byte) (ludasPupils + annasPupils + katesPupils);
        System.out.println("всего учеников " + totalPupils);
        System.out.println("Для " + totalPupils + " закуплено 480 листов бумаги.");
        short totalPaperSheets = 480;
        byte paperForOne = (byte) (totalPaperSheets / totalPupils);
        System.out.println("Каждый ученик получит по " + paperForOne + " листов бумаги.");
        //
        System.out.println("Task 4");
        byte per2Min = 16;
        System.out.println("за 2 минуты производится " + per2Min + " бутылок.");
        byte per1Min = (byte) (per2Min / 2);
        short per20Min = (short) (per1Min * 20);
        short per1Day = (short) (60 * 24 * per1Min);
        int per3Days = per1Day * 3;
        int per1Month = per1Day * 31;
        System.out.println("за 20 минут производится " + per20Min + " бутылок.");
        System.out.println("за 1 день производится " + per1Day + " бутылок.");
        System.out.println("за 3 дня производится " + per3Days + " бутылок.");
        System.out.println("за 1 месяц производится " + per1Month + " бутылок.");
        //
        System.out.println("Task 5");
        System.out.println("На ремонт кабинетов в школе потребовалось 120 банок краски двух цветов (коричневого и белого).");
        byte totalCans = 120;
        byte totalClassrooms = (byte) (totalCans / 6);
        System.out.println("В школе всего " + totalClassrooms + " кабинетов.");
        System.out.println("На каждый из кабинетов требовалось 2 банки белой краски и 4 коричневой.");
        byte whitePaint = (byte) (totalClassrooms * 2);
        byte brownPaint = (byte) (totalClassrooms * 4);
        System.out.println("Всего потребовалось " + whitePaint + " банок белой краски и " + brownPaint + " коричневой.");
        //
        System.out.println("Task 6");
        System.out.println("Ингридиенты для завтрака:");
        System.out.println("бананы - 5 шт. (1 банан = 80 гр.);");
        System.out.println("молоко - 200 мл. (100 мл. = 105 гр.);");
        System.out.println("мороженое - 2 брикета (1 брикет = 100 гр.);");
        System.out.println("яйца - 4 шт. (1 яйцо = 70 гр.).");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        byte bananas = 5;
        byte milk = (byte) (200 / 100);
        byte iceCream = 2;
        byte eggs = 4;
        short totalBananasW = (short) (bananaWeight * bananas);
        System.out.println("общая масса бананов " + totalBananasW + " грамм.");
        short totalMilkW = (short) (milk * milkWeight);
        System.out.println("общая масса молока " + totalMilkW + " грамм.");
        short totalIceCreamW = (short) (iceCream * iceCreamWeight);
        System.out.println("общая масса мороженого " + totalIceCreamW + " грамм.");
        short totalEggsW = (short) (eggWeight * eggs);
        System.out.println("общая масса яиц " + totalEggsW + " грамм.");
        short breakfastWeight = (short) (totalBananasW + totalMilkW + totalIceCreamW + totalEggsW);
        float breakfastWeightKg = (breakfastWeight / 1000f);
        System.out.println("общая масса завтрака = " + breakfastWeight + " грамм или же " + breakfastWeightKg + " кг.");
        //
        System.out.println("Task 7");
        System.out.println("Спортсмену надо похудеть на 7 килограмм (1 кг. = 1000 гр.).");
        System.out.println("Следуя диете он будет сбрасывать 250 - 500 грамм в день.");
        short neededWeight = (short) (1000 * 7);
        short min = 250;
        short max = 500;
        short maxDays = (short) (neededWeight / min);
        System.out.println("максимально ему потребуется " + maxDays + " дней.");
        short minDays = (short) (neededWeight / max);
        System.out.println("минимально ему потребуется " + minDays + " дней.");
        byte average = (byte) ((maxDays + minDays) / 2);
        System.out.println("в среднем ему потребуется " + average + " дней.");
        //
        System.out.println("Task 8");
        System.out.println("увеличить з/п сотрудников на 10% и вычислить разницу годового дохода для каждого из них.");
        System.out.println("зарплата Маши до повышения составляла 67760");
        int maryWage = 67760;
        int maryAnnualIncome = maryWage * 12;
        System.out.println("годовой доход составлял " + maryAnnualIncome);
        int maryNewWage = (maryWage / 100) * 110;
        System.out.println("зарплата Маши после повышения составляет " + maryNewWage);
        int newMaryAnnInc = maryNewWage * 12;
        int increaseForMary = newMaryAnnInc - maryAnnualIncome;
        System.out.println("годовой доход увеличился на " + increaseForMary);
        //
        System.out.println("зарплата Дениса до повышения составляла 83690");
        int denisWage = 83690;
        int denisAnnualIncome = denisWage * 12;
        System.out.println("годовой доход составлял " + denisAnnualIncome);
        int newDenisWage = (denisWage / 100) * 110;
        System.out.println("зарплата Дениса после повышения составляет " + newDenisWage);
        int newDenisAnnInc = newDenisWage * 12;
        int increaseForDenis = newDenisAnnInc - denisAnnualIncome;
        System.out.println("годовой доход увеличился на " + increaseForDenis);
        //
        System.out.println("зарплата Кристины до повышения составляла 76230");
        int kristyWage = 76230;
        int kristyAnnualIncome = kristyWage * 12;
        System.out.println("годовой доход составлял " + kristyAnnualIncome);
        int newKristyWage = (kristyWage / 100) * 110;
        System.out.println("зарплата Кристины после повышения составляет " + newKristyWage);
        int newKristyAnnInc = newKristyWage * 12;
        int increaseForKristy = newKristyAnnInc - kristyAnnualIncome;
        System.out.println("годовой доход увеличился на " + increaseForKristy);

    }
}
