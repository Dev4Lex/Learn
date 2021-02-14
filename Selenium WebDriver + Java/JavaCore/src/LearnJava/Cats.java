package LearnJava;

public class Cats extends Animals {

    @Override
    public void saySmth() {
        System.out.println("Mew mew");
    }

    @Override
    public void eat() {
        System.out.println("I like Milk!");
    }
}
