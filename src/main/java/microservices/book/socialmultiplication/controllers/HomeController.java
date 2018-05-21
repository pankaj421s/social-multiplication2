package microservices.book.socialmultiplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="route")
public class HomeController {
	@RequestMapping(value="/index")
	public @ResponseBody String Home() throws Exception
	{
	if(true)
	{
			throw new Exception("This is exception");
	}
		
		return "index";
	}
	@ExceptionHandler(Exception.class)
	//@ResponseBody
	public String sayHello()
	{
		return "Hello";
	}
	public String databaseError(Exception e)
	{
		//return e.getMessage();
		System.out.println("Inside database error");
		return "databaseError";
	}
	@PostMapping("/welcome")
	public String welcome()
	{
		return "welcome";
	}
	@RequestMapping("/exception")
	public String exception() throws Exception
	{
		throw new Exception("This is exception from url");
	}

}
