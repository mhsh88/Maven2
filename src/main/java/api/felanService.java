package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/Service")
public class felanService {
	@GET
	@Path("/test")
	public String getHello(){
		
		return "Hello World!\n Mokhlesim";
	}
	
	@GET
	@Path("/test/{x}")
	public String sayHello(@PathParam("x") String name){
		
		return "Hello " + name;
	}
	
	

}
