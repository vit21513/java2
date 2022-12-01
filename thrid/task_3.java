
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;


public class task_3 {

    public static void main(String[] args) {
        ArrayList<Integer> list_num = new ArrayList<>();

        for (int i = 0; i < 20; i++) { // 20 размер списка
            list_num.add(getRandomNumber());
        }
        /// до сортировки
        for (Integer o : list_num) {
            System.out.printf("%d ", o);
        }
        System.out.println("\n");
        int sum = 0;

        for (int i = 0; i < list_num.size(); i++) {
            sum += list_num.get(i);
        }
        int average = sum / list_num.size();
        ArrayList<Integer> temp = list_num; // делаю копию списка, чтобы не изменять исходный
        temp.sort(null);
        System.out.printf("среднее значение составляет : %d ", average);
        System.out.println("\n");
        System.out.printf("минимальное  значение составляет : %d ", temp.get(0));
        System.out.println("\n");
        System.out.printf("Максимальное  значение составляет : %d ", temp.get(list_num.size() - 1));

    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

}
