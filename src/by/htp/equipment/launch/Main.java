package by.htp.equipment.launch;

import by.htp.equipment.work.Management;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Management manag = new Management();
		manag.newClient();
		manag.printStock();
		manag.printClient();
		manag.printRentStat();

	}

}
