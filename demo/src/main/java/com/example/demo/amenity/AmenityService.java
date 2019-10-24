package com.example.demo.amenity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AmenityService {

	private List<AmenityEntity> amenities = new ArrayList<>(Arrays.asList(new AmenityEntity(001, "Television", "Sony"),
														  new AmenityEntity(002, "Refrigerator", "L.G."),
														  new AmenityEntity(003, "A.C.", "Hitchi")));
	
	public List<AmenityEntity> getAllAmenities() {
		return amenities;
	}
	
	public AmenityEntity getAmenity(int id) {
		return amenities.stream().filter(a -> a.getId() == id).findFirst().get();
	}

	public void addAmenity(AmenityEntity amenityEntity) {
		amenities.add(amenityEntity);
	}

	public void updateAmenity(int id , AmenityEntity amenityEntity) {
		/*
		 * amenities.removeIf(a -> a.getId() == id);
		 * amenities.add(amenityEntity);
		 */
		
		for(int i = 0; i < amenities.size(); i++) {
			AmenityEntity a = amenities.get(i);
			if(a.getId() == id) {
				amenities.set(i, amenityEntity);
				return; //returns void
			}
		}
	}
	
	public void deleteAmenity(int id) {
	    amenities.removeIf(a -> a.getId() == id);
	}

}
