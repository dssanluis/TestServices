package com.mx.gnp.services.view;

import java.util.Date;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.gnp.services.model.Location;

@Path("/gnp")
public class LocationView {

	@POST
	@Path("/saveData")
	@Produces(MediaType.APPLICATION_JSON)
	public Location saveMessage(Location locationRequest){
		Location result = new Location();
		try{
			System.out.println("**Entro");
			if(locationRequest != null) {
				result.setDate(new Date().toString());
				result.setDeviceId(locationRequest.getDeviceId());
				result.setLatitud(locationRequest.getLatitud());
				result.setCodeMessage("0");
				result.setMessage("OK");
			}else {
				result.setCodeMessage("-1");
				result.setMessage("ERROR");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
