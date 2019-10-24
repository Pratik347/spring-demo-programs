package com.example.demo.amenity;

import java.util.List;
//import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AmenityController {
	
	@Autowired
	private AmenityService amenityService;

	@RequestMapping("amenities")
	public List<AmenityEntity> getAllAmenities() {
		return amenityService.getAllAmenities();
	}
	
	/*
	 * @RequestMapping("amenity") public AmenityEntity amenity(@RequestParam("id") int id) {
	 * return amenityService.amenity(id);
	 * }
	 */	
	
	@RequestMapping("amenities/{id}") public AmenityEntity
	getAmenity(@PathVariable("id") int id) { return
	    amenityService.getAmenity(id);
	}
	 
	
	@RequestMapping(method = RequestMethod.POST, value = "amenities")
	public void addAmenity(@RequestBody AmenityEntity amenityEntity) {
		amenityService.addAmenity(amenityEntity);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "amenities/{id}")
	public void updateAmenity(@PathVariable("id") int id , @RequestBody AmenityEntity amenityEntity) {
		amenityService.updateAmenity(id , amenityEntity);
	}	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "amenities/{id}")
	public void deleteAmenity(@PathVariable("id") int id) {
	    amenityService.deleteAmenity(id);
	}
	 

}
