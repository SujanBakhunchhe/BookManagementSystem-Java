import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static List<Book> books = new ArrayList<>();
    public static void addBook(Book book) {
        books.add(book);
    }
    public static List<Book> getBooks() {
        return books;
    }
    public static void deleteBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }
    public static void updateBook(String isbn, Book updatedBook) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setName(updatedBook.getName());
                book.setIsbn(updatedBook.getIsbn());
            }
        }
    }
}
