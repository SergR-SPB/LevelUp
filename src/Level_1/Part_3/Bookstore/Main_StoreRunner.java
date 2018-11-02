package Level_1.Part_3.Bookstore;

public class MainStoreRunner {
    public static void main(String[] args) {
        StoreBooks store = new StoreBooks() {
            @Override
            public void addProductToCatalog(AbstractPrintedEdition product) {
                super.addProductToCatalog(product);
            }

            @Override
            public AbstractPrintedEdition saleProductInCatalog() {
                return super.saleProductInCatalog();
            }

            @Override
            public void printProducts() {
                super.printProducts();
            }

            @Override
            public AbstractPrintedEdition mostCost() {
                return super.mostCost();
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        }

    }
}
