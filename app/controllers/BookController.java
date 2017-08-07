package controllers;

import play.*;
import play.mvc.*;

public class BookController extends Controller{
	
	public Result list(){
		return ok("list");
	}
	public Result detail(Long id){
		return ok("details for " + id);
	}
}