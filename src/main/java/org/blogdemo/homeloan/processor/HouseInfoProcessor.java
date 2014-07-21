package org.blogdemo.homeloan.processor;

import java.util.ArrayList;
import java.util.Map;

import org.blogdemo.homeloan.model.HouseInfo;

public class HouseInfoProcessor {

	public String processAddress(HouseInfo houseInfo){
		String newAddress = "";
		
		newAddress = houseInfo.getAddress().replaceAll(" ", "+");
		newAddress = newAddress.replace(",", ""); 
		
		return newAddress;
		
		
	}
	
	public String findGeoLocation(Map<String, ArrayList> resultmap){
		
		String latNlng = "";
		try{
		
			Map<String, Map<String, Object>> geometryList =(Map<String, Map<String, Object>>) resultmap.get("results").get(0);
			Map<String, Object> geometrymap = (Map<String, Object>)geometryList.get("geometry");		
			Map<String, Object> locationMap = (Map<String, Object>)  geometrymap.get("location");	
			
			double lat= (Double) locationMap.get("lat");
			double lng= (Double) locationMap.get("lng");
			
			
			latNlng =  lat+","+lng;
			
			latNlng.replaceAll("=", "%2D");
		}catch(Exception e){
			e.printStackTrace();
		}
		return latNlng;
	}
}
