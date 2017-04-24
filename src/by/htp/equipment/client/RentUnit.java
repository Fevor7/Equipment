package by.htp.equipment.client;

import java.util.ArrayList;
import java.util.List;

import by.htp.equipment.entity.Equipment;

public class RentUnit {
	// снаряжение, которое пользователь взял в прокат
	private List<Equipment> units = new ArrayList<Equipment>();

	public List<Equipment> getUnits() {
		return units;
	}

	public void setUnits(List<Equipment> units) {
		this.units = units;
	}
}
