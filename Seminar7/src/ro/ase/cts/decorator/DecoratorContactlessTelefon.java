package ro.ase.cts.decorator;

public class DecoratorContactlessTelefon extends DecoratorAbstract{

	
	
	public DecoratorContactlessTelefon(Card card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactLess(int suma) {
		// TODO Auto-generated method stub
		if(super.getCard().getSold()>suma) {
			System.out.println("S-a realizat plata cu telefonul:"+suma);
			super.getCard().setSold(super.getCard().getSold() - suma);
		}
	}

}
