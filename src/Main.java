public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Задача 1");
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
        }
        public static void task2(){
            System.out.println("Задача 2");
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

        }
        public static void task3(){
            System.out.println("Задача 3");
            byte ludmilsPavlovna = 23;
            byte annaSergeevna = 27;
            byte ekaterinaAndreevna = 30;
            short paper = 480;
            int totalStudents = ludmilsPavlovna + annaSergeevna + ekaterinaAndreevna;
            int paperStudents = paper / totalStudents;
            System.out.println("На каждого ученика рассчитано " + paperStudents + " листов бумаги.");
        }
        public static void task4(){
            System.out.println("Задача 4");
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


        }
        public static void task5(){
            System.out.println("Задача 5");
            byte totalKraska = 120;
            byte whiteKraska = 2;
            byte brownKraska = 4;
            int klassKraska = whiteKraska + brownKraska;
            int klass = totalKraska / klassKraska;
            int whiteKraska2 = whiteKraska * klass;
            int brownKraska2 = brownKraska * klass;
            System.out.println("В школе, где " + klass +  " классов, нужно " + whiteKraska2 +
                    " банок белой краски и " + brownKraska2 +" банок коричневой краски»");
        }

}