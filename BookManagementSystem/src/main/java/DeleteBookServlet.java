import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class DeleteBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String isbn = request.getParameter("isbn");

	    BookRepository.deleteBook(isbn);
	    response.getWriter().write("Book deleted successfully!");
	}

}
