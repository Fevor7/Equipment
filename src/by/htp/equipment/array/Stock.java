package by.htp.equipment.array;

import java.util.ArrayList;
import java.util.List;

import by.htp.equipment.client.RentStation;
import by.htp.equipment.entity.Equipment;

public class Stock {
	private List<Equipment>  equipment = new ArrayList<Equipment>();
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

	public RentStation getRentStation() {
		return rentStation;
	}

	public void setRentStation(RentStation rentStation) {
		this.rentStation = rentStation;
	}

	public List<Equipment> getEquipment() {
		return equipment;
	}

	public void setEquip(List<Equipment> equipment) {
		this.equipment = equipment;
	}
}
