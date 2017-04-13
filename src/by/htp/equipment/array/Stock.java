package by.htp.equipment.array;

import by.htp.equipment.client.RentStation;
import by.htp.equipment.entity.Equipment;

public class Stock {
	private Equipment[] equipment;
	private RentStation rentStation;
	private int id = 100001;
	private int namber = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNamber() {
		return namber;
	}

	public void setNamber(int namber) {
		this.namber = namber;
	}

	public Equipment[] getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment[] equip) {
		this.equipment = equip;
	}

	public RentStation getRentStation() {
		return rentStation;
	}

	public void setRentStation(RentStation rentStation) {
		this.rentStation = rentStation;
	}
}
