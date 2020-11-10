package com.tts.mapsapp.Service;

import com.tts.mapsapp.Models.GeocodingResponse;
import com.tts.mapsapp.Models.Location;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapService {

	@Value("${api_key}")
	private String apiKey;

	public void addCoordinates(Location location) {
		String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + location.getCity() + ","
				+ location.getState() + "&key=" + apiKey;

		RestTemplate restTemplate = new RestTemplate();
		GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
		Location coordinates = response.getResults().get(0).getGeometry().getLocation();

		location.setLat(coordinates.getLat());
		location.setLng(coordinates.getLng());

	}

	public Location randomCity() {

		Random r = new Random();
		double randLat = r.nextDouble() * 180 - 90;
		double randLong = r.nextDouble() * 270 - 180;
		System.out.println(randLat + "," + randLong);
		String url = "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + randLat + ","
				+ randLong + "&key=" + apiKey;
		RestTemplate restTemplate = new RestTemplate();
		GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
		Location location = response.getResults().get(0).getGeometry().getLocation();
		return location;


		// Location location = response.getResults().get(0).getAddress_Components().get(3);
		
		// Location location = new Location();

		// location.setCity(address.get(3).getLong_name());
	 }

}
