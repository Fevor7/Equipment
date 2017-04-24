package by.htp.equipment.work;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.htp.equipment.accessory.BagWithTools;
import by.htp.equipment.accessory.BicycleAcces;
import by.htp.equipment.accessory.Castle;
import by.htp.equipment.accessory.Helmet;
import by.htp.equipment.accessory.Pump;
import by.htp.equipment.accessory.ScooterAcces;
import by.htp.equipment.array.CustomerBase;
import by.htp.equipment.array.Stock;
import by.htp.equipment.client.Client;
import by.htp.equipment.client.RentStation;
import by.htp.equipment.client.RentUnit;
import by.htp.equipment.entity.Bike;
import by.htp.equipment.entity.Equipment;
import by.htp.equipment.entity.Scooter;

public class ManagArrList implements Manag {
	private Stock stock;
	private CustomerBase customBase;

	public ManagArrList() {
		initializationEquip();
	}

	public CustomerBase getCustomBase() {
		return customBase;
	}

	public void setCustomBase(CustomerBase customBase) {
		this.customBase = customBase;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void newClient() {
		addClient("Vasya", 100004, 100004, 100007);
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

	private List<Equipment> newEquipment(List<Equipment> equip, String title, String type, double weight,
			String additionalParam) {
		Equipment eq = null;
		int namber = stock.getNamber();
		int id = stock.getId();
		switch (title) {
		case "Bike": {
			eq = new Bike();
			eq.setId(id);
			id++;
			Bike bike = (Bike) eq;
			bike.setFrameMaterial(additionalParam);
			eq = newAccess(eq, "Castle", "Vinca Sport black 101.715", id);
			id++;
			eq = newAccess(eq, "Pump", "Bicycle Gear BG-72627", id);
			id++;
			break;
		}

		case "Scooter": {
			eq = new Scooter();
			eq.setId(id);
			id++;
			Scooter scooter = (Scooter) eq;
			scooter.setEngineCapacity(additionalParam);
			eq = newAccess(eq, "BagWithTools", "Force 41082 108", id);
			id++;
			eq = newAccess(eq, "Helmet", "LS2 OF562", id);
			id++;
			break;
		}
		}

		eq.setType(type);
		eq.setWeight(weight);
		namber++;

		equip.add(eq);
		stock.setId(id);
		stock.setNamber(namber);
		return equip;
	}

	private Equipment newAccess(Equipment equip, String title, String type, int id2) {
		if (equip != null) {
			String title2 = equip.getTitle();
			switch (title2) {
			case "Bike": {
				Bike bike = (Bike) equip;
				List<BicycleAcces> list = bike.getAccessor();
				newBicycleAcces(id2, list, title, type);
				break;
			}
			case "Scooter": {
				Scooter scooter = (Scooter) equip;
				List<ScooterAcces> list = scooter.getAccessor();
				newScootAcces(id2, list, title, type);
				break;
			}
			}
		}

		return equip;
	}

	private void newScootAcces(int id3, List<ScooterAcces> list, String title, String type) {
		ScooterAcces scootAc = null;
		switch (title) {
		case "BagWithTools": {
			scootAc = new BagWithTools();
			break;
		}
		case "Helmet": {
			scootAc = new Helmet();
			break;
		}
		}
		scootAc.setType(type);
		scootAc.setTitle(title);
		scootAc.setId(id3);
		list.add(scootAc);
	}

	private void newBicycleAcces(int id3, List<BicycleAcces> list, String title, String type) {
		BicycleAcces bikeAc = null;
		switch (title) {
		case "Pump": {
			bikeAc = new Pump();
			break;
		}
		case "Castle": {
			bikeAc = new Castle();
			break;
		}
		}
		bikeAc.setType(type);
		bikeAc.setTitle(title);
		bikeAc.setId(id3);
		list.add(bikeAc);
	}

	private void createRentStation() {
		RentStation rentStation = new RentStation();
		List<Equipment> eqip = stock.getEquipment();
		rentStation.setUnits(eqip);
		stock.setRentStation(rentStation);
	}

	private void addClient(String nameClient, int id) {
		// int availId;
		// int amount = customBase.getAmount();
		// availId = findId(id);
		// if (availId >= 0) {
		// Equipment[] equip2;
		// equip2 = stock.getEquipment();
		// equip2[availId] = newCl(equip2[availId], nameClient);
		// Equipment[] equip = new Equipment[3];
		// equip[0] = equip2[availId];
		// RentUnit rentUnit = new RentUnit();
		// rentUnit.setUnits(equip);
		// Client[] client = customBase.getClient();
		// client[amount] = new Client();
		// client[amount].setNameClient(nameClient);
		// client[amount].setRentUnit(rentUnit);
		// amount++;
		// customBase.setAmount(amount);
		// customBase.setClient(client);
		// createRentStation();
		// } else {
		// OutInPut.printText("Equipment not found!!!");
		// }
	}

	private void addClient(String nameClient, int id, int id2) {
		// int availId, availId2;
		// int amount = customBase.getAmount();
		// availId = findId(id);
		// availId2 = findId(id2);
		// if ((availId >= 0) && (availId2 >= 0)) {
		// Equipment[] equip2;
		// equip2 = stock.getEquipment();
		// equip2[availId] = newCl(equip2[availId], nameClient);
		// equip2[availId2] = newCl(equip2[availId2], nameClient);
		// Equipment[] equip = new Equipment[3];
		// equip[0] = equip2[availId];
		// equip[1] = equip2[availId2];
		// RentUnit rentUnit = new RentUnit();
		// rentUnit.setUnits(equip);
		// Client[] client = customBase.getClient();
		// client[amount] = new Client();
		// client[amount].setNameClient(nameClient);
		// client[amount].setRentUnit(rentUnit);
		// amount++;
		// customBase.setAmount(amount);
		// customBase.setClient(client);
		// createRentStation();
		// } else {
		// OutInPut.printText("Equipment not found!!!");
		// }
	}

	private void addClient(String nameClient, int id, int id2, int id3) {

		Equipment equip=null;
		equip = findId(id);
		if (equip != null) {
			addCl(nameClient, equip);
		}
		equip=null;
		equip = findId(id2);
		if (equip != null) {
			addCl(nameClient, equip);
		}
		equip=null;
		equip = findId(id3);
		if (equip != null) {
			addCl(nameClient, equip);
		}

	}

	private void addCl(String nameClient, Equipment equip) {

		List<Client> client = customBase.getClient();
		Client cl = new Client();
		RentUnit rentUnit = new RentUnit();
		List<Equipment> units = new ArrayList<Equipment>();
		units.add(equip);
		rentUnit.setUnits(units);
		cl.setNameClient(nameClient);
		cl.setRentUnit(rentUnit);
		client.add(cl);
	}

	private Equipment findId(int id) {
		List<Equipment> list = stock.getEquipment();
		Equipment equip=null;
		for (int i = 0; i < list.size(); i++) {
			equip = list.get(i);
			if (equip.getId() == id) {
				return equip;
			}
		}
		return null;
	}

	public void findTitleEq(String nameEquip) {
		// int i = 0;
		// Equipment[] equip = stock.getEquipment();
		// OutInPut.printText("SEARCH ON REQUEST - " + nameEquip + ":");
		// for (Equipment equipment : equip) {
		// if ((equipment != null) && (equipment.getTitle() == nameEquip)) {
		// OutInPut.printEquipment(equipment);
		// i++;
		// }
		// }
		// if (i == 0) {
		// OutInPut.printText("NOTHING FOUND");
		// }
		// OutInPut.printLine();
	}

	public void findWeightEq(double weight) {
		// int i = 0;
		// OutInPut.printText("EQUIPMENT, WHOSE WEIGHT IS LESS THAN " + weight +
		// " KILOGRAMS:");
		// Equipment[] equip = stock.getEquipment();
		// for (Equipment equipment : equip) {
		// if ((equipment != null) && (equipment.getWeight() < weight)) {
		// OutInPut.printEquipment2(equipment);
		// i++;
		// }
		// }
		// if (i == 0) {
		// OutInPut.printText("NOTHING FOUND");
		// }
		// OutInPut.printLine();
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

	public void initializationEquip() {
		stock = new Stock();
		List<Equipment> equip = stock.getEquipment();
		customBase = new CustomerBase();
		equip = newEquipment(equip, "Bike", "LTD Rocco 60 Hydraulic Disk", 10.5, "aluminum");
		equip = newEquipment(equip, "Bike", "Stels Navigator 500 MD", 11.2, "steel");
		equip = newEquipment(equip, "Scooter", "Hors 052", 117.2, "500cc");
		equip = newEquipment(equip, "Scooter", "M1NSK D4 50", 121.3, "400cc");

		createRentStation();
	}

	@Override
	public Stock getStock() {
		// TODO Auto-generated method stub
		return null;
	}

}
