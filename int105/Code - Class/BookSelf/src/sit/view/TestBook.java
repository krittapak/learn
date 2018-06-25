
package sit.view;
import self.model.BookCatalog;
import self.model.Book;

public class TestBook {
    public static void main(String[] args) {
        BookCatalog bc=new BookCatalog(2);
        Book b1=new Book(1,"Java","Programming",true);
        bc.addBook(b1);
    }
}
