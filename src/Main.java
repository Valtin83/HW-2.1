public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача №1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача №2");
        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);
        System.out.println("Задача №3");
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        System.out.println(friend + 2);
        System.out.println((friend +2)/7);
        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        System.out.println(frog * 10);
        System.out.println((frog *10)/3.5);
        System.out.println(((frog * 10)/3.5)+4);
        System.out.println("Задача №6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println(firstBoxer + secondBoxer + " кг.");
        System.out.println(secondBoxer - firstBoxer + " кг.");
        System.out.println("Задача №7");
        System.out.println(secondBoxer % firstBoxer);
        System.out.println("Задача №8");
        var openingHours = 640;
        var workingHours = 8;
        System.out.println("Всего работников в компании " + openingHours / workingHours + " человек.");
        System.out.println("Если в компании работает " + (openingHours / workingHours + 94) + " человек, то всего " + ((openingHours / workingHours + 94) * 8) + " часов работы может быть поделено между сотрудниками.");

    }
}