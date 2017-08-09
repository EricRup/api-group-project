package controllers;

import play.*;
import play.mvc.*;
import models.*;
import java.util.ArrayList;

public class BookController extends Controller{
	
	public BookData books = new BookData();
	
	public Result list(){
		return ok(views.html.list.render(books.getBooks()));
	}
	
	public Result detail(int id){
		Book toSend = books.getBook(id);
		return ok(views.html.detail.render(id, toSend));
	}
	
}