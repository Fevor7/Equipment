package by.htp.equipment.work;

import by.htp.equipment.client.Client;
import by.htp.equipment.client.RentStation;
import by.htp.equipment.entity.Equipment;
import by.htp.equipment.accessory.*;

import java.util.List;

import by.htp.equipment.array.*;

public class PrintInfo {
	public static void printClient(CustomerBase customBase) {
		List <Client> list = customBase.getClient();
		for (int i = 0; i< list.size(); i++){
			OutInPut.printClient(list.get(i));
		}
		OutInPut.printLine();
	}

	public static void printRentStat(Stock stock) {
		RentStation rentStation = stock.getRentStation();
		List<Equipment> equip = rentStation.getUnits();

		for (int i = 0; i < equip.size(); i++) {
			Equipment eq = equip.get(i);
			if (eq != null) {
				OutInPut.printEquipment(eq);
			}
		}
		OutInPut.printLine();
	}

	public static void printStock(Stock stock) {
		List<Equipment> list = stock.getEquipment();
		for (int i = 0; i < list.size(); i++) {
			Equipment eq = list.get(i);
			if (eq != null) {
				OutInPut.printEquipment(eq);
			}
		}
		OutInPut.printLine();
	}

}
