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
    private String brand; // Бренд
    private String model; // Модель
    private String os; // Операционная система
    private int ram; // ОЗУ в ГБ
    private int storage; // Объем ЖД в ГБ
    private String color; // Цвет
    private double screenSize; // Размер экрана в дюймах
    private String resolution; // Разрешение экрана
    private String cpuType; // Тип процессора
    private double price; // Цена

    // Конструктор
    public Laptop(String brand, String model, String os, int ram, int storage,
            String color, double screenSize, String resolution,
            String cpuType, double price) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.color = color;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.cpuType = cpuType;
        this.price = price;
    }

    // Методы-геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ноутбук (" +
                "Бренд = '" + brand + '\'' +
                ", Модель = '" + model + '\'' +
                ", ОС = '" + os + '\'' +
                ", ОЗУ = " + ram +
                ", HDD/SSD = " + storage +
                ", Цвет = '" + color + '\'' +
                ", Размер экрана = " + screenSize +
                ", Разрешение = '" + resolution + '\'' +
                ", Процессор = '" + cpuType + '\'' +
                ", Цена = " + price +
                ')';
    }
}