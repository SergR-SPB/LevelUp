package Level_1.Part_3.Bookstore;

public class Book extends AbstractPrintedEdition {

    private String author;
    private String bookTitle;
    private int publicationYear;
    private String country;
    private String specification;

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

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
    public String toString (){
        return "Book ID № "+id+"[ "+
                "bookTitle: "+bookTitle+
                ", author: "+author+
                ", publicationYear: "+publicationYear+
                ", country: "+country+
                ", specification:"+specification+"]";



    }



}
