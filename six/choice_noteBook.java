
// Создать класс Ноутбук для магазина техники.
// Добавить атрибуты класса с соответствующими типами.
// Например,
// - идентификатор
// - производитель
// - название модели
// - RAM
// - объем HD
// - операционная система
// - и т.д.
// Добавить конструктор класса.
// Добавить необходимые методы класса.

// Создать множество ноутбуков (множество объектов класса ноутбук).
// 3-10 штук

import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class choice_noteBook {

    public static void main(String[] args) {

        notebook nout1 = new notebook(1, "HP", "HP5612", 16, 512, "Win10", "silver");
        notebook nout2 = new notebook(2, "Lenovo", "ideapad14", 12, 256, "linux", "White");
        notebook nout3 = new notebook(3, "Asus", "iP54r", 8, 1024, "Win11", "Black");
        notebook nout4 = new notebook(4, "Acer", "Z45g3", 32, 1024, "Win10", "Black");
        notebook nout5 = new notebook(5, "Acer", "a47hjk", 8, 128, "linux", "Black");
        notebook nout6 = new notebook(6, "Sony", "Son34Good", 16, 512, "Win10", "White");
        notebook nout7 = new notebook(7, "MSI", "615RT", 32, 512, "Win11", "White");
        notebook nout8 = new notebook(8, "Toshiba", "Tot5RT", 4, 128, "Dos", "Brown");
        notebook nout9 = new notebook(9, "Pocetbook", "Af56", 2, 64, "Dos", "Brown");

        
      
        Set<notebook> nouts = new HashSet<>();
        nouts.add(nout1);
        nouts.add(nout2);
        nouts.add(nout3);
        nouts.add(nout4);
        nouts.add(nout5);
        nouts.add(nout6);
        nouts.add(nout7);
        nouts.add(nout8);
        nouts.add(nout9);
try {
        System.out.println("выбор ноутбука по критериям");
        System.out.println(
                "Введите  число, отбор :\n по обьему жесткогого диска-1\n по объему оперативной памяти- 2\n по операционной системе-3\n по цвету корпуса -4\n");
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите  Ваш выбор");
        int choise = reader.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Введите  миниальный размер жесткого диска");
                int min = reader.nextInt();
                System.out.println("Введите  макимальный  размер жесткого диска");
                int max = reader.nextInt();
                reader.close();
                System.out.println(" ");
                choose_hdd(nouts, min, max);
                break;
            case 2:
                System.out.println("Введите  минимальный размер оперативной памяти");
                int minR = reader.nextInt();
                System.out.println("Введите  макcимальный  размер оперативной памяти");
                int maxR = reader.nextInt();
                reader.close();
                System.out.println(" ");
                choose_ram(nouts, minR, maxR);
                break;
            case 3:
                System.out.println(
                        "В наличие имеются ноутбуки со следующими операционнами системами\n 1 Dos\n 2 linux\n 3 windows 10\n 4 windows 11\n Введите число соответствуещее операционной системе :");
                int op_sys = reader.nextInt();
                reader.close();
                choose_oss(nouts, op_sys);
                break;
            case 4:
                System.out.println(
                        "В наличие имеются ноутбуки со следующими цветом корпуса \n 1 Серебристый\n 2 Белый\n 3 Черный\n 4 Коричневый \n Введите число соответствуещее выбранному цвету :");
                int color = reader.nextInt();
                reader.close();
                choose_color(nouts, color);

                break;
            default:
                System.out.printf("Некоректный выбор");
                reader.close();
                return;
        }
    } catch (InputMismatchException e) {
    System.out.printf("Некоректный выбор");}
    }

    public static void choose_ram(Set<notebook> nouts, int st, int en) {

        System.out.printf("Отобраны ноутбуки с размером памяти от %d Gb до %d Gb\n", st, en);
        Set<notebook> res_ram = new HashSet<>(notebook.find_res_ram(nouts, st, en));
        for (notebook i : res_ram) {
            System.out.println(i.toString());
        }
    }

    public static void choose_hdd(Set<notebook> nouts, int st, int en) {

        System.out.printf("Отобраны ноутбуки с размером жесткого диска от %d Gb до %d Gb\n", st, en);

        Set<notebook> res_hdd = new HashSet<>(notebook.find_res_HDD(nouts, st, en));
        for (notebook i : res_hdd) {
            System.out.println(i.toString());
        }
    }

    public static void choose_oss(Set<notebook> nouts, int os) {

        String Oska = "";
        switch (os) {
            case 1:
                Oska = "Dos";
                break;
            case 2:
                Oska = "linux";
                break;
            case 3:
                Oska = "Win10";
                break;
            case 4:
                Oska = "Win11";
                break;
            default:
                System.out.printf("Некоректный ввод");
                return;
        }

        System.out.printf("Отобраны ноутбуки с операционной системой %s\n", Oska);
        Set<notebook> res_oss = new HashSet<>(notebook.find_res_os(nouts, Oska));
        for (notebook i : res_oss) {
            System.out.println(i.toString());
        }
    }

    public static void choose_color(Set<notebook> nouts, int col) {

        String color_book = "";
        switch (col) {
            case 1:
                color_book = "silver";
                break;
            case 2:
                color_book = "White";
                break;
            case 3:
                color_book = "Black";
                break;
            case 4:
                color_book = "Brown";
                break;
            default:
                System.out.printf("Некоректный ввод");
                return;
        }

        System.out.printf("Отобраны ноутбуки с цветом корпуса  %s\n", color_book);
        Set<notebook> res_col = new HashSet<>(notebook.find_res_color(nouts, color_book));
        for (notebook i : res_col) {
            System.out.println(i.toString());
        }
    }

}
