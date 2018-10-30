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
    int pointOfSale;


    Book(int id, String author, String bookTitle, int publicationYear, String country, String specification, int pointOfSale) {
        this.id = id;
        this.author = author;
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
        this.country = country;
        this.specification = specification;
        this.pointOfSale = pointOfSale;
    }

    Book() {
        bookTitle = "pencil";
        publicationYear = 0;
        specification = "office supplies";
    }

    //геттеры есть. а сеттеры где?
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

    int getPointOfSale() {
        return pointOfSale;
    }

    void showDetails() {
        System.out.println("id: " + getId());
        System.out.println("author: " + getAuthor());
        System.out.println("bookTitle: " + getBookTitle());
        System.out.println("publicationYear: " + getPublicationYear());
        System.out.println("country: " + getCountry());
        System.out.println("specification: " + getSpecification());
        System.out.println("pointOfSale: " + getPointOfSale());
    }

    //судя по названию метода он должен показать автора. Почему он автора сравнивает с "Пушкиным" и в случае успеха выводит всю информацию о книге?
    //метод делает не то, что от него ожидаешь по названию
    void showAuthor() {
        if ((this.getAuthor()).equals("Пушкин")) {  //Вопрос 2. Зачем здесь this????
            /*this указывает что обращение идет к текущему экземпляру класса
              в данном случае указывать this не обязательно
              Сравнение с констатой лучше делать указывая константу на первом месте. В данном случае: "Пушкин".equals(getAuthor())
             */
            showDetails();                        //Вопрос 3. Как сделать чтобы значение "Пушкин"
        }                                           //передавалось из Maina?? - необходимо передать параметр в метод (см перегруженную версию этого метода)
    }

    //overload версия
    //но как указано выше: имя этого метода надо поменять!
    void showAuthor(String author) {
        if (author != null && author.equals(getAuthor())) {
            showDetails();
        }
    }

    //аналогично автору. должно просто отображаться, а не сравнивать с чем-т
    void showSpecification() {
        if ((getSpecification()).equals("Проза")) {
            showDetails();

        }
    }

    //тоже, что и ранее...
    void showPublicationDate() {
        if (getPublicationYear() > 1900) {
            showDetails();
        }
    }

    void showPointOfSale() {
        System.out.println("PointOfSale: " + getPointOfSale());
    } //Вопрос 4 .Как сделать чтобы № магазина не повторялся


}
