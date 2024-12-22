import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = BookRepository.getBooks();
        response.setContentType("text/plain");
        for (Book book : books) {
            response.getWriter().write(book.getName() + " (ISBN: " + book.getIsbn() + ")\n");
        }
    }
}
