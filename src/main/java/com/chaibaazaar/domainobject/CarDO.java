package com.chaibaazaar.domainobject;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car_Table")

public class CarDO {
	@Id
	@GeneratedValue
	private Long Id;
	private int seat_count;
	private String license_plate;
	private String convertible;
	private float rating; 
	private String engine_type;
	
	 public CarDO(){
	    }
	
	
	public int getSeat_count() {
		return seat_count;
	}
	public void setSeat_count(int seat_count) {
		this.seat_count = seat_count;
	}
	public String getLicense_plate() {
		return license_plate;
	}
	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}
	public String getConvertible() {
		return convertible;
	}
	public void setConvertible(String convertible) {
		this.convertible = convertible;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getEngine_type() {
		return engine_type;
	}
	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}

}
