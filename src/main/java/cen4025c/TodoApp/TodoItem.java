package cen4025c.TodoApp;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * To-do internal id for item
	 */
	private int id;
	
	/**
	 * To-do subject text
	 */
	private String subject;

	/**
	 * To-do content text
	 */
	private String content;
	
	public TodoItem() {		
	}
	
	public TodoItem(String subject, String content) {
		this.subject = subject;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "TodoItem [id=" + id + ", subject=" + subject + ", content=" + content + "]";
	}	
}
