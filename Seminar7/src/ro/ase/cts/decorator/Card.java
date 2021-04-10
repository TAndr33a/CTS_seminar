package ro.ase.cts.decorator;

public class Card implements CardAbstract {

	private String titular;
	private int sold;
	
	
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public Card(String titular, int sold) {
		super();
		this.titular = titular;
		this.sold = sold;
	}

	public String getTitular() {
		return titular;
	}

	public int getSold() {
		return sold;
	}

	@Override
	public void realizeazaPlataOnline(int suma) {
		// TODO Auto-generated method stub
		if(sold>suma) {
			System.out.println("S-a realizat plata online:"+suma);
			sold-=suma;
		}
		
	}

	@Override
	public void realizeazaPlataNormala(int suma) {
		// TODO Auto-generated method stub
		if(sold>suma) {
			System.out.println("S-a realizat plata normala:"+suma);
			sold-=suma;
		}
	}

}
