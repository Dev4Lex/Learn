package LearnJavaOld;

public class Cat extends Animal { //класс Cat наследуется от класса Animal

    public void feed(String feed) {
        System.out.println("I like: " + feed);
    }

    @Override //аннотация дл переопределения метода
    public void sound(){
        System.out.println("Mew mew mew!");
    }
}
