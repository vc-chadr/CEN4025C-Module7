package cen4025c.TodoApp.DAOImpl;

import java.util.ArrayList;
import java.util.List;
import cen4025c.TodoApp.DAO.TodoDAO;
import cen4025c.TodoApp.TodoItem;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

public class TodoDAOImpl implements TodoDAO {
 
    @Override
    public void addItem(TodoItem employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
    }
 
    @Override
    public List<TodoItem> displayAllItems() {
        List<TodoItem> employeeList = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From TodoItem");
        employeeList = query.list();
        return employeeList;
    }
  
    @Override
    public void deleteItem(TodoItem employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(employee);
        transaction.commit();
        session.close();
    }
    
    @Override
    public TodoItem viewItem(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        TodoItem item = (TodoItem)session.get(TodoItem.class, id);
        transaction.commit();
        session.close();
        return item; 
    }
    
}