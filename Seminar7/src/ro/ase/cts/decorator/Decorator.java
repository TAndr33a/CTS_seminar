package ro.ase.cts.decorator;

public class Decorator extends DecoratorAbstract{

	public Decorator(Card card) {
		super(card);//apelam constructor
		
	}

	@Override
	public void platesteContactLess(int suma) {
	
		if(super.getCard().getSold()>suma){//super.getCard->apelam card din parinte
		System.out.println("A facut plata prin curier contactless:"+suma);
		super.getCard().setSold(super.getCard().getSold()-suma);
	}
	}
}
