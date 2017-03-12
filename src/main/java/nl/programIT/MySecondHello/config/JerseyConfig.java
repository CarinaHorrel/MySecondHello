package nl.programIT.MySecondHello.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import nl.programIT.MySecondHello.service.TekstEndpoint;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		register(TekstEndpoint.class);
	}
}
 
