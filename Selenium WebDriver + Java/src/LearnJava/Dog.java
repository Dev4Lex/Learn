package LearnJava;

public class Dog extends Animal { //класс Dog наследуется от класса Animal

    int weight;

    public void sit(){
        System.out.println("I'am sitting");
    }

    public void lay() {
        System.out.println("I'am laying");
    }
}
