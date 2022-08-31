public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1.1 ");
        int age = 6;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println(" Возраст совершеннолетия еще не наступил, нужно еще подождать");
        }

        System.out.println("Задача 1.2 ");
        int agePeople = 24;
        boolean goToSchool = agePeople >= 7 && agePeople < 18;
        boolean goToUniversity = agePeople >= 18 && agePeople < 24;
        boolean goToJob = agePeople >= 24;
        if (goToSchool) {
            System.out.println("Ребенок ходит в школу ");
        }
        if (goToUniversity) {
            System.out.println("Человек закончил школу и может отправляться в университет ");
        }
        if (goToJob) {
            System.out.println(" Человек окончил университет и ему пора искать новую работу");
        }

        System.out.println("Задача 1.3 ");
        int passenger = 105;
        int total = 102;
        int sitPlace = 60;
        if (passenger < sitPlace) {
            System.out.println(" В Вагоне остались сидячие и стоячие места");
        }
        if (passenger >= sitPlace && passenger <= total) {
            System.out.println(" В вагоне остались стоячие места");
        }
        if (passenger >= total) {
            System.out.println(" В вагоне мест нет");
        }
    }

    public static void task2() {

        System.out.println("Задача 2.1 ");
        int age = 24;
        if (age >= 18) {
            System.out.println(" Поздравляю с совершеннолетием!");
        } else {
            System.out.println(" Возраст совершеннолетия еще не наступил, нужно еще подождать");
        }

        System.out.println("Задача 2.2 ");

        int agePeople = 7;
        boolean goToSchool = agePeople >= 7 && agePeople < 18;
        boolean goToUniversity = agePeople >= 18 && agePeople < 24;
        boolean goToJob = agePeople >= 24;
        if (goToUniversity || goToJob || agePeople <= 6) ;
        else {
            System.out.println("Ребенок ходит в школу ");
        }
        if (goToSchool || goToJob || agePeople <= 6) ;
        else {
            System.out.println("Человек закончил школу и может отправляться в университет ");
        }
        if (goToSchool || goToUniversity || agePeople <= 6) ;
        else {
            System.out.println(" Человек окончил университет и ему пора искать новую работу ");
        }

        System.out.println("Задача 2.3 ");

        int passenger = 60;
        int total = 102;
        int sitPlace = 60;
        if (passenger >= sitPlace) ;
        else {
            System.out.println(" В Вагоне остались сидячие и стоячие места");
        }
        if (passenger < sitPlace || passenger >= 102) ;
        else {
            System.out.println(" В вагоне остались стоячие места");
        }
        if (passenger < total) ;
        else {
            System.out.println(" В вагоне мест нет");
        }
    }


        public static void task3() {
            System.out.println("Задача 3.1");

            int age = 25;
            boolean baby = age >= 2 && age <= 6;
            boolean kinder = age >= 7 && age <= 18;
            boolean teenager = age > 18 && age <= 24;
            boolean adult = age > 24;
            String i = "Если возраст человека равен ";
            String j = ", то ему нужно ходить";
            if (kinder || teenager || adult);
            else {
                System.out.println(i + age + j + " в детский сад");
            }
            if (baby || teenager || adult);
            else {
                System.out.println(i + age + j + " в школу");
            }
            if (baby || kinder || adult);
            else {
                System.out.println(i + age + j + " в университет");
            }
            if (baby || kinder || teenager);
            else {
                System.out.println(i + age + j + " на работу");
            }

            System.out.println("Задача 3.2");

            int agePeople =



        }


        }







