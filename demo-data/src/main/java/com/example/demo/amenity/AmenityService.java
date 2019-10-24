package com.example.demo.amenity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmenityService {
	
	@Autowired
	private AmenityRepository amenityRepository;
	
	public List<AmenityEntity> getAllAmenities() {
		List<AmenityEntity> amenities = new ArrayList<>();
		amenityRepository.findAll().forEach(amenities::add);  //amenityRepository.findAll().forEach(a -> amenities.add(a));
		return amenities;
	}
	
	public AmenityEntity getAmenity(int id) {
		return amenityRepository.findById(id).get();
	}

	public void addAmenity(AmenityEntity amenityEntity) {
		amenityRepository.save(amenityEntity);
	}

	public void updateAmenity(int id , AmenityEntity amenityEntity) {		
		amenityRepository.save(amenityEntity);
	}
	
	public void deleteAmenity(int id) {
		amenityRepository.deleteById(id);
	}

}
