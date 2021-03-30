package LearnJavaOld;

public class Plane implements Transport {
    @Override //реализация методов интерфейса
    public void go() {
        System.out.println("We are flying on a plane!");
    }

    @Override //реализация методов интерфейса
    public void stop() {
        System.out.println("We are landing!");
    }

    public void setSpeed(int speed){
        System.out.println("Our speed is: " + speed);
    }
}
