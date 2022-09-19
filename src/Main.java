public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = 3.5 * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксёров " + totalWeight + " кг");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");
        var dividingNumbers = secondBoxer % firstBoxer;
        System.out.println("Разница между весами бойцов полученная путем остатка от деления " + dividingNumbers + " кг");
        var totalWorkingTime = 640;
        var employeeTime = 8;
        var totalEmployees = totalWorkingTime / employeeTime;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        System.out.println(totalEmployees);
        var newWorkingHours = totalWorkingTime / totalEmployees;
        System.out.println("Если в компании работает 174 человека, то всего по " + newWorkingHours + " часа работы может быть поделено между сотрудниками");










    }
}