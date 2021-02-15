public class Arrays {

    /*
    Массив — это структура данных, в которой хранятся элементы одного типа.
     */

    public static void main(String[] args) {

        //Объявили и создали массив. Java выделила память под массив из 3 строк, и сейчас в каждой ячейке записано значение null (поскольку строка — ссылочный тип)
        String[] names;
        names = new String[3];

        String[] name = new String[3]; //краткая запись
        int[] arr = new int[10]; //можем хранить 10 элементов типа int

        name[0] = "Vasya"; //индексация элементов в массиве начинается с 0
        name[1] = "Petya";
        name[2] = "Vanya";
        System.out.println(name[0]); // -> "Vasya"
        System.out.println(name[2]); // -> "Vanya"

        arr[3] = 15; //указали значение "15" четвертому элементу массива
        arr[3] = 10; //переопределили значение четвертого элемента на "10"
        System.out.println(arr[3]); // -> "10"

        int[] array = {15, 10, 100, 9, 44}; //создали массив из 5 элементов и сразу указали значения
        System.out.println(array[0]); // -> "15"
        System.out.println(array[1]); // -> "10"
        System.out.println(array[4]); // -> "44"

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);      //цикл вывода массива из 5 элементов: c 0 по 4
        }

        int[] arr2 = new int[15];
        for (int j = 0; j < 15; j++) {
            arr2[j] = j * 10;                 //цикл вывода массива из 15 элементов: с 0 по 14 + умножение их на 10
            System.out.println(arr2[j]);
        }

        System.out.println(arr2.length);   //размер массива
        System.out.println(arr2[arr2.length - 1]); //вывод последнего элемента массива
    }
}

