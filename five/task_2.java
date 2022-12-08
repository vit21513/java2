package five;

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class task_2 {

    public static void main(String[] args) {

        Map<String, Integer> name = new HashMap<>();
        String[] lastName = {
                "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"
        };

        for (int i = 0; i < lastName.length; i++) {
            String[] parts = lastName[i].split(" ");
            if (name.containsKey(parts[0]))
                name.put(parts[0], name.get(parts[0]) + 1);
            else {
                name.put(parts[0], 1);
            }
        }

        Map<String, Integer> sortedMap = name.entrySet().stream().sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
                    throw new AssertionError();
                }, LinkedHashMap::new));

        sortedMap.forEach((k, v) -> {
            if (sortedMap.get(k) > 1) { // для вывода только повторяющихся имен т.е больше 1го
                System.out.printf("%s: %s%n", k, v);
            }
        });

    }

}
