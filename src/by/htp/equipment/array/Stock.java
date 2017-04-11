package by.htp.equipment.array;
import by.htp.equipment.entity.Equipment;

public class Stock {
	private Equipment [] equip;
	private int id=100001;
	private int namber=0;
	
	
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

	public Equipment[] getEquip() {
		return equip;
	}

	public void setEquip(Equipment[] equip) {
		this.equip = equip;
	}
}
