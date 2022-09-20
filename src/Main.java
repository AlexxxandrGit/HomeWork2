public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задание 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Задание 3
        System.out.println("Задача 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper -7639;
        System.out.println(paper);

        //Задание 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задание 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задание 6
        System.out.println("Задание 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксёров " + totalWeight + " кг");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");

        //Задание 7
        System.out.println("Задание 7");
        System.out.println("Разница между весами бойцов. 1 способ " + weightDifference + " кг");
        var dividingNumbers = secondBoxer % firstBoxer;
        System.out.println("Разница между весами бойцов полученная путем остатка от деления. 2 способ " + dividingNumbers + " кг");

        //Задание 8
        System.out.println("Задание 8");
        var totalWorkingTime = 640;
        var employeeTime = 8;
        var totalEmployees = totalWorkingTime / employeeTime;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        var newTotalWorkingTime = totalEmployees * employeeTime;
        System.out.println("Если в компании работает " + totalEmployees + "человека, то " + newTotalWorkingTime + "часа работы может быть поделено между сотрудниками ");











    }
}