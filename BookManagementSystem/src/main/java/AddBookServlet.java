import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class AddBookServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String isbn = request.getParameter("isbn");

        BookRepository.addBook(new Book(name, isbn));
        response.getWriter().write("Book added successfully!");
    }
}
