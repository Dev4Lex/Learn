package LearnJava;

public class LearnJava14 {
    public static void main(String[] args) {
        //Абстрактные классы

        Dogs dog = new Dogs();
        Cats cat = new Cats();

        dog.walk("Park");
        dog.saySmth();

        cat.walk("Backyard");
        cat.eat();
    }
}
