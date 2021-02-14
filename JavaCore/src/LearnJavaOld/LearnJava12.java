package LearnJavaOld;

public class LearnJava12 {
    public static void main(String[] args) {
        //Классы и объекты; Конструктор класса

        Car car1 = new Car();
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);

        Car car2 = new Car();
        car2.color = "White";
        Car car3 = new Car();
        car3.color = "Red";

        car2.drive(100);
        car3.drive(150);

        System.out.println(Car.var); //обращение к статичной переменной var класса Car
        Car.var = 100; //присвоение значения 100 переменной var класса Car
        System.out.println(car1.var); //вывод значения объекта класса Car
        System.out.println(car2.var);
        System.out.println(car3.var);

        Car.method();
        String.format("New %s string", "string");




        Car car4 = new Car("Black");
        System.out.println("Car color is: " + car4.color);

        Car car5 = new Car("Red", 2100, 2000, 5100);
        System.out.println(car5.color + " " + car5.height + " " + car5.width + " " + car5.length);



    }
}
