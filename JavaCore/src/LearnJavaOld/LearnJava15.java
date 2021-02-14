package LearnJavaOld;

public class LearnJava15 {
    public static void main(String[] args) {
        CarTransport car = new CarTransport();
        Plane plane = new Plane();

        car.go();
        car.stop();
        car.method1();
        car.method2();

        plane.go();
        plane.stop();
        plane.setSpeed(500);
    }
}
