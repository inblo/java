package H06;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class NoteBook {
    private String model; //модель
    private String color; //цвет
    private int ram; //оперативная память
    private String processor; //процессор
    private String videocard; //видеокарта
    private String os; //операционная система

    public NoteBook(String model) {
        this.model = model;
        color = "Unknown";
        ram = -1;
        videocard = "Unknown";
        processor = "Unknown";
        os = "Unknown";
    }

    public NoteBook(String model, String color, int ram, String processor, String videocard, String os) {
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.videocard = videocard;
        this.processor = processor;
        this.os = os;
    }

    public void setModel(String value){
        this.model = value;
    }

    public String getModel(){
        return this.model;
    }

    public void setColor(String value){
        this.color = value;
    }

    public String getColor(){
        return this.color;
    }

    public void setRam(int value){
        this.ram = value;
    }

    public int getRam(){
        return this.ram;
    }

    public void setProcessor(String value){
        this.processor = value;
    }

    public String getProcessor(){
        return this.processor;
    }

    public void setVideocard(String value){
        this.videocard = value;
    }

    public String getVideocard(){
        return this.videocard;
    }

    public void setOs(String value){
        this.os = value;
    }

    public String getOs(){
        return this.os;
    }

    public String toString() {
        String s = "";
        s = "Модель: "+model+"\n";
        s = s + "     Цвет: "+color+"\n";
        s = s + "     ОЗУ: "+Integer.toString(ram)+"\n";
        s = s + "     Процессор: "+processor+"\n";
        s = s + "     Видеокарта: "+videocard+"\n";
        s = s + "     Операционная система: "+os+"\n";
        return s;
    }
}

public class ItogTask {

    public static List<NoteBook> lNoteBook = new LinkedList<NoteBook>();

    private static NoteBook findNoteBook(String model){
        for (NoteBook item: lNoteBook){
            if (item.getModel().equals(model)) {
                return item;
            }
        }
        return null;
    }

    @SuppressWarnings("resource")
    public static void addNoteBook(){
        Scanner scn = new Scanner(System.in);

        String model;
        String color;
        int ram;
        String processor;
        String videocard;
        String oc;

        System.out.println("[ДОБАВЛЕНИЕ НОУТБУКА]");

        System.out.println(" >>> Введите модель:");
        model = scn.nextLine();

        System.out.println(" >>> Введите цвет:");
        color = scn.nextLine();

        System.out.println(" >>> Введите модель процессора:");
        processor = scn.nextLine();

        System.out.println(" >>> Введите модель видеокарты:");
        videocard = scn.nextLine();

        System.out.println(" >>> Введите операционную систему:");
        oc = scn.nextLine();

        System.out.println(" >>> Введите объем ОЗУ:");
        ram = scn.nextInt();

        if (findNoteBook(model) != null) {
            System.out.println("Ноутбук с такой моделью уже существует!");
        }
        else {
            NoteBook notebook = new NoteBook(model, color, ram, processor, videocard, oc);
            lNoteBook.add(notebook);
        }
    }

    @SuppressWarnings("resource")
    public static void editNoteBook(){
        System.out.println("[ИЗМЕНЕНИЕ НОУТБУКА]");
        System.out.println(" Введите модель ноутбука:");
        Scanner scn = new Scanner(System.in);

        String model = scn.nextLine();
        String color;
        int ram;
        String processor;
        String videocard;
        String oc;

        NoteBook notebook = findNoteBook(model);


        if (notebook == null) {
            System.out.println("Ноутбук с такой моделью не найден!");
        }
        else {
            System.out.println(" >>> Введите цвет (если не нужно редактировать данный параметр поставьте символ -):");
            color = scn.nextLine();
            if (!color.equals("-")) notebook.setColor(color);

            System.out.println(" >>> Введите модель процессора (если не нужно редактировать данный параметр поставьте символ -):");
            processor = scn.nextLine();
            if (!processor.equals("-")) notebook.setProcessor(processor);

            System.out.println(" >>> Введите модель видеокарты (если не нужно редактировать данный параметр поставьте символ -):");
            videocard = scn.nextLine();
            if (!videocard.equals("-")) notebook.setVideocard(videocard);

            System.out.println(" >>> Введите операционную систему (если не нужно редактировать данный параметр поставьте символ -):");
            oc = scn.nextLine();
            if (!oc.equals("-")) notebook.setOs(oc);

            System.out.println(" >>> Введите объем ОЗУ (если не нужно редактировать данный параметр введите -1):");
            ram = scn.nextInt();
            if (ram != -1) notebook.setRam(ram);
        }
    }

