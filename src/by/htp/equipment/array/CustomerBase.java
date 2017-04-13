package by.htp.equipment.array;

import by.htp.equipment.client.*;

public class CustomerBase {
	private Client[] client;
	private int amount = 0;

	public Client[] getClient() {
		return client;
	}

	public void setClient(Client[] client) {
		this.client = client;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
