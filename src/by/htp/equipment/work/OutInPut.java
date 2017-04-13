package by.htp.equipment.work;

import by.htp.equipment.client.Client;
import by.htp.equipment.client.RentUnit;
import by.htp.equipment.entity.Equipment;
import java.util.Scanner;

public class OutInPut {
	public static void printEquipment(Equipment equi) {
		System.out.print(equi.getId() + " - " + equi.getTitle() + ": " + equi.getType() + "; Availability in stock: "
				+ equi.isAvailabilityInStock());
		if (equi.isAvailabilityInStock() == false) {
			System.out.print("; Customer name: " + equi.getNameOfTenant() + "; start time: "
					+ equi.getTimeStartRenting() + "; stop time: " + equi.getTimeStopRenting());
		}
		System.out.println("");
	}
	public static void printEquipment2(Equipment equi) {
		System.out.print(equi.getId() + " - " + equi.getTitle() + ": " + equi.getType() + "; Availability in stock: "
				+ equi.isAvailabilityInStock()+"; Weight: "+equi.getWeight());
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
		Equipment[] units = rentUnit.getUnits();
		for (Equipment equipment : units) {
			if (equipment != null) {
				System.out.print(equipment.getId() + " ");
			}
		}
		System.out.println("");
	}

	public static void printText(String text) {
		System.out.println(text);
	}

	public static int scanMenu() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}

	public static void printGB() {
		System.out.println("Good Bye!!!");
	}
}
