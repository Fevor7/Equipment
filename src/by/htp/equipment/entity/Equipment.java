package by.htp.equipment.entity;

public abstract class Equipment {
	// private Category category;
	private String title;
	private int id;
	private boolean AvailabilityInStock; 
	private String nameOfTenant;
	private String timeStartRenting;
	private String timeStopRenting;
	private String type;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isAvailabilityInStock() {
		return AvailabilityInStock;
	}
	public void setAvailabilityInStock(boolean availabilityInStock) {
		AvailabilityInStock = availabilityInStock;
	}
	public String getNameOfTenant() {
		return nameOfTenant;
	}
	public void setNameOfTenant(String nameOfTenant) {
		this.nameOfTenant = nameOfTenant;
	}
	public String getTimeStartRenting() {
		return timeStartRenting;
	}
	public void setTimeStartRenting(String timeStartRenting) {
		this.timeStartRenting = timeStartRenting;
	}
	public String getTimeStopRenting() {
		return timeStopRenting;
	}
	public void setTimeStopRenting(String timeStopRenting) {
		this.timeStopRenting = timeStopRenting;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
