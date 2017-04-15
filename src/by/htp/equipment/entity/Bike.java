package by.htp.equipment.entity;

public class Bike extends Equipment {
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

}
