package LearnJava;

public class LearnJava3 {
    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println(s.equals("Hello World!")); // .equals  - метод сравнения строк
        System.out.println(s.equals("Hello!"));
        String s2 = "Hello!";
        System.out.println(s.equals(s2));
        s = "text";
        s2 = "TEXT";
        System.out.println(s.equals(s2));

        s = "TeXt";
        System.out.println(s); //оригинальная строка
        System.out.println(s.toLowerCase()); //преобразование в строчные буквы
        System.out.println(s.toUpperCase()); //преобразование в заглавные буквы

        System.out.println(s.charAt(1)); //получение символа по его индексу в строке
        System.out.println(s.indexOf("t")); //найти индекс у части строки
        s = "Hellow World!";
        System.out.println(s.contains("Hello")); //содержится ли строка в строке
        System.out.println(s.contains("text"));
        System.out.println(s.length()); //длина строки

        System.out.println();
        System.out.println(s.startsWith("He")); //начинаетя ли строка с введенных данных
        System.out.println(s.startsWith("!"));
        System.out.println(s.endsWith("He")); //заканчивается ли строка на введенные данные
        System.out.println(s.endsWith("!"));

        s = "Hello, world";
        System.out.println();
        String[] array = s.split(","); //разделить строку; разделитель - запятая
        System.out.println(array[0] + "!" + array[1] + "!");
        System.out.println(array[0]);
        System.out.println(array[1]);

        String str = "My name is %s! I'm %d years old!"; //%s - строка, %d - число
        int age = 30;
        String name = "Ivan";
        System.out.println(String.format(str, name, age)); //форматирование строки
        System.out.println(String.format(str, "Vasya", 10));

        System.out.println();
        String age2 = "30";
        int a = Integer.parseInt(age2); //преобразование строки в целое число
        System.out.println(a * 3);

        s = "Hello, world!";
        System.out.println(s.substring(1,5)); //выделение части строки по диапазону индексов
        System.out.println(s.substring(7)); //обрезка с 7 инедса до конца строки
        System.out.println(s.substring(7, s.length() - 2)); //с 7 индекса и вычесть с конца 2 индекса

        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        String res;
        res = s1 + s2 + s3;
        System.out.println(res);
        res = s1.concat(s2).concat(s3); //операция контатенации (производительнее простого сложения строк)
        System.out.println(res);











    }
}
