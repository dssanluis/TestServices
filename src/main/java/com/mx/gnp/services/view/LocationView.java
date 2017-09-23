package com.mx.gnp.services.view;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.gnp.services.model.Location;

@Path("/gnp")
public class LocationView {

	@Path("/saveData")
	@Produces(MediaType.APPLICATION_JSON)
	public Location saveMessage(Location locationRequest){
		try{
			System.out.println("Entro");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
