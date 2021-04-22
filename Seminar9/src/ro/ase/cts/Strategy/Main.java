package ro.ase.cts.Strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Portofel portofel=new Portofel(300);
		Client client = new Client("Alin",portofel);
		client.platesteNota(200);
		client.setStrategy(new Card());
		client.platesteNota(110);
		client.setStrategy(portofel);
		client.platesteNota(200);
	}

}
