package Level_1.Part_3.Bookstore;

public class NovelBook extends Book {


    public NovelBook(String id, String specification, String author, String bookTitle, int publicationYear, String country) {
        super(id,  author, bookTitle, publicationYear, country);
    }

    @Override
    public String getSpecification() {
        return "NovelBook";
    }
}
