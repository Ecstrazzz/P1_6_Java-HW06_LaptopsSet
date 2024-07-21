import java.util.HashSet;
import java.util.Set;

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

public class LaptopMain {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        // Dell
        laptops.add(new Laptop("Dell", "XPS 13", "Windows 10", 8, 256, "Silver", 13.3, "1920x1080", "Intel i5", 79999));
        laptops.add(new Laptop("Dell", "Inspiron 15", "Windows 11", 16, 512, "Black", 15.6, "3840x2160", "Intel i7",
                129999));
        laptops.add(
                new Laptop("Dell", "G5 15", "Windows 10", 16, 1024, "White", 15.6, "1920x1080", "Intel i9", 159999));

        // HP
        laptops.add(new Laptop("HP", "Spectre x360", "Windows 11", 16, 512, "Black", 15.6, "3840x2160", "Intel i7",
                129999));
        laptops.add(new Laptop("HP", "Pavilion Gaming Laptop", "Windows 10", 8, 256, "Green", 15.6, "1920x1080",
                "AMD Ryzen 5", 69999));
        laptops.add(
                new Laptop("HP", "Elite Dragonfly", "Windows", 16, 512, "Blue", 13.3, "1920x1080", "Intel i7", 149999));

        // Apple
        laptops.add(new Laptop("Apple", "MacBook Air", "MacOS", 8, 256, "Gray", 13.3, "2560x1600", "Apple M1", 99999));
        laptops.add(new Laptop("Apple", "MacBook Pro", "MacOS", 16, 512, "Silver", 16.0, "3072x1920", "Apple M1 Pro",
                199999));

        // Asus
        laptops.add(new Laptop("Asus", "ZenBook Pro Duo", "Windows", 32, 1024, "Blue", 14.0, "3840x2160", "Intel i9",
                249999));
        laptops.add(new Laptop("Asus", "ROG Zephyrus G14", "Windows", 24, 1024, "White", 14.0, "2560x1440",
                "AMD Ryzen 9", 179999));
        laptops.add(
                new Laptop("Asus", "VivoBook S15", "Windows", 8, 512, "Green", 15.6, "1920x1080", "Intel i5", 59999));

        // Lenovo
        laptops.add(new Laptop("Lenovo", "ThinkPad X1 Carbon", "Windows 11", 16, 512, "Black", 14, "1920x1080",
                "Intel i7", 109999));
        laptops.add(new Laptop("Lenovo", "Legion Y540", "Windows 10", 32, 1024, "White", 17, "3840x2160",
                "Intel Core i9-10980HK", 269999));

        // Acer
        laptops.add(new Laptop("Acer", "Nitro", "WIndows", 16, 1024, "Red", 17, "3840x2160", "Intel i9", 129999));
        laptops.add(new Laptop("Acer", "Predator Helios G18", "WIndows", 32, 2048, "Black", 17, "3840x2160", "Intel i9",
                249999));

        // Вывод всех ноутбуков
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}
