package by.htp.equipment.work;

import java.text.SimpleDateFormat;
import java.util.Date;

import by.htp.equipment.accessory.Castle;
import by.htp.equipment.accessory.Pump;
import by.htp.equipment.array.CustomerBase;
import by.htp.equipment.array.Stock;
import by.htp.equipment.client.Client;
import by.htp.equipment.client.RentStation;
import by.htp.equipment.client.RentUnit;
import by.htp.equipment.entity.Bike;
import by.htp.equipment.entity.Equipment;
import by.htp.equipment.entity.Scooter;

public interface Manag {
	
	void initializationEquip();
	
	CustomerBase getCustomBase();

	void setCustomBase(CustomerBase customBase);

	Stock getStock();

	void setStock(Stock stock);

	void newClient();

	void findTitleEq(String nameEquip);

	void findWeightEq(double weight);

	void printClient();

	void printRentStat();

	void printStock();

}
