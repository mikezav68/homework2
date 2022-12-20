import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // задачи 1-3
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задача 4
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // задача 5
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Вес бойца 1 - " + boxer1 + " кг");
        System.out.println("Вес бойца 2 - " + boxer2 + " кг");
        var boxersWeight = 0.0;
        boxersWeight = boxer1 + boxer2;
        System.out.println("Общий вес бойцов - " + boxersWeight + " кг");
        // задача 7
        var boxersDifference = 0.0;
        boxersDifference = boxer2 - boxer1;
        System.out.println("Разница в весе первым способом - " + boxersDifference + " кг");
        boxersDifference = boxer2 % boxer1;
        System.out.println("Разница в весе вторым способом - " + boxersDifference + " кг");
        // задача 8
        var allTime = 640;
        var workers = 0;
        var workerTime = 8;
        workers = allTime / workerTime;
        System.out.println("Всего работников - " + workers + " человек");
        workers = workers + 94;
        allTime = workers * workerTime;
        System.out.println("Если в компании работает " + workers + " чел, то всего " + allTime + " часов работы может быть поделено между сотрудниками");
    }
}