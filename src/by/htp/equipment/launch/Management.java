package by.htp.equipment.launch;

import by.htp.equipment.entity.*;
import by.htp.equipment.array.*;
import by.htp.equipment.client.*;

public class Management {
	private Stock stock;
	private CustomerBase customBase;

	public Management() {
		stock = new Stock();
		int id;
		int namber;
		Equipment[] equip = new Equipment[10];
		namber = stock.getNamber();
		id = stock.getId();
		equip[namber] = new Bike();
		equip[namber].setId(id);
		equip[namber].setType("LTD Rocco 60 Hydraulic Disk");
		id++;
		namber++;
		equip[namber] = new Bike();
		equip[namber].setId(id);
		id++;
		equip[namber].setType("Stels Navigator 500 MD");
		namber++;

		equip[namber] = new Castle();
		equip[namber].setId(id);
		id++;
		equip[namber].setType("Vinca Sport черный [101.715]");
		namber++;
		equip[namber] = new Castle();
		equip[namber].setId(id);
		id++;
		equip[namber].setType("Longus 10/650 [3550014]");
		namber++;

		equip[namber] = new Pump();
		equip[namber].setId(id);
		id++;
		equip[namber].setType("Sahoo 31074 ");
		namber++;
		equip[namber] = new Pump();
		equip[namber].setId(id);
		id++;
		equip[namber].setType("Bicycle Gear BG-72627");
		namber++;

		equip[namber] = new Scooter();
		equip[namber].setId(id);
		id++;
		equip[namber].setType("Hors 052");
		namber++;

		equip[namber] = new Scooter();
		equip[namber].setId(id);
		id++;
		equip[namber].setType("M1NSK D4 50");
		namber++;

		stock.setEquip(equip);
		stock.setId(id);
		stock.setNamber(namber);
	}

	public void clientInit() {
		setCustomBase(new CustomerBase());
		Client[] client = new Client[15];

		client[0] = new Client();
		client[0].setNameClient("Vasya");

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
}
