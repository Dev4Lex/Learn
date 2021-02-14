package LearnJavaOld;

public class LearnJava11 {
    public static void main(String[] args) {
        //Исключения - ошибки, которые могут возникать при работе программы
        try { //попытка выполнения
            devide(10, 0);
        } catch (ArithmeticException e) { //выполняется в случае ошибки
            e.printStackTrace();
        }
        finally { //выполнятся в любом случае; опционально
            System.out.println("");
        }
        }

        public static void devide ( int a, int b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException("Cannot devide by zero!"); //исключение с сообщением об ошибке
            } else {
                System.out.println("Result is: " + a / b);

            }
        }
    }
