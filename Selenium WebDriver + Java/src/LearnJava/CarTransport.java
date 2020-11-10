package LearnJava;

public class CarTransport implements Transport, InterfaceTest { //через implements реализовали Transport и InterfaceTest
    @Override //реализация методов интерфейса
    public void go() {
        System.out.println("We are driving!");

    }

    @Override //реализация методов интерфейса
    public void stop() {
        System.out.println("We are driving slower!");
    }

    @Override
    public void method1() {
        System.out.println("test1");
    }

    @Override
    public void method2() {
        System.out.println("test2");
    }
}
