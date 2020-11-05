package LearnJava;

public class LearnJava9 {
    public static void main(String[] args) {
        //Методы
        int a = 13;
        int b = 3;
        int sum;

        sum = getSum(a, b);
        System.out.println(sum);

        showSum(10,51,77);

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
}
