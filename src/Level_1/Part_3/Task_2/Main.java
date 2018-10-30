package Level_1.Part_3.Task_2;

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


        Bookstore[] books = new Bookstore[9];

        books[0] = new Bookstore(1, "Ершов", "Конек Горбунок", 1895, "Россия", "Сказка", 10);
        books[1] = new Bookstore(2, "Салтыков-Щедрин", "Городовой", 1898, "Россия", "Проза", 9);
        books[2] = new Bookstore(3, "Филатов", "Сказка про Федота стрельца", 1987, "Россия", "Сказка", 10);
        books[3] = new Bookstore(4, "Салтыков-Щедрин", "Городовой-2", 1895, "Россия", "Сказка", 3);
        books[4] = new Bookstore(5, "Пушкин", "Сборник", 1865, "Россия", "Сказка", 1);
        books[5] = new Bookstore(6, "Пушкин", "Сборник-1", 1861, "Россия", "Сказка", 10);
        books[6] = new Bookstore(7, "Пушкин", "Сборник-2", 1862, "Россия", "Сказка", 2);
        books[7] = new Bookstore(8, "Пушкин", "Сборник-3", 1863, "Россия", "Сказка", 3);
        books[8] = new Bookstore(9, "Дюма", "Трое из леса", 1895, "Франция", "Роман", 9);

        System.out.println("\n=Список всех книг=");
        for (int i = 0; i < books.length; i++) {
            books[i].showBookstore();
        }
        System.out.println("\n=Список книг одного автора=");
        for (int i = 0; i < books.length; i++) {
            books[i].showAuthor();
            // Вопрос 1. Как вывести количество книг по выборке ?????
        }
        System.out.println("\n=Список книг одной спецификации=");
        for (int i = 0; i < books.length; i++) {
            books[i].showSpecification();
        }
        System.out.println("\n=Список книг выпущенных после даты=");
        for (int i = 0; i < books.length; i++) {
            books[i].showPublicationDate();
        }
        System.out.println("\n=Список магазинов=");
        for (int i = 0; i < books.length; i++) {
            books[i].showPointOfSale();
        }
    }
}
