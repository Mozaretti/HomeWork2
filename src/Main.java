public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Задача 1");
        System.out.println();
        byte fighter = 33;
        short man = 2346;
        int bananas = 5865;
        long woman = 34789;
        float sugar = 3.75f;
        double water = 5.678;
        System.out.println("Всего бойцов " + fighter + " человека.");
        System.out.println("В соревнованиях учавствуют " + man + " мужчины.");
        System.out.println("На складе " + bananas + " кг. бананов.");
        System.out.println("Прошли тестирование " + woman + " женщин.");
        System.out.println("В пакете сахара " + sugar + " кг.");
        System.out.println("В ведре налито " + water + " литров воды.");
        System.out.println();
        }
        public static void task2(){
            System.out.println("Задача 2");
            System.out.println();
            float salt = 27.12f;
            long stars = 987_678_965_549L;
            double sugar = 2.786;
            short temperatura = -159;
            int bird = 27897;
            byte workers = 69;
            System.out.println(salt);
            System.out.println(stars);
            System.out.println(sugar);
            System.out.println(temperatura);
            System.out.println(bird);
            System.out.println(workers);
            System.out.println();

        }
        public static void task3(){
            System.out.println("Задача 3");
            System.out.println();
            byte ludmilsPavlovna = 23;
            byte annaSergeevna = 27;
            byte ekaterinaAndreevna = 30;
            short paper = 480;
            int totalStudents = ludmilsPavlovna + annaSergeevna + ekaterinaAndreevna;
            int paperStudents = paper / totalStudents;
            System.out.println("На каждого ученика рассчитано " + paperStudents + " листов бумаги.");
            System.out.println();
        }
        public static void task4(){
            System.out.println("Задача 4");
            System.out.println();
            byte bootle = 16;
            byte time = 2;
            int oneMinuta = bootle / time;
            byte time2 = 20;
            int twentyMinutes = oneMinuta * time2;
            System.out.println("За " + time2 + " минут"+ " машина произвела " + twentyMinutes + " бутылок.");
            byte day = 24;
            int dayBootle = oneMinuta * 60 * 24;
            System.out.println("За " + day + " часа"+ " машина произвела " + dayBootle + " бутылок.");
            byte threeDay = 3;
            int tyreeDayBootle = dayBootle * 3;
            System.out.println("За " + threeDay + " дня"+ " машина произвела " + tyreeDayBootle +
                    " бутылок.");
            byte mount = 30;
            byte mount2 = 1;
            int mountBootle = dayBootle * mount;
            System.out.println("За " + mount2 + " месяц"+ " машина произвела " + mountBootle + " бутылок.");
            System.out.println();


        }
        public static void task5(){
            System.out.println("Задача 5");
            System.out.println();
            byte totalKraska = 120;
            byte whiteKraska = 2;
            byte brownKraska = 4;
            int klassKraska = whiteKraska + brownKraska;
            int klass = totalKraska / klassKraska;
            int whiteKraska2 = whiteKraska * klass;
            int brownKraska2 = brownKraska * klass;
            System.out.println("В школе, где " + klass +  " классов, нужно " + whiteKraska2 +
                    " банок белой краски и " + brownKraska2 +" банок коричневой краски»");
            System.out.println();
        }
        public static void task6(){
            System.out.println("Задача 6");
            System.out.println();
            int banans = 5 * 80;
            short milk = 105 * 2;
            short iceCream = 2 * 100;
            short eeg = 4 * 70;
            int allProdukts = banans + milk + iceCream + eeg;
            double allProdukts2 = allProdukts / 1000d;
            System.out.println(allProdukts+ " грамм");
            System.out.println(allProdukts2+ " кг.");
            System.out.println();
        }
        public static void task7(){
            System.out.println("Задача 7");
            System.out.println();
            int totalWeight = 7 * 1000;
            short weight1 = 250;
            short weight2 = 500;
            int day1 = totalWeight / weight1;
            int day2 = totalWeight / weight2;
            System.out.println(day1 + " дней");
            System.out.println(day2 + " дней");
            int day3 = (day1 + day2) / 2;
            System.out.println(day3 + " день");
            System.out.println();
            //Представим, что мы работаем в большой компании, штат которой состоит из
            // нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает
            // в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании
            // дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение
            // составляет 10% от текущей зарплаты.
            //
            //К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
            // а также провести расчет для следующих сотрудников:
            //
            //Маша получает 67 760 рублей в месяц.
            //Денис получает 83 690 рублей в месяц.
            //Кристина получает 76 230 рублей в месяц.
            //Каждому нужно увеличить зарплату на 10% от текущей месячной.
            // Дополнительно руководитель попросил посчитать разницу между
            // годовым доходом с нынешней зарплатой и после повышения.
            //
            //Посчитайте, сколько будет получать каждый из сотрудников,
            // а также разницу между годовым доходом до и после повышения.
            //
            //Выведите в консоль информацию по каждому сотруднику.
            // Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».

        }
        public static void task8(){
            System.out.println("Задача 8");
            System.out.println();
            int masha = 67_760;
            int denis = 83_690;
            int kristina = 76_230;
            double masha2 = masha * 1.1;
            double denis2 = denis * 1.1;
            double kristina2 = kristina * 1.1;
            System.out.println();
            double rasnMasha = (masha2 * 12) - (masha * 12);
            double rasnDenis = (denis2 * 12) - (denis * 12);
            double rasnKristina = (kristina2 * 12) - (kristina * 12);
            System.out.println("Маша теперь получает " + masha2 + " рублей." +
                    " Годовой доход вырос на " + rasnMasha + " рублей");
            System.out.println("Денис теперь получает " + denis2 +  " рублей." +
                            " Годовой доход вырос на " + rasnDenis + " рублей");
            System.out.println( "Кристина теперь получает " + kristina2 + "рублей." +
                    " Годовой доход вырос на " + rasnKristina + " рублей");

        }


}