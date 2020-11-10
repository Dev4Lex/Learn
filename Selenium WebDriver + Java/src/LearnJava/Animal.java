package LearnJava;

public class Animal {
    String name;
    String color;

    public int var; //модификатор доступа public - доступ к переменной во всей программе
    private int var1; //модификатор доступа private - доступ только внутри класса
    protected  int var2; //модификатор доступа protected - доступ в своем классе + класс наследние
    int var3; //модификатор доступа package - доступ внутри пакета

    public void walk(String place) {
        System.out.println("We are walking here: " + place);
    }

    public void sleep() {
        System.out.println("Zzzz");
    }

    public void sound(){
        System.out.println("Hello!");
    }
}
