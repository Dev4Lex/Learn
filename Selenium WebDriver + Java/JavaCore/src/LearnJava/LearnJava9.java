package LearnJava;

import java.sql.SQLOutput;

public class LearnJava9 {
    public static void main(String[] args) {
        //Методы
        int a = 13;
        int b = 3;
        int sum;

        sum = getSum(a, b);
        System.out.println(sum);

        showSum(10,51,77);
        saySmth();
        saySmth();

        sayHello("Petya");
        String name = "Vasya";
        sayHello(name);

        showSumToPerson("Vanya", 15,11,33);

    }

    static int getSum(int x, int y) {   //статичный метод getSum, 2 числа на входе
        int sum;
        sum = x + y;
        return sum; //возвращение значения sum
    }

    static void showSum(int x, int y, int z) {       //void - метод не возвращает значения
        int sum = x + y + z;
        System.out.println("Sum is: " + sum);
    }

    static void saySmth() {  //метод может не принимать параметры
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println();
        System.out.println("Hello " + name + "!");
    }

    static void showSumToPerson(String name, int a, int b, int c) {
        System.out.println("Start of program!");
        sayHello(name);
        showSum(a,b,c);
        System.out.println("End of program!");
    }
}
