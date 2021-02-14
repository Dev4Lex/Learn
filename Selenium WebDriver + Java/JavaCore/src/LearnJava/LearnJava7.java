package LearnJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnJava7 {
    public static void main(String[] args) {
        //коллекция Set - хранит в себе уникальные значения (множество объектов, нет индекса)
        Set<Integer> set = new HashSet<>();
        set.add(10); //метод добавления объектов
        set.add(11);
        set.add(12);
        System.out.println(set.size()); //размер сета
        set.remove(11); //удаление значения 11

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //set.clear();
        System.out.println(set.size());

        System.out.println();
        for (int i : set){
            System.out.println(i);
        }

        System.out.println(set.contains(10)); //содержится ли объект в set
        System.out.println(set.contains(13));
    }
}
