package Level_1.Part_3.Bookstore;

public abstract class Book extends AbstractPrintedEdition {

    private String author;
    private String bookTitle;
    private int publicationYear;
    private String country;

    public Book(String id) {
        this.id = id;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public abstract String getSpecification();

    public String toString (){
        return "Book ID № "+id+"[ "+
                "bookTitle: "+ getBookTitle() +
                ", author: "+getAuthor()+
                ", specification: "+getSpecification()+
                ", publicationYear: "+getPublicationYear()+
                ", country: "+getCountry()+"]";
    }





}
