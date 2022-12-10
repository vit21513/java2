
import java.util.ArrayList;

public class notebook {

    int id;
    String manufacturer;
    String model;
    int ram;
    int capacity_hdd;
    String os;
    String color;

    public notebook(int id, String manufacturer, String model, int ram, int capacity_hdd, String os, String color) {

        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.ram = ram;
        this.capacity_hdd = capacity_hdd;
        this.os = os;
        this.color = color;

    }

    public String toString() {

        return "id: " + id + "\n" +
                "Производитель: " + manufacturer + "\n" +
                "Модель: " + model + "\n" +
                "Размер ОЗУ : " + ram + " Gb" + "\n" +
                "Емкость жесткого диска : " + capacity_hdd + " Gb" + "\n" +
                "Операционная система: " + os + "\n" +
                "цвет: " + color + "\n";

    }

    public static ArrayList<Integer> find_res_HDD(notebook[] nout, int start, int end) {
        ArrayList<Integer> list_num = new ArrayList<>();

        for (notebook i : nout) {

            if (i.capacity_hdd >= start && i.capacity_hdd <= end) {
                list_num.add(i.id);
            }
        }
        return list_num;
    }

    public static ArrayList<Integer> find_res_ram(notebook[] nout, int start, int end) {
        ArrayList<Integer> list_num = new ArrayList<>();

        for (notebook i : nout) {
            if (i.ram >= start && i.ram <= end) {
                list_num.add(i.id);
            }
        }
        return list_num;
    }

    public static ArrayList<Integer> find_res_os(notebook[] nout, String text) {
        ArrayList<Integer> list_num = new ArrayList<>();

        for (notebook i : nout) {
            if (i.os == text) {
                list_num.add(i.id);
            }
        }
        return list_num;

    }

    public static ArrayList<Integer> find_res_color(notebook[] nout, String text) {
        ArrayList<Integer> list_num = new ArrayList<>();

        for (notebook i : nout) {
            if (i.color == text) {
                list_num.add(i.id);
            }
        }
        return list_num;

    }
}
