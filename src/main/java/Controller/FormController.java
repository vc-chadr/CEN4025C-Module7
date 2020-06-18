package Controller;

import java.io.IOException;
import cen4025c.TodoApp.DAO.TodoDAO;
import cen4025c.TodoApp.DAOImpl.TodoDAOImpl;
import cen4025c.TodoApp.TodoItem;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	TodoItem item = new TodoItem();
	TodoDAOImpl itemDAOImpl = new TodoDAOImpl();
	TodoDAO itemDAO;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("addItem") != null) {
			String subject = request.getParameter("subject");
			String content = request.getParameter("content");
			item.setSubject(subject);
			item.setContent(content);
			itemDAOImpl.addItem(item);
			RequestDispatcher rd = request.getRequestDispatcher("ListController");
			rd.forward(request, response);
		} else if (request.getParameter("deleteItem") != null) {
			int id = Integer.parseInt(request.getParameter("id"));
			item.setId(id);
			itemDAOImpl.deleteItem(item);
			RequestDispatcher rd = request.getRequestDispatcher("ListController");
			rd.forward(request, response);
		}
	}
}