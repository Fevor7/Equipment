package by.htp.equipment.entity;

import by.htp.equipment.entity.Equipment;

public class Scooter extends Equipment {
	private String engineCapacity;
	public Scooter() {
		super.setTitle("Scooter");
	}
	public String getEngineCapacity() {
		return engineCapacity;
	}
	public  void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
}
