
// 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package four;

import java.util.Deque;
import java.util.LinkedList;

public class task_1 {

    public static void main(String args[])

    {
        LinkedList<Integer> list_num = new LinkedList<>();

        for (int i = 0; i < 20; i++) {                       // размер списка 20
            list_num.add(getRandomNumber());
        }
        System.out.println("Список до сортировки");
        System.out.println(list_num + "\n");
        reversList(list_num);
        System.out.println("Список после сортировки");
        System.out.println(list_num + "\n");

    }

    public static void reversList(LinkedList<Integer> list_n) {

        Deque<Integer> temp = new LinkedList<>(list_n);
        list_n.clear();
        int len = temp.size();
        for (int i = 0; i < len; i++) {
            list_n.add(temp.pollLast());
        }
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
