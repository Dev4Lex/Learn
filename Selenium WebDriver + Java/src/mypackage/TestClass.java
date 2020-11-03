package mypackage; //класс находится в данном пакете

public class TestClass {   //имена у классов всегда с большой буквы; каждое новое слово с большой буквы
    public static void main(String[] args) {   //обязательный метод; точка входа в программу
        System.out.print("Hello world! ");    //Вывод на экран фразы Hello world!
        System.out.println("It's my first program"); //print - курсор не переходит на следующую строку;
        System.out.println("Good bye!");    //println - переходит на следущую строку после вывода фразы;

        //целочисленные типы данных
        byte a = 123; //могут хранить целочисленные значения от -128 до 127
        short b = 12345; //могут хранить целочисленные значения от -32768 до 32767
        int c;
        c = 1234567890; //могут хранить целочисленные значения от - 2  млрд до + 2 млрд
        long d = -122335544; //увеличенный int

        //однострочный комментарий
        /* многострочный комментарий */

        System.out.println(a); //вывод на экран значения переменной a
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        //вещественные типы данных
        double double1 = 133.155;
        System.out.println();
        System.out.println("double double1: " + double1);
        float float1 = 150.32f; //укороченный double; в конце нужно добавлять f
        System.out.println(float1);

        boolean boolean1 = true; //может хранить в себе true / false
        boolean boolean2 = false;
        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println();
        System.out.println(boolean3);
        System.out.println(boolean4);

        String str = "Hello"; //могут хранить в себе строки
        String str2 = "World!";
        String str3 = str + " " + str2; //сложение строк
        System.out.println(str3);

        char char1 = 'q'; //один символ в одинарных кавычках; от 0 до 65535
        System.out.println(char1);

        //названия переменных начинаются с маленькой буквы; последующие слова идут с большой
        String personName;
        int age;

    }
}
