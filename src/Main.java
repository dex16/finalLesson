import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий фильтрации и
//        выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//        NoteBook notebook1 = new NoteBook
//        NoteBook notebook2 = new NoteBook
//        NoteBook notebook3 = new NoteBook
//        NoteBook notebook4 = new NoteBook
//        NoteBook notebook5 = new NoteBook
//
//        Например: “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет
//
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//
//        Класс сделать в отдельном файле
//
//        приветствие
//        Выбор параметра
//        выбор конкретнее
//        вывод подходящих
public class Main {
    public static void main(String[] args) {
        NoteBook noteBook1 = new NoteBook("256", "white", "10", "windows");
        NoteBook noteBook2 = new NoteBook("256", "white", "20", "windows");
        NoteBook noteBook3 = new NoteBook("256", "white", "30", "linux");
        NoteBook noteBook4 = new NoteBook("128", "white", "40", "macOs");
        NoteBook noteBook5 = new NoteBook("2048", "blue", "50", "linux");
        ArrayList<NoteBook> noteBooks = new ArrayList<>();
        noteBooks.add(noteBook1);
        noteBooks.add(noteBook2);
        noteBooks.add(noteBook3);
        noteBooks.add(noteBook4);
        noteBooks.add(noteBook5);
        Map<String, String> hashMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("введите количество оперативной памяти 256,512,1024,128,2048: ");
        String ozu = scan.nextLine();
        hashMap.put("ozuKey", ozu);
        System.out.println("введите цвет white,black,green,braun,blue : ");
        String color = scan.nextLine();
        hashMap.put("colorKey", color);
        System.out.println("введите операционную систему windows,macOs,linux:");
        String oS = scan.nextLine();

        System.out.println(" ввкдите внутреннюю память 10,20,30,40,50: ");
        String mem = scan.nextLine();
        hashMap.put("memKey", mem);
        hashMap.get("ozuKey");
        hashMap.get("colorKey");
        hashMap.put("osKey", oS);
        hashMap.get("osKey");
        hashMap.get("memKey");
        ArrayList<NoteBook> noteBooks1 = new ArrayList<>();
        for (int i = 0; i < noteBooks.size(); i++) {
            hashMap.get("colorKey"); // перевести из стринг в int
            if (hashMap.get("colorKey").equals(noteBooks.get(i).getColor())) {
//                System.out.println("1 этот ноутбук одходит " + (noteBooks.get(i)));
                noteBooks1.add(noteBooks.get(i));
            }
        }
        ArrayList<NoteBook> noteBooks2 = new ArrayList<>();
        for (int i = 0; i < noteBooks1.size(); i++) {
            hashMap.get("osKey");
            if (hashMap.get("osKey").equals(noteBooks1.get(i).getOperationSystem())) {
//                System.out.println("2 Вам подходят: " + noteBooks1.get(i));
                noteBooks2.add(noteBooks.get(i));
            }
        }
        ArrayList<NoteBook> noteBooks3 = new ArrayList<>();
        for (int i = 0; i < noteBooks2.size(); i++) {
            hashMap.get("ozuKey");// перевести из стринг в int
            if (hashMap.get("ozuKey").equals(noteBooks2.get(i).getOzu())) {
//                System.out.println("3 Вам подходят: " + noteBooks2.get(i));
                noteBooks3.add(noteBooks.get(i));
            }
        }
        ArrayList<NoteBook> noteBooks4 = new ArrayList<>();
        for (int i = 0; i < noteBooks3.size(); i++) {
            hashMap.get("memKey");// перевести из стринг в int
            if (hashMap.get("memKey").equals(noteBooks3.get(i).getMemory())) {
//                System.out.println("4 Вам подходят: " + noteBooks3.get(i));
                noteBooks4.add(noteBooks.get(i));
            }
//            System.out.println("итог  : " + noteBooks4);
        }
        System.out.println("итог  : " + noteBooks4);
    }
}