    @SuppressWarnings("resource")
    public static void deleteNoteBook(){
        System.out.println("[УДАЛЕНИЕ НОУТБУКА]");
        System.out.println(" Введите модель ноутбука:");
        Scanner scn = new Scanner(System.in);

        String model = scn.nextLine();

        NoteBook notebook = findNoteBook(model);


        if (notebook == null) {
            System.out.println("Ноутбук с такой моделью не найден!");
            return;
        }

        lNoteBook.remove(notebook);
    }

    public static void printNotebook(){
        System.out.println("[СПИСОК НОУТБУКОВ]");

        for (NoteBook item: lNoteBook){
            System.out.println(item.toString()+"\n");
            }
    }

    @SuppressWarnings("resource")
    public static void setFilter(){

        String model = "";
        String color = "";
        int ram = -1;
        String processor = "";
        String videocard = "";
        String oc = "";

        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        System.out.println("[ФИЛЬТР ДАННЫХ]");
        System.out.println(" Выберете критерий фильтра:");
        System.out.println("  >>1. Модель");
        System.out.println("  >>2. Цвет");
        System.out.println("  >>3. ОЗУ");
        System.out.println("  >>4. Процессор");
        System.out.println("  >>5. Видеокарта");
        System.out.println("  >>6. Операционная система");
        int indexComand =  scn.nextInt();
        switch (indexComand){
            case 1:{
                System.out.println("    >>>Введите модель ноутбука:");
                model = scn2.nextLine();
                break;
            }
            case 2:{
                System.out.println("    >>>Введите цвет ноутбука:");
                color = scn2.nextLine();
                break;
            }
            case 3:{
                System.out.println("    >>>Введите ОЗУ ноутбука:");
                ram = scn2.nextInt();
                break;
            }
            case 4:{
                System.out.println("    >>>Введите процессор ноутбука:");
                processor = scn2.nextLine();
                break;
            }
            case 5:{
                System.out.println("    >>>Введите видеокарту ноутбука:");
                videocard = scn2.nextLine();
                break;
            }
            case 6:{
                System.out.println("    >>>Введите операционную систему ноутбука:");
                oc = scn2.nextLine();
                break;
            }
            default:{
                System.out.println("Вы ввели неверный номер команды!");
                break;
            }
        }

        for (NoteBook item : lNoteBook){
            if (!model.equals("") && item.getModel().equals(model)) System.out.println(item.toString()+"\n");
            else
            if (!color.equals("") && item.getColor().equals(color)) System.out.println(item.toString()+"\n");
            else
            if (ram != -1 && item.getRam() == ram) System.out.println(item.toString()+"\n");
            else
            if (!processor.equals("") && item.getProcessor().equals(processor)) System.out.println(item.toString()+"\n");
            else
            if (!videocard.equals("") && item.getColor().equals(videocard)) System.out.println(item.toString()+"\n");
            else
            if (!oc.equals("") && item.getOs().equals(oc)) System.out.println(item.toString()+"\n");
        }
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер команды:");
            System.out.println("    1. Вывести данные по ноутбукам");
            System.out.println("    2. Добавить данные по ноутбуку");
            System.out.println("    3. Изменить данные по ноутбуку");
            System.out.println("    4. Удалить данные по ноутбуку");
            System.out.println("    5. Задать фильтр");
            System.out.println("    6. Выход");
            int indexComand =  scan.nextInt();

            switch (indexComand){
                case 1:{
                    printNotebook();
                    break;
                }
                case 2:{
                    addNoteBook();
                    break;
                }
                case 3:{
                    editNoteBook();
                    break;
                }
                case 4:{
                    deleteNoteBook();
                    break;
                }
                case 5:{
                    setFilter();
                    break;
                }
                case 6:{
                    return;
                }
                default:{
                    System.out.println("Вы ввели неверный номер команды!");
                    break;
                }
            }
        }
    }
}