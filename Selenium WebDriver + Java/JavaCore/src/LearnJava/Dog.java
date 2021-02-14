package LearnJava;

public class Dog extends Animal { //класс Dog наследуется от класса Animal

    private int weight = 2;

    public int getWeight() {    //получить значение переменной вне класса
        return weight;
    }

    public void setWeight(int weight) {   //задать новое значение переменной
        this.weight = weight;
    }

    public void sit() {
        System.out.println("I'am sitting");
        var = 20;
    }

    public void lay() {
        System.out.println("I'am laying");
    }
}
