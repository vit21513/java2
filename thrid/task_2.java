import java.util.ArrayList;
import java.util.Iterator;

//Пусть дан произвольный список целых чисел, удалить из него четные числа

public class task_2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber());
        }
     
        System.out.println("список  до сортировки: \n");
        for (Integer o : list) {
            System.out.printf(" %d ", o);
        }
        // System.out.println("\n");

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("\n");
        System.out.println("список после удаления четных элементов: \n");

        for (Integer o : list) {
            System.out.printf(" %d ", o);
        }
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

}
