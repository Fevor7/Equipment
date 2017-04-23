package by.htp.equipment.work;

import by.htp.equipment.work.OutInPut;
//import java.util.Collection;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import by.htp.equipment.accessory.Castle;
import by.htp.equipment.accessory.Pump;
import by.htp.equipment.array.Stock;
import by.htp.equipment.entity.*;

public class WorkWithFiles {

//	public static void createFile(String nameFile) {
//		File file = new File(nameFile);
//		if (file.exists()) {
//			file.delete();
//		} else {
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public static void writeToFile(String nameFile, String line) {
//		try (FileOutputStream ff = new FileOutputStream(nameFile, true)) {
//			line = line + "\r\n";
//			byte[] arrayByte = line.getBytes();
//			ff.write(arrayByte, 0, arrayByte.length);
//		} catch (IOException e) {
//			e.printStackTrace();
//			OutInPut.printText("File error!!");
//		}
//
//	}
//
//	public static Stock readWithFile(String nameFile, Stock stock) {
//		Equipment[] equipment = new Equipment[8];
//
//		try (FileInputStream fin = new FileInputStream(nameFile)) {
//			int k = 0;
//			String s = "";
//			int i = -1;
//			while ((i = fin.read()) != -1) {
//				s = s + String.valueOf(((char) i));
//				if (i == (byte) 10) {
//					// equipment[k] = new Bike();
//					equipment = writeEquipment(s, equipment, k);
//					s = "";
//					k++;
//				}
//
//			}
//		} catch (IOException ex) {
//
//			ex.printStackTrace();
//			OutInPut.printText("File error!!");
//		}
//		stock.setEquipment(equipment);
//		return stock;
//	}
//
//	public static Equipment[] writeEquipment(String s, Equipment[] equipment, int k) {
//		int n = 0;
//		int id;
//		String[] s1 = new String[6];
//		
//		for (String ss : s.split(", ")) {
//			s1[n] = ss;
//			n++;
//		}
//		id = Integer.parseInt(s1[0]);
//		switch (s1[1]) {
//		case "Bike": {
//			Bike bike = new Bike();
//			bike.setFrameMaterial((s1[5]).replace("\r\n", ""));
//			equipment[k] = bike;
//			break;
//		}
//		case "Castle": {
//			equipment[k] = new Castle();
//			break;
//		}
//		case "Pump": {
//			equipment[k] = new Pump();
//			break;
//		}
//		case "Scooter": {
//			Scooter scooter = new Scooter();
//			scooter.setEngineCapacity((s1[5]).replace("\r\n", ""));
//			equipment[k] = scooter;
//			break;
//		}
//		}
//		equipment[k].setId(id);
//		equipment[k].setType(s1[2]);
//		equipment[k].setWeight(Double.parseDouble(s1[3]));
//		return equipment;
//	}
}
