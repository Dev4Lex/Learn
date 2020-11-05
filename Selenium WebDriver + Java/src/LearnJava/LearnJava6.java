package LearnJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnJava6 {
    public static void main(String[] args) {
        //коллекция List - динамические размеры массива
        List<Integer> list = new ArrayList<>(); //интерфейс List; <> - класс объектов; ArrayList<>() - реализация List

        list.add(5); //add() - метод, позволяющий добавлять элементы в список
        list.add(10);
        list.add(9);

        int a = list.get(2);

        System.out.println(list.get(1)); // get() - получение элемента по его индексу
        System.out.println(a);

        list.set(2,100); //присвоение значения 100 элементу с индексом 2
        System.out.println(list.get(2));

        System.out.println();
        System.out.println(list.get(1));
        list.remove(1); //удаление элемента по индексу
        System.out.println(list.get(1));
        System.out.println(list.size()); //вывод размера списка

        //list.clear(); //очистка списка
        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(56);

        System.out.println();
        System.out.println(list.size());
        list.addAll(list2); //добавление списку list элементов списка list2
        System.out.println(list.size());

        list.removeAll(list2); //удаляет из списка list элементы списка list2

        System.out.println(list.isEmpty()); //проверка на пустое значение
        //list.clear();
        System.out.println(list.isEmpty());

        System.out.println(list.contains(100)); //проверка содержится ли 100 в list

        System.out.println();
        list.addAll(list2);
        System.out.println(list.containsAll(list2)); //содержатся ли элкменты списка list2 в списке list

        //итератор
        Iterator<Integer> iterator = list.iterator(); //интерфейс, который позволяет работать с элементами списка/коллекции
        System.out.println(iterator.next()); //nest() позволяет указывать на следующий элемент в списке
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext()); //позволяет узнать о существовании следующего элемента списка
        System.out.println();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
