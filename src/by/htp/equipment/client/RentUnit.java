package by.htp.equipment.client;

import by.htp.equipment.entity.Equipment;

public class RentUnit {
	// снаряжение, которое пользователь взял в прокат
	private Equipment[] units;

	public Equipment[] getUnits() {
		return units;
	}

	public void setUnits(Equipment[] units) {
		this.units = units;
	}
}
