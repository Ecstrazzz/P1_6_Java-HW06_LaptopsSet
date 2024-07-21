import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

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

        // // Dell
        // laptops.add(new Laptop("Dell", "XPS 13", "Windows 10", 8, 256, "Silver",
        // 13.3, "1920x1080", "Intel i5", 79999));
        // laptops.add(new Laptop("Dell", "Inspiron 15", "Windows 11", 16, 512, "Black",
        // 15.6, "3840x2160", "Intel i7",
        // 129999));
        // laptops.add(
        // new Laptop("Dell", "G5 15", "Windows 10", 16, 1024, "White", 15.6,
        // "1920x1080", "Intel i9", 159999));

        // // HP
        // laptops.add(new Laptop("HP", "Spectre x360", "Windows 11", 16, 512, "Black",
        // 15.6, "3840x2160", "Intel i7",
        // 129999));
        // laptops.add(new Laptop("HP", "Pavilion Gaming Laptop", "Windows 10", 8, 256,
        // "Green", 15.6, "1920x1080",
        // "AMD Ryzen 5", 69999));
        // laptops.add(
        // new Laptop("HP", "Elite Dragonfly", "Windows", 16, 512, "Blue", 13.3,
        // "1920x1080", "Intel i7", 149999));

        // // Apple
        // laptops.add(new Laptop("Apple", "MacBook Air", "MacOS", 8, 256, "Gray", 13.3,
        // "2560x1600", "Apple M1", 99999));
        // laptops.add(new Laptop("Apple", "MacBook Pro", "MacOS", 16, 512, "Silver",
        // 16.0, "3072x1920", "Apple M1 Pro",
        // 199999));

        // // Asus
        // laptops.add(new Laptop("Asus", "ZenBook Pro Duo", "Windows", 32, 1024,
        // "Blue", 14.0, "3840x2160", "Intel i9",
        // 249999));
        // laptops.add(new Laptop("Asus", "ROG Zephyrus G14", "Windows", 24, 1024,
        // "White", 14.0, "2560x1440",
        // "AMD Ryzen 9", 179999));
        // laptops.add(
        // new Laptop("Asus", "VivoBook S15", "Windows", 8, 512, "Green", 15.6,
        // "1920x1080", "Intel i5", 59999));

        // // Lenovo
        // laptops.add(new Laptop("Lenovo", "ThinkPad X1 Carbon", "Windows 11", 16, 512,
        // "Black", 14, "1920x1080",
        // "Intel i7", 109999));
        // laptops.add(new Laptop("Lenovo", "Legion Y540", "Windows 10", 32, 1024,
        // "White", 17, "3840x2160",
        // "Intel Core i9-10980HK", 269999));

        // // Acer
        // laptops.add(new Laptop("Acer", "Nitro", "WIndows", 16, 1024, "Red", 17,
        // "3840x2160", "Intel i9", 129999));
        // laptops.add(new Laptop("Acer", "Predator Helios G18", "WIndows", 32, 2048,
        // "Black", 17, "3840x2160", "Intel i9",
        // 249999));

        // Dell
        laptops.add(new Laptop("Dell", "Windows", 8, 256, "Silver", 13.3, "1920x1080", "Intel i5", 79999));
        laptops.add(new Laptop("Dell", "Windows", 16, 512, "Black", 15.6, "3840x2160", "Intel i7",
                129999));
        laptops.add(
                new Laptop("Dell", "Windows", 16, 1024, "White", 15.6, "1920x1080", "Intel i9", 159999));

        // HP
        laptops.add(new Laptop("HP", "Windows", 16, 512, "Black", 15.6, "3840x2160", "Intel i7",
                129999));
        laptops.add(new Laptop("HP", "No OS", 8, 256, "Green", 15.6, "1920x1080",
                "AMD Ryzen 5", 69999));
        laptops.add(
                new Laptop("HP", "Windows", 16, 512, "Blue", 13.3, "1920x1080", "Intel i7", 149999));

        // Apple
        laptops.add(new Laptop("Apple", "MacOS", 8, 256, "Gray", 13.3, "2560x1600", "Apple M1", 99999));
        laptops.add(new Laptop("Apple", "MacOS", 16, 512, "Silver", 16.0, "3072x1920", "Apple M1Pro",
                199999));

        // Asus
        laptops.add(new Laptop("Asus", "Windows", 32, 1024, "Blue", 14.0, "3840x2160", "Intel i9",
                249999));
        laptops.add(new Laptop("Asus", "Windows", 24, 1024, "White", 14.0, "2560x1440",
                "AMD Ryzen 9", 179999));
        laptops.add(
                new Laptop("Asus", "Linux", 8, 512, "Green", 15.6, "1920x1080", "Intel i5", 59999));

        // Lenovo
        laptops.add(new Laptop("Lenovo", "Linux", 16, 512, "Black", 14, "1920x1080",
                "Intel i7", 109999));
        laptops.add(new Laptop("Lenovo", "Windows", 32, 1024, "White", 17, "3840x2160",
                "Intel i9", 269999));

        // Acer
        laptops.add(new Laptop("Acer", "Linux", 16, 1024, "Red", 17, "3840x2160", "Intel i9", 129999));
        laptops.add(new Laptop("Acer", "Windows", 32, 2048, "Black", 17, "3840x2160", "Intel i9",
                249999));

        // Запрашиваем критерии фильтрации и выводим соответствующие ноутбуки
        filterLaptops(laptops);
    }

    private static void filterLaptops(Set<Laptop> laptops) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, Object> filters = new HashMap<>();

            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("5 - Бренд");
            System.out.println("6 - Цена");

            int criterion = scanner.nextInt();
            switch (criterion) {
                case 1:
                    List<Integer> uniqueRam = getUniqueIntegerValues(laptops, criterion).stream().sorted()
                            .collect(Collectors.toList());
                    System.out.print("\nВыберите значение ОЗУ (ГБ): ");
                    for (int i = 0; i < uniqueRam.size(); i++) {
                        System.out.printf("%d - %dГБ ", i + 1, uniqueRam.get(i));
                    }
                    System.out.print("\nВаш выбор: ");
                    filters.put("ram", uniqueRam.get(scanner.nextInt() - 1));
                    break;
                case 2:
                    List<Integer> uniqueStorage = getUniqueIntegerValues(laptops, criterion).stream().sorted()
                            .collect(Collectors.toList());
                    System.out.print("\nВыберите значение объема ЖД (ГБ): ");
                    for (int i = 0; i < uniqueStorage.size(); i++) {
                        System.out.printf("%d - %dГБ ", i + 1, uniqueStorage.get(i));
                    }
                    System.out.print("\nВаш выбор: ");
                    filters.put("storage", uniqueStorage.get(scanner.nextInt() - 1));
                    break;
                case 3:
                    List<String> uniqueOs = getUniqueStringValues(laptops, criterion).stream().sorted()
                            .collect(Collectors.toList());
                    System.out.print("\nВыберите операционную систему: ");
                    for (int i = 0; i < uniqueOs.size(); i++) {
                        System.out.printf("%d - %s ", i + 1, uniqueOs.get(i));
                    }
                    System.out.print("\nВаш выбор: ");
                    filters.put("os", uniqueOs.get(scanner.nextInt() - 1));
                    break;
                case 4:
                    List<String> uniqueColor = getUniqueStringValues(laptops, criterion).stream().sorted()
                            .collect(Collectors.toList());
                    System.out.print("\nВыберите цвет: ");
                    for (int i = 0; i < uniqueColor.size(); i++) {
                        System.out.printf("%d - %s ", i + 1, uniqueColor.get(i));
                    }
                    System.out.print("\nВаш выбор: ");
                    filters.put("color", uniqueColor.get(scanner.nextInt() - 1));
                    break;
                case 5:
                    List<String> uniqueBrand = getUniqueStringValues(laptops, criterion).stream().sorted()
                            .collect(Collectors.toList());
                    System.out.print("\nВыберите бренд: ");
                    for (int i = 0; i < uniqueBrand.size(); i++) {
                        System.out.printf("%d - %s ", i + 1, uniqueBrand.get(i));
                    }
                    System.out.print("\nВаш выбор: ");
                    filters.put("brand", uniqueBrand.get(scanner.nextInt() - 1));
                    break;
                case 6:
                    System.out.print("\nВведите максимальную цену (рублей): ");
                    filters.put("priceMax", scanner.nextDouble());
                    break;
                default:
                    System.out.println("\nНеправильный критерий.");
            }

            Set<Laptop> filteredLaptops = filterLaptopsByCriteria(laptops, filters);

            if (filteredLaptops.isEmpty()) {
                System.out.println("\nНет ноутбуков, соответствующих заданным критериям.");
            } else {
                printFilteredLaptops(filteredLaptops);
            }
        }
    }

    private static Set<Integer> getUniqueIntegerValues(Set<Laptop> laptops, int criterion) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (Laptop laptop : laptops) {
            switch (criterion) {
                case 1:
                    uniqueValues.add(laptop.getRam());
                    break;
                case 2:
                    uniqueValues.add(laptop.getStorage());
                    break;
            }
        }
        return uniqueValues;
    }

    private static Set<String> getUniqueStringValues(Set<Laptop> laptops, int criterion) {
        Set<String> uniqueValues = new HashSet<>();
        for (Laptop laptop : laptops) {
            switch (criterion) {
                case 3:
                    uniqueValues.add(laptop.getOs());
                    break;
                case 4:
                    uniqueValues.add(laptop.getColor());
                    break;
                case 5:
                    uniqueValues.add(laptop.getBrand());
                    break;
            }
        }
        return uniqueValues;
    }

    private static Set<Laptop> filterLaptopsByCriteria(Set<Laptop> laptops, Map<String, Object> filters) {
        Set<Laptop> filteredLaptops = new HashSet<>(laptops);

        for (Map.Entry<String, Object> entry : filters.entrySet()) {
            switch (entry.getKey()) {
                case "ram":
                    filteredLaptops.removeIf(laptop -> laptop.getRam() != (int) entry.getValue());
                    break;
                case "storage":
                    filteredLaptops.removeIf(laptop -> laptop.getStorage() != (int) entry.getValue());
                    break;
                case "os":
                    filteredLaptops.removeIf(laptop -> !laptop.getOs().equalsIgnoreCase((String) entry.getValue()));
                    break;
                case "color":
                    filteredLaptops.removeIf(laptop -> !laptop.getColor().equalsIgnoreCase((String) entry.getValue()));
                    break;
                case "brand":
                    filteredLaptops.removeIf(laptop -> !laptop.getBrand().equalsIgnoreCase((String) entry.getValue()));
                    break;
                case "priceMax":
                    filteredLaptops.removeIf(laptop -> laptop.getPrice() > (double) entry.getValue());
                    break;
            }
            return filteredLaptops;
        }
        return filteredLaptops;
    }

    // private static void printFilteredLaptops(Set<Laptop> filteredLaptops) {

    // System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n",
    // "Бренд", "Модель", "ОС", "ОЗУ(Гб)", "ЖД(Гб)", "Цвет", "Экран(in)",
    // "Разрешение", "Процессор", "Цена(руб)");

    // for (Laptop laptop : filteredLaptops) {
    // System.out.println(laptop);
    // }
    // }

    private static void printFilteredLaptops(Set<Laptop> filteredLaptops) {

        System.out.println(
                "+--------+---------+--------+-------+--------+--------+------------+-------------+------------+");
        System.out.printf("| %-6s | %-7s | %-6s | %-5s | %-6s | %-6s | %-10s | %-11s | %10s |\n",
                "Бренд", "ОС", "ОЗУ", "ЖД", "Цвет", "Экран",
                "Разрешение", "Процессор", "Цена(руб)");
        System.out.println(
                "+--------+---------+--------+-------+--------+--------+------------+-------------+------------+");

        for (Laptop laptop : filteredLaptops) {
            System.out.printf("| %-6s | %-7s | %-6d | %-5d | %-6s | %-6.1f | %-10s | %-11s | %10.2f |\n",
                    laptop.getBrand(), laptop.getOs(),
                    laptop.getRam(), laptop.getStorage(),
                    laptop.getColor(), laptop.getScreenSize(),
                    laptop.getResolution(), laptop.getCpuType(),
                    laptop.getPrice());
        }

        System.out.println(
                "+--------+---------+--------+-------+--------+--------+------------+-------------+------------+\n");

    }
}