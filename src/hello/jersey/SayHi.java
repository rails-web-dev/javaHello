package hello.jersey;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/sayHi/{name}")
public class SayHi {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello(@PathParam("name") String name) {
	    return "Hello " + name + "!";
	  }


}
