package by.htp.equipment.array;

import java.util.ArrayList;
import java.util.List;

import by.htp.equipment.client.*;

public class CustomerBase {
	private List<Client> client = new ArrayList<Client>();
	private int amount = 0;

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
