package models;
import java.util.HashMap;


public class BookData{
	public HashMap<Integer, Book> books = new HashMap<>();
	
	public BookData(){
		books.put(1, new Book(9781785882562L, "Learning Network Programming with Java", "R. M. Reese", 1, 2015));
		books.put(2, new Book(9780134177335L, "Core Java Volume 1 - Fundamentals", "C. S. Hostmann", 10, 2015));
		books.put(3, new Book(978178439637L, "RESTful Java Web Services", "J. Purushothaman", 2, 2015));
	}
	
	public Book getBook(int id){
		return books.get(id);
	}
	public HashMap<Integer, Book> getBooks(){
		return this.books;
	}
}