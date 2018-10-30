package Level_1.Part_3.Tasc_2;
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
1 список книг одного автора;
2 списки товаров одной спецификации;
3 спиок книг выпущенных поздее заданого года;
4 список магазинов.
 */
public class Bookstore {
    int id;
    String author;
    String bookTitle;
    int publicationDate;
    String country;
    String specification;
    int pointOfSale;


    Bookstore (int id, String author,String bookTitle, int publicationDate, String country, String specification, int pointOfSale){
        this.id = id;
        this.author =author;
        this.bookTitle = bookTitle;
        this.publicationDate = publicationDate;
        this.country =country;
        this.specification = specification;
        this.pointOfSale = pointOfSale;
    }
    Bookstore (){
        bookTitle = "pencil";
        publicationDate = 0;
        specification = "office supplies";
    }

    int Getid(){
        return id;
    }
    String Getauthor(){
        return author;
    }
    String GetbookTitle(){
        return bookTitle;
    }
    int GetpublicationDate(){
        return publicationDate;
    }
    String Getcountry(){
        return country;
    }
    String Getspecification(){
        return specification;
    }
    int GetpointOfSale(){
        return pointOfSale;
    }

    void show (){
        System.out.println("id: " + Getid () );
        System.out.println("author: " + Getauthor () );
        System.out.println("bookTitle: " + GetbookTitle () );
        System.out.println("publicationDate: " + GetpublicationDate () );
        System.out.println("country: " + Getcountry () );
        System.out.println("specification: " + Getspecification () );
        System.out.println("pointOfSale: " + GetpointOfSale () );


    }




}
