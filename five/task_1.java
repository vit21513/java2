// 1 Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package five;

import java.util.HashMap;
import java.util.Map;
public class task_1 {

    public static void main(String[] args) {

        //
        Map<String, String> phoneboook = new HashMap<>();

        String[] listTelephone = {
                "Иван Иванов 892215131", "Светлана Петрова 8963614515", "Иван Мечников 898855915855", "Анна Мусина 899555666211",
                "Анна Крутова 89555414185", "Иван Юрин 858552156",
                "Петр Лыков 8965585652", "Павел Чернов 845655956", "Петр Чернышов 82552854252", "Иван Иванов 8458552811",
                "Марина Светлова 8451251515", "Мария Савина 8650123457",
                "Мария Рыкова 84555219656", "Иван Иванов 8456555956", "Анна Владимирова 8786955256", "Иван Мечников 825558855",
                "Петр Петин 812525555521", "Иван Ежов 81452565252" };



        for (int i = 0; i < listTelephone.length; i++) {
            String[] parts = listTelephone[i].split(" ");
            String nam = (parts[0] + " " + parts[1]);
            if (phoneboook.containsKey(nam)) {
                phoneboook.put(nam, phoneboook.get(nam) + " " + parts[2]);
            } else {
                phoneboook.put(nam, parts[2]);
            }

        }
        phoneboook.forEach((k, v) -> {System.out.printf("%s: %s%n", k, v);});

    }

}
