package ro.ase.cts.Strategy;

public class Card implements Strategy{

	@Override
	public void realizeazaPlata(int suma) {
		// TODO Auto-generated method stub
		System.out.println("S-a realizat plata cu cardul pentu suma de"+suma);
	}

}
