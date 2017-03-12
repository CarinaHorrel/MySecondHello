package nl.programIT.MySecondHello.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nl.programIT.MySecondHello.domain.Tekst;
import nl.programIT.MySecondHello.domain.TekstService;

@Path("tekst")
@Component
public class TekstEndpoint {
	@Autowired
	private TekstService tekstService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listTekst(){
		System.out.println("Got the list!!!");
		Iterable <Tekst> result = this.tekstService.findAll();
		return Response.ok(result).build();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postTekst(Tekst tekst){
		System.out.println("POSTED: "+ tekst.getTekst());
		this.tekstService.save(tekst);
		return Response.accepted(tekst).build();
	}
	
	
}
