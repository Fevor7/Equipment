package by.htp.equipment.entity;

import java.util.ArrayList;
import java.util.List;

import by.htp.equipment.accessory.Accessory;

public abstract class Equipment {
	// private Category category;
	private String title;
	private int id;
	private boolean availabilityInStock = true;
	private String nameOfTenant;
	private String timeStartRenting;
	private String timeStopRenting;
	private String type;
	private double weight;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfTenant() {
		return nameOfTenant;
	}

	public void setNameOfTenant(String nameOfTenant) {
		this.nameOfTenant = nameOfTenant;
	}

	public String getTimeStartRenting() {
		return timeStartRenting;
	}

	public void setTimeStartRenting(String timeStartRenting) {
		this.timeStartRenting = timeStartRenting;
	}

	public String getTimeStopRenting() {
		return timeStopRenting;
	}

	public void setTimeStopRenting(String timeStopRenting) {
		this.timeStopRenting = timeStopRenting;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAvailabilityInStock() {
		return availabilityInStock;
	}

	public void setAvailabilityInStock(boolean availabilityInStock) {
		this.availabilityInStock = availabilityInStock;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
