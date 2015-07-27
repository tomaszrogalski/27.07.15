package zadanieklient2;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Klient;
import model.TypKlienta;

@Path("/klient")
@Produces(MediaType.APPLICATION_JSON)
public class Rest {

	@EJB
	HelloBean objectbean;

	@GET
	@Path("/print/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Klient2 produceJSON(@PathParam("id") int id) {
		return objectbean.wezklienta(id);
	}
}
