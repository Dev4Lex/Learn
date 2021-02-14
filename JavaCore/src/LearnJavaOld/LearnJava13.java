package LearnJavaOld;

public class LearnJava13 {
    public static void main(String[] args) {
        //Принципы ООП - Наследование, Инкапсуляция
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Vasya";
        dog.name = "Barsik";

        cat.color = "White";
        dog.color = "Black";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat name is: " +cat.name);
        System.out.println("Dog name is: "+ dog.name);

        dog.var = 10;

        System.out.println(dog.getWeight()); //получения значения переменной weight через метод getter

        dog.sound();
        cat.sound();
    }
}
