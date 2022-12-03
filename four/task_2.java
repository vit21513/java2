package four;


// 2.Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди,
// - dequeue() - возвращает первый элемент из очереди и удаляет его,
// - first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task_2 {

    public static void main(String args[])

    {
        LinkedList<Integer> list_num = new LinkedList<>();

        for (int i = 0; i < 20; i++) { // размер списка 20
            list_num.add(getRandomNumber());

        }
        System.out.println("Список до сортировки");
        System.out.println(list_num + "\n");
        System.out.println("Список после добавления элемента");
        enqueue(list_num, 999);                   //помещаем элемент в конец очереди,
        System.out.println(list_num+ "\n");
        System.out.println("возвращаем первый элемент из очереди и удаляем его");
        System.out.println(dequeue(list_num));     // возвращаем первый элемент из очереди и удаляем его
        System.out.println(list_num+ "\n");
        System.out.println("возвращаем первый элемент из очереди, не удаляя его");
        System.out.println(first(list_num));         // возвращаем первый элемент из очереди, не удаляя его
        System.out.println(list_num);


    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

    public static void enqueue(LinkedList<Integer> list_n, Integer num) {

        list_n.add(num);}
        

     public static int dequeue(LinkedList<Integer> list_n) {

            return list_n.pop();}

            
    public static int first(LinkedList<Integer> list_n) {

            return list_n.peek();}        

    
}
