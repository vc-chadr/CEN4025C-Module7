package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cen4025c.TodoApp.DAO.TodoDAO;
import cen4025c.TodoApp.DAOImpl.TodoDAOImpl;
import cen4025c.TodoApp.TodoItem;

public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	TodoItem item = new TodoItem();
	TodoDAOImpl itemDAOImpl = new TodoDAOImpl();
	TodoDAO itemDAO;
       
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		item = itemDAOImpl.viewItem(id);
		request.setAttribute("item", item);
		RequestDispatcher rd = request.getRequestDispatcher("viewItem.jsp");
		rd.forward(request, response);        
   }
}