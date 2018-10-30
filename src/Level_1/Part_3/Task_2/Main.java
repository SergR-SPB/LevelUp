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
        printSearchByAuthor(books, "Пушкин");
        printSearchBySpecification(books, "Проза");
        printSearchByРublicationYear(books, 1980);
        printAllStores(books);
    }


    private static void printAllBooks(Book[] books) {
        int count =0;
        System.out.println("\n Перечень книг:");
        for (int i = 0; i < books.length; i++) {
            books[i].showDetails();
            count++;
        }
        System.out.println("Всего найдено: "+count + " книг(-а)");
    }

    private static void printSearchByAuthor(Book[] books, String author) {
        int count =0;
        System.out.println("\n Перечень книг автора: " + author);
        for (int i = 0; i < books.length; i++) {
            books[i].searchByAuthor();
            count++;
        }
        System.out.println("Всего найдено: "+count + " книг(-а)");
    }

    private static void printSearchBySpecification(Book[] books, String specification) {
        int count =0;
        System.out.println("\n=Список книг одной спецификации: " + specification);
        for (int i = 0; i < books.length; i++) {
            books[i].searchBySpecification();
            count++;
        }
        System.out.println("Всего найдено: "+count + " книг(-а)");
    }

    private static void printSearchByРublicationYear(Book[] books, int publicationYear) {
        int count =0;
        System.out.println("\n=Список книг выпущенных после даты: " + publicationYear);
        for (int i = 0; i < books.length; i++) {
            books[i].searchByPublicationYear();
            count++;
        }
        System.out.println("Всего найдено: "+count + " книг(-а)");
    }

    private static void printAllStores(Book[] books) {
        System.out.println("\n=Список магазинов=");
        for (int i = 0; i < books.length; i++) {
            books[i].showAllStores();
        }
    }
}
