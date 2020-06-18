package cen4025c.TodoApp.DAO;
 
import java.util.List;
import cen4025c.TodoApp.TodoItem;
 
public interface TodoDAO {    
    public void addItem(TodoItem item);
    public List<TodoItem> displayAllItems();
    public void deleteItem(TodoItem item);
    public TodoItem viewItem(int id);
}