package by.htp.equipment.work;

import by.htp.equipment.entity.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import by.htp.equipment.array.*;
import by.htp.equipment.client.*;

public class Management {
	private Stock stock;
	private CustomerBase customBase;

	public Management() {
		stock = new Stock();
		Equipment[] equip = new Equipment[15];
		customBase = new CustomerBase();
		Client[] client = new Client[15];
		customBase.setClient(client);

		newEquipment(equip, "Bike", "LTD Rocco 60 Hydraulic Disk",10.5);
		newEquipment(equip, "Bike", "Stels Navigator 500 MD",11.2);
		newEquipment(equip, "Castle", "Vinca Sport черный 101.715",0.9);
		newEquipment(equip, "Castle", "Longus 10/650 3550014",0.87);
		newEquipment(equip, "Pump", "Sahoo 31074",0.57);
		newEquipment(equip, "Pump", "Bicycle Gear BG-72627",0.77);
		newEquipment(equip, "Scooter", "Hors 052",117.2);
		newEquipment(equip, "Scooter", "M1NSK D4 50",121.3);

		createRentStation();
	}

	public CustomerBase getCustomBase() {
		return customBase;
	}

	public void setCustomBase(CustomerBase customBase) {
		this.customBase = customBase;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void newClient() {
		addClient("Vasya", 100007, 100004, 100002);
		addClient("Petya", 100001);
	}

	private String timeStartRenting() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		return dateFormat.format(new Date());
	}

	private String timeStopRenting(String startHour) {
		String h1;
		int h;
		h1 = startHour.substring(0, 2);
		h = Integer.parseInt(h1) + 1;
		h1 = Integer.toString(h);
		if (h1.length() == 1) {
			h1 = "0" + h1;
		}
		h1 = h1 + startHour.substring(2, 8);
		return h1;
	}

	private void newEquipment(Equipment[] equip, String title, String type, double weight) {
		int namber = stock.getNamber();
		int id = stock.getId();
		switch (title) {
		case "Bike": {
			equip[namber] = new Bike();
			break;
		}
		case "Castle": {
			equip[namber] = new Castle();
			break;
		}
		case "Pump": {
			equip[namber] = new Pump();
			break;
		}
		case "Scooter": {
			equip[namber] = new Scooter();
			break;
		}
		}
		equip[namber].setId(id);
		equip[namber].setType(type);
		equip[namber].setWeight(weight);
		id++;
		namber++;
		stock.setEquipment(equip);
		stock.setId(id);
		stock.setNamber(namber);
	}

	private void createRentStation() {
		Equipment[] eq1 = stock.getEquipment();
		boolean avInStock = true;
		int length;
		length = eq1.length;
		Equipment[] eq2 = new Equipment[length];
		for (int i = 0; i < length; i++) {
			if (eq1[i] != null) {
				avInStock = eq1[i].isAvailabilityInStock();
				if (avInStock != false) {
					eq2[i] = eq1[i];
				}
			}
		}
		RentStation rentStation = new RentStation();
		rentStation.setUnits(eq2);
		stock.setRentStation(rentStation);
	}

	private void addClient(String nameClient, int id) {
		int availId;
		int amount = customBase.getAmount();
		availId = findId(id);
		if (availId >= 0) {
			Equipment[] equip2;
			equip2 = stock.getEquipment();
			equip2[availId] = newCl(equip2[availId], nameClient);
			Equipment[] equip = new Equipment[3];
			equip[0] = equip2[availId];
			RentUnit rentUnit = new RentUnit();
			rentUnit.setUnits(equip);
			Client[] client = customBase.getClient();
			client[amount] = new Client();
			client[amount].setNameClient(nameClient);
			client[amount].setRentUnit(rentUnit);
			amount++;
			customBase.setAmount(amount);
			customBase.setClient(client);
			createRentStation();
		} else {
			OutInPut.printText("Equipment not found!!!");
		}
	}

