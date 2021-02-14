package LearnJavaOld;

public class LearnJava2 {
    public static void main(String[] args) {
        //простые операции и логические операторы
        int a;
        a = 10;
        a = 20;
        System.out.println(a);

        int b = a;
        System.out.println(b);
        int c,d;
        c = d = b; //множественное присвоение
        System.out.println(c + " " + d);

        a = 13;
        b = 5;
        System.out.println(a+b); //сложение
        System.out.println(a-b); //вычитание
        System.out.println(a*b); //умножение
        System.out.println(a/b); //деление
        double e = 15;
        double f = 7;
        System.out.println(e/f);
        System.out.println(a%b); //получение остатка от деления

        a = b + c * d; //приоритет: *,/,+,- либо через скобки
        System.out.println(a);

        //операции сравнения
        a = 15;
        b = 10;
        System.out.println(a>b); //больше
        System.out.println(a<b); //меньше
        System.out.println(a - 5 >= b); // больше или равно
        System.out.println(a - 5 <= b); // меньше или равно
        System.out.println(a == b); //равно
        System.out.println(a != b); //не равно
        System.out.println(!(a>b)); //отрицание

        int i = 0;
        i++; //операция инкремента i = i + 1
        System.out.println(i);
        i--; //операция декремента i = i - 1
        System.out.println(i);
        i++; //постфиксная форма; сначала выведение на экран, потом +1
        ++i; //префиксная форма; сначала +1, потом вывод на экран
        i = 3;
        a = i++;
        System.out.println(a);
        i = 3;
        a = ++i;
        System.out.println(a);

        a = 10;
        b = 20;
        //булевские операции
        System.out.println(a > b || a < b); //операция ИЛИ ( верно либо 1 условие, либо 2 условие)
        System.out.println(a>b && a < b); //операция И (должны быть верны оба условия)
        System.out.println(a > 9 && b == 20);
        System.out.println(a + 10 > 15 || b - 5 > 10 && a < b); //приоритет арифметика, сравнение, булевы операции (сначала &&, затем ||)

        a = 9;
        System.out.println(Math.sqrt(a)); //класс Math, функция sqrt (взятие корня)
        System.out.println(Math.pow(a,3)); //возведение в степень

        //комбинированные операции
        a = 10;
        a += 5; //a = a + 5
        System.out.println(a);
        a -=5; //a= a - 5
        a *= 5; //a = a * 5
        a /= 5; //a= a / 5
        a %= 3; //a = a % 3
        System.out.println(a);




    }
}
