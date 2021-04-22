package ro.ase.cts.Strategy;

public class Client {
	private String nume;
	
	private Strategy strategy;

	public Client(String nume, Strategy strategy) {
		super();
		this.nume = nume;
		this.strategy = strategy;
	}

	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void  platesteNota(int suma) {
		strategy.realizeazaPlata(suma);
		System.out.println(nume+"are de platit"+suma+"lei");
	}
}
