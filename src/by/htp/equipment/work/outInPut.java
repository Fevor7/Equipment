package by.htp.equipment.work;

import by.htp.equipment.entity.Equipment;

public class outInPut {
	public static void printEquipment(Equipment equi){
		System.out.print(equi.getId()+" - "+equi.getTitle()+ ": "+equi.getType()+"; Availability in stock: "+equi.isAvailabilityInStock());	
		if(equi.isAvailabilityInStock()==false){
			System.out.print("; Customer name: "+equi.getNameOfTenant()+"; start time: "+equi.getTimeStartRenting());
		}
		System.out.println("");
	}
	public static void printLine(){
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
	}
}
