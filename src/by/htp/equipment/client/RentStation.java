package by.htp.equipment.client;

import by.htp.equipment.entity.Equipment;

public class RentStation {
	//снаряжение, доступное для проката
	public class RentUnit {
		private Equipment[] units;

		public Equipment[] getUnits() {
			return units;
		}

		public void setUnits(Equipment[] units) {
			this.units = units;
		}
	}
}
