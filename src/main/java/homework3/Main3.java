package homework3;
import java.util.*;



public class Main3 {
//    1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//    Посчитать сколько раз встречается каждое слово.
//
//    2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//    В этот телефонный справочник с помощью метода add() можно добавлять записи.
//    С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть
//    несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

    public static void main(String[] args) {

        List<String> colors = Arrays.asList("Red", "Blue", "Green", "Green", "Black", "Red",
                "Yellow", "Orange", "Magenta", "Magenta", "Magenta");

        System.out.println("Исходный список:");
        for (String s: colors) {
            System.out.println(s);
        }

        System.out.println("\nКоличество повторов:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : colors) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : wordsCount.entrySet()) {
            System.out.println(e.getKey() + " — " + e.getValue());
        }

        System.out.println("\nСписок без повторов: ");
        Set<String> unique = new HashSet<>(colors);
        for (String s: unique) {
            System.out.println(s);
        }
    }

}
