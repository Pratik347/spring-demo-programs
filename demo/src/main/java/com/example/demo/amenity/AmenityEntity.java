package com.example.demo.amenity;

public class AmenityEntity {
	
	private int id;
	private String name;
	private String brand;
	
	public AmenityEntity() {
		
	}	
	
	public AmenityEntity(int id, String name, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
