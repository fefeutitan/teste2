package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class Book {
	
	String x;
	
	@GET
	@Produces(MediaType.TEXT_XML)
	
	@Path("{name}")
	public String sayHelloXML( @PathParam("name") String name){
		
		String response = "<?xml version='1.0'?>"
				+ "<hello>Hello"+name+"</hello>";
		return response;
	}

}
