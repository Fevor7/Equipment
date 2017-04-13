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

		newEquipment(equip, "Bike", "LTD Rocco 60 Hydraulic Disk");
		newEquipment(equip, "Bike", "Stels Navigator 500 MD");
		newEquipment(equip, "Castle", "Vinca Sport черный 101.715");
		newEquipment(equip, "Castle", "Longus 10/650 3550014");
		newEquipment(equip, "Pump", "Sahoo 31074");
		newEquipment(equip, "Pump", "Bicycle Gear BG-72627");
		newEquipment(equip, "Scooter", "Hors 052");
		newEquipment(equip, "Scooter", "M1NSK D4 50");

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
		addClient("Vasya", 100007);
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

	private void newEquipment(Equipment[] equip, String title, String type) {
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
	private void addClient(String nameClient,  int id) {
		int availId, availId2;
		availId = findId(id);
		if (availId > 0) {
			String date1, date2;
			Client[] client = customBase.getClient();
			int amount = customBase.getAmount();
			client[amount] = new Client();
			client[amount].setNameClient(nameClient);

			Equipment[] equip2;
			equip2 = stock.getEquipment();

			equip2[availId].setAvailabilityInStock(false);
			equip2[availId].setNameOfTenant(nameClient);
			date1 = timeStartRenting();
			equip2[availId].setTimeStartRenting(date1);
			date2 = timeStopRenting(date1);
			equip2[availId].setTimeStopRenting(date2);

			RentUnit rentUnit = new RentUnit();
			Equipment[] equip = new Equipment[3];
			equip[0] = equip2[availId];
			rentUnit.setUnits(equip);
			client[amount].setRentUnit(rentUnit);
			customBase.setClient(client);
			createRentStation();
		} else {
			OutInPut.printText("Equipment not found!!!");
		}

	}
	private void addClient(String nameClient, int id, int id2) {
		int availId, availId2;
		availId = findId(id);
		availId2 = findId(id2);
		if ((availId > 0) && (availId2 > 0)) {
			String date1, date2;
			Client[] client = customBase.getClient();
			int amount = customBase.getAmount();
			client[amount] = new Client();
			client[amount].setNameClient(nameClient);

			Equipment[] equip2;
			equip2 = stock.getEquipment();

			equip2[availId].setAvailabilityInStock(false);
			equip2[availId].setNameOfTenant(nameClient);
			date1 = timeStartRenting();
			equip2[availId].setTimeStartRenting(date1);
			date2 = timeStopRenting(date1);
			equip2[availId].setTimeStopRenting(date2);

			equip2[availId2].setAvailabilityInStock(false);
			equip2[availId2].setNameOfTenant("Vasya");
			equip2[availId2].setTimeStartRenting(date1);
			equip2[availId2].setTimeStopRenting(date2);

			RentUnit rentUnit = new RentUnit();
			Equipment[] equip = new Equipment[3];
			equip[0] = equip2[availId];
			equip[1] = equip2[availId2];
			rentUnit.setUnits(equip);
			client[amount].setRentUnit(rentUnit);
			customBase.setClient(client);
			createRentStation();
		} else {
			OutInPut.printText("Equipment not found!!!");
		}

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

	public void printClient() {
		PrintInfo.printClient(customBase);
	}

	public void printRentStat() {
		PrintInfo.printRentStat(stock);
	}

	public void printStock() {
		PrintInfo.printStock(stock);
	}
}
