package by.htp.equipment.work;

import by.htp.equipment.client.Client;
import by.htp.equipment.client.RentStation;
import by.htp.equipment.entity.Equipment;
import by.htp.equipment.array.*;

public class PrintInfo {
	public static void printClient(CustomerBase customBase) {
		Client[] client = customBase.getClient();
		for (Client cl : client) {
			if (cl != null) {
				OutInPut.printClient(cl);
			}
		}
		OutInPut.printLine();
	}
	public static void printRentStat(Stock stock){
		RentStation rentStation = stock.getRentStation();
		Equipment[] equip = rentStation.getUnits();
		for (Equipment equipment: equip){
			if(equipment!=null) {
				OutInPut.printEquipment(equipment);
			}
		}
		OutInPut.printLine();
	}
	public static void printStock(Stock stock) {
		Equipment[] equipment = stock.getEquipment();
		for (Equipment equi : equipment) {
			if (equi != null) {
				OutInPut.printEquipment(equi);
			}
		}
		OutInPut.printLine();
	}
	public static void printText(String text) {
		System.out.println(text);
	}
}
