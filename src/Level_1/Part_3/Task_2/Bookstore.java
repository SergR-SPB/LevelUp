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
public class Bookstore {
    int id;
    String author;
    String bookTitle;
    int publicationDate;
    String country;
    String specification;
    int pointOfSale;


    Bookstore(int id, String author, String bookTitle, int publicationDate, String country, String specification, int pointOfSale) {
        this.id = id;
        this.author = author;
        this.bookTitle = bookTitle;
        this.publicationDate = publicationDate;
        this.country = country;
        this.specification = specification;
        this.pointOfSale = pointOfSale;
    }

    Bookstore() {
        bookTitle = "pencil";
        publicationDate = 0;
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

    int getPublicationDate() {
        return publicationDate;
    }

    String getCountry() {
        return country;
    }

    String getSpecification() {
        return specification;
    }

    int getPointOfSale() {
        return pointOfSale;
    }

    void showBookstore() {
        System.out.println("id: " + getId());
        System.out.println("author: " + getAuthor());
        System.out.println("bookTitle: " + getBookTitle());
        System.out.println("publicationDate: " + getPublicationDate());
        System.out.println("country: " + getCountry());
        System.out.println("specification: " + getSpecification());
        System.out.println("pointOfSale: " + getPointOfSale());
    }

    void showAuthor() {
        if ((this.getAuthor()).equals("Пушкин")) {  //Вопрос 2. Зачем здесь this????
            showBookstore();                        //Вопрос 3. Как сделать чтобы значение "Пушкин"
        }                                           //передавалось из Maina??
    }

    void showSpecification() {
        if ((getSpecification()).equals("Проза")) {
            showBookstore();

        }
    }

    void showPublicationDate() {
        if (getPublicationDate() > 1900) {
            showBookstore();
        }
    }

    void showPointOfSale() {
        System.out.println("PointOfSale: " + getPointOfSale());
    } //Вопрос 4 .Как сделать чтобы № магазина не повторялся


}
