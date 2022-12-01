
// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class task_1 {

    public static void main(String args[])

    {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber();

        }
        System.out.printf("До сортировки %s",Arrays.toString(array));
        System.out.print("\n");
        mergeAndSor(array, 0, array.length - 1);
        System.out.printf("После сортировки %s",Arrays.toString(array));
    }

    public static void mergeAndSor(int[] array, int start, int end) {
        if (end <= start)
            return;

        int mid = (start + end) / 2;
        mergeAndSor(array, start, mid);
        mergeAndSor(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    public static int getRandomNumber() { 
                double x = (Math.random() * 99);
                int num = (int) x;
                return num;
            }

    public static void merge(int[] array, int start, int mid, int end) {

        int left[] = new int[mid - start + 1];
        int righ[] = new int[end - mid];

        for (int i = 0; i < left.length; i++)
            left[i] = array[start + i];
        for (int i = 0; i < righ.length; i++)
            righ[i] = array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = start; i < end + 1; i++) {

            if (leftIndex < left.length && rightIndex < righ.length) {
                if (left[leftIndex] < righ[rightIndex]) {
                    array[i] = left[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = righ[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < left.length) {

                array[i] = left[leftIndex];
                leftIndex++;
            } else if (rightIndex < righ.length) {

                array[i] = righ[rightIndex];
                rightIndex++;
            }

        }

    }

}