	private void addClient(String nameClient, int id, int id2) {
		int availId, availId2;
		int amount = customBase.getAmount();
		availId = findId(id);
		availId2 = findId(id2);
		if ((availId >= 0) && (availId2 >= 0)) {
			Equipment[] equip2;
			equip2 = stock.getEquipment();
			equip2[availId] = newCl(equip2[availId], nameClient);
			equip2[availId2] = newCl(equip2[availId2], nameClient);
			Equipment[] equip = new Equipment[3];
			equip[0] = equip2[availId];
			equip[1] = equip2[availId2];
			RentUnit rentUnit = new RentUnit();
			rentUnit.setUnits(equip);
			Client[] client = customBase.getClient();
			client[amount] = new Client();
			client[amount].setNameClient(nameClient);
			client[amount].setRentUnit(rentUnit);
			amount++;
			customBase.setAmount(amount);
			customBase.setClient(client);
			createRentStation();
		} else {
			OutInPut.printText("Equipment not found!!!");
		}
	}

	private void addClient(String nameClient, int id, int id2, int id3) {
		int availId, availId2, availId3;
		int amount = customBase.getAmount();
		availId = findId(id);
		availId2 = findId(id2);
		availId3 = findId(id3);
		if ((availId >= 0) && (availId2 >= 0) && (availId3 >= 0)) {
			Equipment[] equip2;
			equip2 = stock.getEquipment();
			equip2[availId] = newCl(equip2[availId], nameClient);
			equip2[availId2] = newCl(equip2[availId2], nameClient);
			equip2[availId3] = newCl(equip2[availId3], nameClient);
			Equipment[] equip = new Equipment[3];
			equip[0] = equip2[availId];
			equip[1] = equip2[availId2];
			equip[2] = equip2[availId3];
			RentUnit rentUnit = new RentUnit();
			rentUnit.setUnits(equip);
			Client[] client = customBase.getClient();
			client[amount] = new Client();
			client[amount].setNameClient(nameClient);
			client[amount].setRentUnit(rentUnit);
			amount++;
			customBase.setAmount(amount);
			customBase.setClient(client);
			createRentStation();
		} else {
			OutInPut.printText("Equipment not found!!!");
		}
	}

	private Equipment newCl(Equipment equipment, String nameClient) {
		String date1, date2;
		equipment.setAvailabilityInStock(false);
		equipment.setNameOfTenant(nameClient);
		date1 = timeStartRenting();
		equipment.setTimeStartRenting(date1);
		date2 = timeStopRenting(date1);
		equipment.setTimeStopRenting(date2);
		return equipment;
	}

	private int findId(int id) {
		int avId = -5;
		RentStation rentStation = stock.getRentStation();
		Equipment[] equipment = rentStation.getUnits();
		for (int i = 0; i < equipment.length; i++) {
			if (equipment[i] != null) {

				if (equipment[i].getId() == id) {
					avId = i;
					break;
				}
			}
		}
		return avId;
	}
	public void findTitleEq(String nameEquip){
		int i = 0;
		Equipment[] equip = stock.getEquipment();
		OutInPut.printText("SEARCH ON REQUEST - "+nameEquip+":");
		for (Equipment equipment: equip){
			if ((equipment!=null)&&(equipment.getTitle()==nameEquip)) {
				OutInPut.printEquipment(equipment);
				i++;
			}
		}
		if (i==0) {
			OutInPut.printText("NOTHING FOUND");
		}
		OutInPut.printLine();
	}
	public void findWeightEq(double weight){
		int i = 0;
		OutInPut.printText("EQUIPMENT, WHOSE WEIGHT IS LESS THAN "+weight+" KILOGRAMS:");
		Equipment[] equip = stock.getEquipment();
		for (Equipment equipment: equip){
			if ((equipment!=null)&&(equipment.getWeight()<weight)) {
				OutInPut.printEquipment2(equipment);
				i++;
			}
		}
		if (i==0){
			OutInPut.printText("NOTHING FOUND");
		}
		OutInPut.printLine();
	}

	public void printClient() {
		OutInPut.printText("CUSTOMERS:");
		PrintInfo.printClient(customBase);
	}

	public void printRentStat() {
		OutInPut.printText("FREE EQUIPMENT:");
		PrintInfo.printRentStat(stock);
	}

	public void printStock() {
		OutInPut.printText("ALL EQUIPMENT IN STOCK:");
		PrintInfo.printStock(stock);

	}
}
