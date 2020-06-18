package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cen4025c.TodoApp.TodoItem;
import cen4025c.TodoApp.DAO.TodoDAO;
import cen4025c.TodoApp.DAOImpl.TodoDAOImpl;

public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	TodoItem item = new TodoItem();
	TodoDAOImpl itemDAOImpl = new TodoDAOImpl();
	TodoDAO itemDAO;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		displayAllItems(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		displayAllItems(request, response);
	}
	
	protected void displayAllItems(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<TodoItem> employeeList = new ArrayList<>();
		employeeList = itemDAOImpl.displayAllItems();
		request.setAttribute("employeeList", employeeList);
		RequestDispatcher rd = request.getRequestDispatcher("displayItems.jsp");
		rd.forward(request, response);		
	}
}
