package org.blogdemo.homeloan.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/summaryservice")
public class SummaryService {
	
	@GET
	@Path("/customer/{nationalID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getSummary(@PathParam("nationalID") String nationalID){
		
		return null;
	}
}
