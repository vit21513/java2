
import java.util.HashSet;
import java.util.Set;

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

    public static Set<notebook> find_res_HDD(Set<notebook> nouts, int start, int end) {
        Set<notebook> nouts_res = new HashSet<>();
        for (notebook i : nouts) {
            if (i.capacity_hdd >= start && i.capacity_hdd <= end) {
                nouts_res.add(i);
            }

        }
        return nouts_res;
    }

    public static Set<notebook> find_res_ram(Set<notebook> nouts, int start, int end) {
        Set<notebook> nouts_res = new HashSet<>();

        for (notebook i : nouts) {
            if (i.ram >= start && i.ram <= end) {
                nouts_res.add(i);
            }
        }
        return nouts_res;
    }

    public static Set<notebook> find_res_os(Set<notebook> nouts, String text) {
        Set<notebook> nouts_res = new HashSet<>();

        for (notebook i : nouts) {
            if (i.os == text) {
                nouts_res.add(i);
            }
        }
        return nouts_res;

    }

    public static Set<notebook> find_res_color(Set<notebook> nouts, String text) {
        Set<notebook> nouts_res = new HashSet<>();

        for (notebook i : nouts) {
            if (i.color == text) {
                nouts_res.add(i);
            }
        }
        return nouts_res;

    }
}
