package Level_1.Part_3.Task_2.Task_2Qvest;



/*
Задать критерий выбора данных и вывести эти данные на консоль.
Book: id, Автор, Название, Год издания, Страна, Спецификация, Магазин.
Создать массив объектов. Вывести:
1 Список книг одного автора;*/


public class Main {
    public int resultMetod;
    int count;

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

        printSearchByAuthor(books, "Пушкин");


    }

    /*private static void printSearchByAuthor(Book[] books, String author) {
        int count = 0;
        System.out.println("\n Перечень книг автора: " + author);
        for (int i = 0; i < books.length; i++) {
         if (searchByAuthor(books [i] , author)) count++;
        }

public Boolean searchByAuthor(Book[] books, String author) {
Здесь сравниваем
return true или false в зависимости от результата

}*/

    static void printSearchByAuthor(Book[] books, String author) {
        int count = 0;

        int i = 0;

        System.out.println("\n Перечень книг автора: " + author);
        for (i = 0; i < books.length; i++) {
            int result = books[i].searchByAuthor(author);
            //System.out.println("\n result"+result +"\n");
            //books[i].searchByAuthor(author);
            if (result!= 0){
            count++;}
        }

        System.out.println("Всего найдено: " + count + " книг(-а)");//Не работает
    }
}

class Book {

    int id;
    String author;
    String bookTitle;
    int publicationYear;
    String country;
    String specification;
    int stores;
    int count;
    int resultMetd;

    Book(int id, String author, String bookTitle, int publicationYear, String country, String specification, int pointOfSale) {
        this.id = id;
        this.author = author;
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
        this.country = country;
        this.specification = specification;
        this.stores = pointOfSale;
    }

    int getId() {
        return id;
    }

    String getAuthor() {
        return author;
    }

    String getBookTitle() {
        return bookTitle;
    }

    int getPublicationYear() {
        return publicationYear;
    }

    String getCountry() {
        return country;
    }

    String getSpecification() {
        return specification;
    }

    int getStores() {
        return stores;
    }


    void showDetails() {
        System.out.println("\nid: " + getId());
        System.out.println("author: " + getAuthor());
        System.out.println("bookTitle: " + getBookTitle());
        System.out.println("publicationDate: " + getPublicationYear());
        System.out.println("country: " + getCountry());
        System.out.println("specification: " + getSpecification());
        System.out.println("stores: " + getStores());
    }

    /*public void searchByAuthor(String author) {

        if (author != null && author.equals((getAuthor()))) {
            System.out.println("\n" + author);
            showDetails();
        }
    }*/
    int searchByAuthor(String author) {
        int resultMetod = 0;
        if (author != null && author.equals((getAuthor()))) {
            System.out.println("\n" + author);
            showDetails();
            resultMetod = 1;

        }
        return resultMetod;
    }
}