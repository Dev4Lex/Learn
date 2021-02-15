public class DataTypes {

    public static void main(String[] args) {

        //Целочисленные типы данных
        byte a = 123; //Разрядность 8 бит; могут хранить целочисленные значения от -128 до 127
        short b = 12345; //Разрядность 16 бит; могут хранить целочисленные значения от -32768 до 32767
        int c = 1234567890;; //Разрядность 32 бит; могут хранить целочисленные значения от -2147483648 до 2147483647
        long d = -1223355344; //Разрядность 64 бит; увеличенный int; от -9223372036854775808 до 9223372036854775807

        //Вещественные типы данных (типы данных с плавающей точкой)
        double double1 = 133.155; //Разрядность 64 бит
        float float1 = 150.32f; //Разрядность 32 бит; укороченный double; в конце нужно добавлять f

        //Логический тип данных
        boolean boolean1 = true; //может хранить в себе true / false
        boolean boolean2 = false;
        System.out.println(boolean1); // -> "true"
        System.out.println(boolean2); // -> "false"

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println(boolean3); // -> "true"
        System.out.println(boolean4); // -> "false"

       //Символьный тип данных
        char char1 = 'q'; //Разрядность 16; один символ в одинарных кавычках либо число от 0 до 65535
        char char2 = 102; //102 в Unicode (UTF-16)
        System.out.println(char1); // -> "q"
        System.out.println(char2); // -> "f"

        //Названия переменных начинаются с маленькой буквы; последующие слова идут с большой
        int personAge;
        int age;


        //Ссылочные типы данных
        class Human {
            Human friend = new Human(); //в объекте хранится ссылка
            Human mom;
            Human dad;
            Human car = null;
        }

        String text = new String("Hello");
        //String text = "Hello"; Равнозначное написание

    }
}
