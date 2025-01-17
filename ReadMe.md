# Промежуточная аттестация

## Разработчик - Программист. Специализация

## Курс:

## **Java: знакомство и как пользоваться базовым API (семинары)**

### Урок 6. Хранение и обработка данных ч3: множество коллекций Set

### Задание:

1. Подумать над структурой класса `Ноутбук` для магазина техники - выделить поля и методы. Реализовать в Java.
2. Создать множество ноутбуков.
3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в `Map`.

### Пример:

```
Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет
...
```

4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в `Map`.
5. Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

---

### Реализация произведена на Java

### Пояснение кода:

**Импорт библиотек:** Импортируем необходимые классы из стандартной библиотеки Java.

**Главный класс `LaptopMain` :** Создаем основной класс и метод `main` , где создается множество ( `Set` ) ноутбуков.

**Добавление ноутбуков:** Добавляем различные модели ноутбуков в множество `laptops` .

**Вызов метода фильтрации:** Вызываем метод `filterLaptops` , который будет запрашивать критерии фильтрации у пользователя и выводить соответствующие ноутбуки.

**Метод `filterLaptops` :**

* Запрашивает у пользователя критерий фильтрации.
* Собирает уникальные значения для выбранного критерия.
* Запрашивает у пользователя конкретное значение для выбранного критерия.
* Фильтрует ноутбуки по выбранному значению.
* Выводит отфильтрованные ноутбуки в виде таблицы.

**Методы `getUniqueIntegerValues` и `getUniqueStringValues` :**

* Собирают уникальные значения для выбранного критерия (ОЗУ или объем ЖД для целых чисел; ОС, цвет или бренд для строк).

**Метод `filterLaptopsByCriteria` :**

* Фильтрует ноутбуки на основе выбранных критериев.

**Метод `printFilteredLaptops` :**

* Выводит отфильтрованные ноутбуки в виде таблицы с расчерченными полями.
