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

    public static void task1 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
}
    public static void task4 () {
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        System.out.println("Задача 6");
        var summFighters = firstFighterWeight + secondFighterWeight;
        System.out.println("Вес обоих бойцов " + summFighters + " кг!");
        var differeceFighters = secondFighterWeight % firstFighterWeight;
        System.out.println("Разница веса бойцов " + differeceFighters + " кг!");
    }
    public static void task7 () {
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        System.out.println("Задача 7");
        var differenceWeight = secondFighterWeight - firstFighterWeight;
        System.out.println("Разница веса бойцов " + differenceWeight + " кг!");
        var differenceWeght1 = secondFighterWeight % firstFighterWeight;
        System.out.println("Разница веса бойцов " + differenceWeght1 + " кг!");
    }
    public static void task8 () {
        var allTimes = 640;
        var everyoneWorkerHours = 8;
        var numbersCompany = allTimes / everyoneWorkerHours;
        System.out.println("Задача 8");
        System.out.println("Всего в компании - " + numbersCompany + " человек");
        numbersCompany = numbersCompany + 94;
        var newAllTimes = everyoneWorkerHours * numbersCompany;
        System.out.println("Если в компании работает " + numbersCompany + " человек, то всего " + newAllTimes + " часов работы может быть поделено между сотрудниками");

    }
}