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
        var FirstBoxer = 78.2;
        var SecondBoxer = 82.7;
        var TotalWeight = FirstBoxer + SecondBoxer;
        System.out.println("Общий вес боксёров " + TotalWeight + " кг");
        var WeightDifference = SecondBoxer - FirstBoxer;
        System.out.println("Разница между весами бойцов " + WeightDifference + " кг");
        var DividingNumbers = SecondBoxer % FirstBoxer;
        System.out.println("Разница между весами бойцов полученная путем остатка от деления " + DividingNumbers + " кг");
        var TotalWorkingTime = 640;
        var EmployeeTime = 8;
        var TotalEmployees = TotalWorkingTime / EmployeeTime;
        System.out.println("Всего работников в компании " + TotalEmployees + " человек");
        TotalEmployees = TotalEmployees + 94;
        System.out.println(TotalEmployees);
        var NewWorkingHours = TotalWorkingTime / TotalEmployees;
        System.out.println("Если в компании работает 174 человека, то всего по " + NewWorkingHours + " часа работы может быть поделено между сотрудниками");










    }
}