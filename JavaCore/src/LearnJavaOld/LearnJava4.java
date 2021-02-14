package LearnJavaOld;

public class LearnJava4 {
    public static void main(String[] args) {
        //условные операторы

        int i = 7;
        System.out.println("Start of program");

        if (i > 10) {   //if (условие:true или false) {список команд при true}
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        }
        else if (i < 10 && i > 5) {         //else {список команд} - выполняется, если условие if ложно
            System.out.println("i < 10 and i > 5");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("Nothing");
        }

        System.out.println("End of program");

        System.out.println();
        i = 60;
        if (i > 50) {
            System.out.println("i > 50");
            if (i > 90){
                System.out.println("i > 90");
            }
            else {
                System.out.println("i <= 90");
            }
        }
        else {
            System.out.println("i <= 50");
        }

        System.out.println();
        i = 10;
        switch (i) {  //оператор множественного выбора; проверка равенства на значения
            case 1:
                System.out.println("The number is 1");
                break; //прерывание проверки после совпадения значений
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
            default:   //необязательный ператор; если ни один из кейсов не совпал
                System.out.println("I don't know the number!");
        }




    }
}
