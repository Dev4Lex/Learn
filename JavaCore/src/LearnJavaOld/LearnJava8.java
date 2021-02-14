package LearnJavaOld;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LearnJava8 {
    public static void main(String[] args) {
        //коллекция Map - ключ:значение
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Black");  //добавляение элемента в map (ключ, значение); ключи уникальные
        map.put(2,"White");
        map.put(3,"Yellow");
        map.put(10,"Green");


        System.out.println(map.get(1));
        System.out.println(map.get(10));

        System.out.println(map.size()); //получить размер map
//        map.clear(); //очистить map
        System.out.println(map.size());

        System.out.println(map.containsKey(90)); //есть ли в map ключ 90
        System.out.println(map.containsValue("Green")); //есть ли в map значение 10

        System.out.println();
        Set<Integer> keys = map.keySet(); //получить set всех ключей из map
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }

        map.put(2,"Yellow");
        System.out.println(map.get(2));

        Map<String, String> map2 = new HashMap<>();
        map2.put("Vasya", "Frolov");
        map2.put("Petya", "Gromov");
        System.out.println(map2.get("Petya"));


    }
}
