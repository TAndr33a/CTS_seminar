package ro.ase.cts.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
	private HashMap<String,Client> map;
	
	public FlyWeightFactory() {
		this.map= new HashMap<>();//aloc spatiu
	}
	
	public Client getClient(String nrTelefon) {
		Client client;
		client=map.get(nrTelefon);
		if(map.get(nrTelefon)==null) {
			client=new Client("Ion",nrTelefon,"email");
			map.put(nrTelefon, client);
		}
	
		return client;
	}
}
