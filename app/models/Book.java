package models;

public class Book{
	public long isbn;
	public String title;
	public String author;
	public int edition;
	public int year;
	
	public Book(long isbn, String title, String author, int edition, int year){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.year = year;
	}
	public String getName(){
		return this.title;
	}
	public long getISBN(){
		return this.isbn;
	}
	public String getAuthor(){
		return this.author;
	}
	public int getEdition(){
		return this.edition;
	}
	public int getYear(){
		return this.year;
	}
}