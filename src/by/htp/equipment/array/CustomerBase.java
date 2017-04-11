package by.htp.equipment.array;
import by.htp.equipment.client.*;

public class CustomerBase {
	private Client[] client;
	
	public CustomerBase() {
		client = new Client[15];
	}
	public Client[] getClient() {
		return client;
	}

	public void setClient(Client[] client) {
		this.client = client;
	}
	
}
