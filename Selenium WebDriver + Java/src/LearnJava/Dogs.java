package LearnJava;

public class Dogs extends Animals {
    @Override
    public void saySmth() {
        System.out.println("Gav gav!");
    }

    @Override
    public void eat() {
        System.out.println("I like my food!");
    }

    public void  sit(){
        System.out.println("I'm sitting.");
    }
}
