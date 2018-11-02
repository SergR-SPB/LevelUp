package Level_1.Part_3.Task_2;

/*Создать класс, который обозначает какую-либо сущность.
Определить у него несколько конструкторов - конструктор по умолчанию и конструктор со всеми параметрами.
Определить для него несколько параметров.
Создать массив объектов класса, который вы написали ранее.
Вывести его на экран (строку придется формировать вручную
- что-то типа array[i].brand + « » + array[i].wheelSize и т.д.).

Создать класс, спецификация которого приведена ниже.
Определить конструкторы и методы setТип(), getТип(), showИнформ().
Реализовать класс в консольном приложении.
Определить дополнительно методы в классе, создающем массив объектов.
Задать критерий выбора данных и вывести эти данные на консоль.
Book: id, Автор, Название, Год издания, Страна, Спецификация, Магазин.
Создать массив объектов. Вывести:
1 Список всех книг
2 Список книг одного автора;
3 Списки товаров одной спецификации;
4 спиок книг выпущенных поздее заданого года;
5 список магазинов.
 */
public class Book {
    int id;
    String author;
    String bookTitle;
    int publicationYear;
    String country;
    String specification;
    int stores;

    Book(int id, String author, String bookTitle, int publicationYear, String country, String specification, int pointOfSale) {
        this.id = id;
        this.author = author;
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
        this.country = country;
        this.specification = specification;
        this.stores = pointOfSale;
    }

    Book() {
        bookTitle = "pencil";
        publicationYear = 0;
        specification = "office supplies";
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
        System.out.println("id: " + getId());
        System.out.println("author: " + getAuthor());
        System.out.println("bookTitle: " + getBookTitle());
        System.out.println("publicationYear: " + getPublicationYear());
        System.out.println("country: " + getCountry());
        System.out.println("specification: " + getSpecification());
        System.out.println("stores: " + getStores());
    }

    int searchByAuthor(String author) {
        int resultSearch = 0;
        if (author != null && this.author.equals((getAuthor()))) {//this - 'nj
            showDetails();
            resultSearch = 1;
        }
        return resultSearch;
    }

    int searchBySpecification(String specification) {
        int resultSearch = 0;
        if (specification != null && specification.equals((getSpecification()))) {
            showDetails();
            resultSearch = 1;
        }
        return resultSearch;
    }

    int searchByPublicationYear(int publicationYear) {
        int resultSearch = 0;
        if (publicationYear != 0 && getPublicationYear() > 1900) {
            showDetails();
            resultSearch = 1;
        }
        return resultSearch;
    }

    void showAllStores() {
        System.out.println("Stores: " + getStores());
    }
}

