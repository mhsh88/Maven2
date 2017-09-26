package api;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("/PersonService")
public class PersonService {

	static ArrayList<Person> persons = new ArrayList<Person>();
	// Person temp = new Person();
	ObjectMapper mapper = new ObjectMapper();

	@GET
	@Path("/read")
	public String readPerson(@QueryParam("id") Long ID) throws JsonProcessingException {
		String jsonInString = mapper.writeValueAsString(persons.get(persons.indexOf(new Person(ID, "", "", 0))));
		return jsonInString;
		// temp.setAge(54);
		// temp.setID(ID);
		// temp.setLastName("ali");
		// temp.setFirstName("hassan");
		// Person temp2 = new Person();
		// persons.add(temp);
		// String jsonInString = "";
		// String jsonInString2 = "";
		// try {
		// jsonInString = mapper.writeValueAsString(temp);// Plain JSON
		// temp2 = mapper.readValue(jsonInString, Person.class);
		// temp2.setFirstName("kachal hassan");
		// jsonInString2 = mapper.writeValueAsString(temp2);
		// temp.setAge(25);
		// // mapper.writerWithDefaultPrettyPrinter().writeValue(new
		// // File("result.json"), carFleet);//Prettified JSON
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// String result = "";
		// for (Person person : persons) {
		// // if(person.getID() == ID){
		// result = result + "<p>" + person.getID() + " " +
		// person.getFirstName() + " " + person.getLastName() + " "
		// + person.getAge() + "\n " + "</p>";
		// // }
		// }
		// return jsonInString +"\n" +jsonInString2;
	}

	@GET
	@Path("/getAll")
	public String getAll() throws JsonProcessingException {
		String result = "";
		for (Person person : persons) {
			// if(person.getID() == ID){
			result = result + "<p>" + mapper.writeValueAsString(person) + "</p>";

			// }
		}
		result = mapper.writeValueAsString(persons);
		return result;

	}
	
	@GET
	@Path("/get")
	@Produces("application/json")
	public Person getProductInJSON() {

		Person person = new Person(1,"ipad 3", "apple", 999);
		System.out.println("hello");
		return person;

	}

	
	
	// Content-Type:application/x-www-form-urlencoded
//	@FormParam("id") Long ID, @FormParam("firstname") String firstName,
//	@FormParam("lastname") String lastName, @FormParam("age") int age
	
	@POST
	@Consumes("application/json")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response addUser(Person person) throws JsonProcessingException {

		// if (Request.getParameter("servlet1") != null) {
		// // Invoke FirstServlet's job here.
		// return Response.status(200)
		// .entity("addUser is called : you pushed servlet1")
		// .build();
		//
		// } else if (Request.getParameter("servlet2") != null) {
		// // Invoke SecondServlet's job here.
		// return Response.status(200)
		// .entity("addUser is called : you pushed servlet2")
		// .build();
		// }
//		Person temp = new Person(ID, firstName, lastName, age);
		System.out.println(person.getID());
	    System.out.println(person.getFirstName());
	    System.out.println(person.getLastName());
	    System.out.println(person.getAge());
		Person temp = new Person(person.getID(), person.getFirstName(), person.getLastName(), person.getAge());
		persons.add(temp);

		return Response.status(200).entity("User is added : " + mapper.writeValueAsString(temp)).build();

	}

	@PUT
	@Path("/update")
	public Response updatePerson(@PathParam("id") Long ID, @FormParam("firstname") String firstName,
			@FormParam("lastname") String lastName, @FormParam("age") int age) throws JsonProcessingException {
		System.out.println(ID+firstName+lastName+age);
		for (int i = 0; i < persons.size(); i++) {
			if (i == persons.indexOf(new Person(ID, "", "", 0))) {
				persons.get(i).setAge(age);
				persons.get(i).setFirstName(firstName);
				persons.get(i).setLastName(lastName);
				persons.get(i).setID(ID);
			}

		}

		return Response.status(200).entity("User is Changed : " + mapper.writeValueAsString(persons)).build();
	}

	@DELETE
	@Path("/delete")
	public Response deletePerson(@PathParam("id") Long ID) throws JsonProcessingException {

		persons.remove(new Person(ID, "", "", 0));

		return Response.status(200).entity("User is deleted : " + mapper.writeValueAsString(persons)).build();
	}

}
