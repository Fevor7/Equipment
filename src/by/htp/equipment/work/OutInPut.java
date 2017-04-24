package by.htp.equipment.work;

import by.htp.equipment.accessory.*;
import by.htp.equipment.client.Client;
import by.htp.equipment.client.RentUnit;
import by.htp.equipment.entity.Equipment;
import by.htp.equipment.entity.*;

import java.util.List;
import java.util.Scanner;

public class OutInPut {
	public static void printEquipment(Equipment equi) {
		System.out.print(equi.getId() + " - " + equi.getTitle() + ": " + equi.getType() + "; Availability in stock: "
				+ equi.isAvailabilityInStock());
		if (equi.isAvailabilityInStock() == false) {
			System.out.print("; Customer name: " + equi.getNameOfTenant() + "; start time: "
					+ equi.getTimeStartRenting() + "; stop time: " + equi.getTimeStopRenting());

		}
		if (equi.getTitle() == "Bike") {
			Bike bike = (Bike) equi;
			System.out.print("; Frame Material: " + bike.getFrameMaterial());
			List<BicycleAcces> list2 = bike.getAccessor();
			printBikeAcces(list2);
			
		}
		if (equi.getTitle() == "Scooter") {
			Scooter scooter = (Scooter) equi;
			System.out.print("; Engine capacity: " + scooter.getEngineCapacity());
			List<ScooterAcces> list2 = scooter.getAccessor();
			printScootAcces(list2);
		}
		System.out.println("");
	}

	private static void printScootAcces(List<ScooterAcces> list){
		if (list!=null){
			System.out.println("");
			for (int i =0; i<list.size(); i++){
				ScooterAcces scoot = list.get(i);
				System.out.println("                       Id: "+scoot.getId()+", title: "+scoot.getTitle()+",type: "+scoot.getType());
			}
		}
	}
	private static void printBikeAcces(List<BicycleAcces> list){
		if (list!=null){
			System.out.println("");
			for (int i =0; i<list.size(); i++){
				BicycleAcces bike = list.get(i);
				System.out.println("                       Id: "+bike.getId()+", title: "+bike.getTitle()+",type: "+bike.getType());
			}
		}
	}
	
	public static void printEquipment2(Equipment equi) {
		System.out.print(equi.getId() + " - " + equi.getTitle() + ": " + equi.getType() + "; Availability in stock: "
				+ equi.isAvailabilityInStock() + "; Weight: " + equi.getWeight());
		if (equi.isAvailabilityInStock() == false) {
			System.out.print("; Customer name: " + equi.getNameOfTenant());
		}
		System.out.println("");
	}

	public static void printLine() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------");
	}

	public static void printClient(Client client) {
		System.out.print(client.getNameClient() + ": ");
		RentUnit rentUnit = client.getRentUnit();
		List<Equipment> equip = rentUnit.getUnits();
		Equipment eq;
		for(int i = 0; i< equip.size(); i++){
			eq = equip.get(i);
			printEquipment(eq);
			//System.out.println("");
		}
		System.out.println("");
	}

	public static void printText(String text) {
		System.out.println(text);
	}


	public static void printGB() {
		System.out.println("Good Bye!!!");
	}
}
