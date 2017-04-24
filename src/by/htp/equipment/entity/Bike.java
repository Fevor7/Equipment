package by.htp.equipment.entity;
import java.util.ArrayList;
import java.util.List;
import by.htp.equipment.accessory.*;


public class Bike extends Equipment {
	private List<BicycleAcces> accessor = new ArrayList<BicycleAcces>();
	private String frameMaterial;
	public Bike() {
		super.setTitle("Bike");
	}
	public String getFrameMaterial() {
		return frameMaterial;
	}
	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}
	public List<BicycleAcces> getAccessor() {
		return accessor;
	}
	public void setAccessor(List<BicycleAcces> accessor) {
		this.accessor = accessor;
	}
}
