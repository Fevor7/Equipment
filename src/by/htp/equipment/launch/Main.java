package by.htp.equipment.launch;

import by.htp.equipment.work.Management;
import by.htp.equipment.work.OutInPut;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Management manag = new Management();
		manag.printStock();
		manag.newClient();
		manag.printStock();
		manag.printClient();
		manag.printRentStat();
		manag.findTitleEq("Scooter");
		manag.findWeightEq(2.1);
		OutInPut.printGB();
	}
}