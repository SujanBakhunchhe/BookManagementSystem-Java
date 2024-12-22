import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class UpdateBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldIsbn = request.getParameter("oldIsbn");
        String newName = request.getParameter("newName");
        String newIsbn = request.getParameter("newIsbn");
        BookRepository.updateBook(oldIsbn, new Book(newName, newIsbn));
        response.getWriter().write("Book updated successfully!");
    }
}
