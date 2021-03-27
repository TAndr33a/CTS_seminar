package ro.ase.cts.factory.main;

import ro.ase.cts.factory.Factory;
import ro.ase.cts.factory.Jucator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory facory=new Factory();
		Jucator portar = facotry.getJucator(TipJucator.Portar,"Dorel");
		Jucator fundas = factory.getJucator(TipJucator.Fundas,"Ionel");
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}

}
