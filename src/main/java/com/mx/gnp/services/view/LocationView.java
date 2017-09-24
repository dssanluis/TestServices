package com.mx.gnp.services.view;

import java.util.ArrayList;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.gnp.services.model.Location;
import com.mx.gnp.services.model.ResponseObject;

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
				
				//TODO hacer la llamada al metodo que guarda en BD.
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
			result.setCodeMessage("-1");
			result.setMessage("La operacion no se pudo completar intentelo mas tarde.");
		}
		return result;
	}
	
	@GET
	@Path("/saveData")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseObject getListLocation(){
		ResponseObject response = new ResponseObject();
		ArrayList<Location> lsLocation = new ArrayList<Location>();
		try{
			//TODO hacer la llamada que obtiene los registros de la base.
//			lsLocation = getListOfData();
			if(lsLocation != null && !lsLocation.isEmpty()) {
				response.setCodeMessage("0");
				response.setMessage("OK");
				response.setResponseObject(lsLocation);
			}else {
				response.setCodeMessage("-1");
				response.setMessage("ERROR");
			}
		}catch (Exception e) {
			e.printStackTrace();
			response.setCodeMessage("-1");
			response.setMessage("La operacion no se pudo completar intentelo mas tarde.");
		}
		return response;
	}
}
