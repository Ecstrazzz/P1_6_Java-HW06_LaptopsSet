/**
 * Java: знакомство и как пользоваться базовым API (семинары)
 * Урок 6. Хранение и обработка данных ч3: множество коллекций Set
 * 
 * Подумать над структурой класса Ноутбук для магазина
 * техники - выделить поля и методы. Реализовать в java.
 * 
 * -Создать множество ноутбуков.
 * -Написать метод, который будет запрашивать у пользователя
 * критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map.
 * 
 * Например:
 * 
 * Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * -Далее нужно запросить минимальные значения для указанных
 * критериев - сохранить параметры фильтрации можно также в Map.
 * -Отфильтровать ноутбуки их первоначального множества и
 * вывести проходящие по условиям.
 * 
 */

public class Laptop {

    private String brand;
    private int ram; // ОЗУ в ГБ
    private int storage; // Объем ЖД в ГБ
    private String os; // Операционная система
    private String color; // Цвет

    public Laptop(String brand, int ram, int storage, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

}