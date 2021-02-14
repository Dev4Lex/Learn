package LearnJavaOld;

public class LearnJava5 {
    public static void main(String[] args) {
        //циклы
        //for
        System.out.println("Start program");
        for (int i = 0; i < 5; i++) {  //int i = 0 - счетчик; i < 5 - условие выполнения; i++ - увеличение счетчика
            System.out.println(i);
        }

        System.out.println("End program");
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i * 2;
        }

        for ( int i = 0; i < 10; i++) {
            System.out.println("Element with index " + i + " is: " + array[i]);
        }
        //foreach
        System.out.println();
        for (int element : array) {  //перебор элкментов массива; каждая новая итерация принимает следующее значение
            System.out.println(element);
        }
        //while; сначала провера, потом действие
        System.out.println();
        int i = 0;
        boolean bool = true;
        while (bool){
            System.out.println("While: " + i);
            i++;
            if (i == 5) bool = false;
        }
         //do-while; сначала действие, потом проверка
        System.out.println();
        i = 5;
        do {
            System.out.println("Do: " + i);
            i++;
        } while ( i < 5);


    }
}
