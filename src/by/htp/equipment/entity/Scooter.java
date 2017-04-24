package by.htp.equipment.entity;

import java.util.ArrayList;
import java.util.List;

import by.htp.equipment.accessory.ScooterAcces;
import by.htp.equipment.entity.Equipment;

public class Scooter extends Equipment {
	private List<ScooterAcces> accessor = new ArrayList<ScooterAcces>();
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
	public List<ScooterAcces> getAccessor() {
		return accessor;
	}
	public void setAccessor(List<ScooterAcces> accessor) {
		this.accessor = accessor;
	}
}
