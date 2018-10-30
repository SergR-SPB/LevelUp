package Level_1.Part_3.Task_2;

import java.util.HashSet;
import java.util.Set;

/*
Задать критерий выбора данных и вывести эти данные на консоль.
Book: id, Автор, Название, Год издания, Страна, Спецификация, Магазин.
Создать массив объектов. Вывести:
1 Список всех книг
2 Список книг одного автора;
3 списки товаров одной спецификации;
4 спиок книг выпущенных поздее заданого года;
5 список магазинов.
*/
public class Main {
    public static void main(String[] args) {


        Book[] books = new Book[9];

        books[0] = new Book(1, "Ершов", "Конек Горбунок", 1895, "Россия", "Сказка", 10);
        books[1] = new Book(2, "Салтыков-Щедрин", "Городовой", 1898, "Россия", "Проза", 9);
        books[2] = new Book(3, "Филатов", "Сказка про Федота стрельца", 1987, "Россия", "Сказка", 10);
        books[3] = new Book(4, "Салтыков-Щедрин", "Городовой-2", 1895, "Россия", "Сказка", 3);
        books[4] = new Book(5, "Пушкин", "Сборник", 1865, "Россия", "Сказка", 1);
        books[5] = new Book(6, "Пушкин", "Сборник-1", 1861, "Россия", "Сказка", 10);
        books[6] = new Book(7, "Пушкин", "Сборник-2", 1862, "Россия", "Сказка", 2);
        books[7] = new Book(8, "Пушкин", "Сборник-3", 1863, "Россия", "Сказка", 3);
        books[8] = new Book(9, "Дюма", "Трое из леса", 1895, "Франция", "Роман", 9);

        printAllBooks(books);

        printBooksByAuthor(books, "Пушкин");

        //аналогично все остальное выделить в методы
        System.out.println("\n=Список книг одной спецификации=");
        for (int i = 0; i < books.length; i++) {
            books[i].showSpecification();
        }
        System.out.println("\n=Список книг выпущенных после даты=");
        for (int i = 0; i < books.length; i++) {
            books[i].showPublicationDate();
        }

        printAllStores(books);
    }

    private static void printAllBooks(Book[] books) {
        System.out.println("\n=Список всех книг=");
        for (int i = 0; i < books.length; i++) {
            books[i].showDetails();
        }
    }

    private static void printBooksByAuthor(Book[] books, String author) {
        System.out.println("\n=Список книг одного автора=" + author);
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (author != null && author.equals(books[i].getAuthor())) {
                books[i].showDetails();
                count++;
            }

        }
        // Вопрос 1. Как вывести количество книг по выборке ?????
        //создать вспомагательную переменную и посчитать
        System.out.println("Всего найдено " + count + "книг(-а)");
    }

    private static void printAllStores(Book[] books) {
        Set<Integer> set = new HashSet<>();
        System.out.println("\n=Список магазинов=");
        for (int i = 0; i < books.length; i++) {
            set.add(books[i].getPointOfSale());
        }
        for (Integer pointOfSales : set) {
            System.out.println("PointOfSale: " + pointOfSales);
        }
        System.out.println("Количество магазинов = " + set.size());
    }

}
