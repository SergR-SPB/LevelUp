package Level_1.Part_3.Bookstore;

public class NovelBook extends Book {


    public NovelBook(String id) {
        super(id);
    }

    @Override
    public String getSpecification() {
        return "NovelBook";
    }
}
