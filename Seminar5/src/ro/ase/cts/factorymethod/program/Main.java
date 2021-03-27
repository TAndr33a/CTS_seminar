package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.Factory;
import ro.ase.cts.factorymethod.FactoryFundas;
import ro.ase.cts.factorymethod.FactoryPortar;
import ro.ase.cts.factorymethod.Jucator;

public class Main {
 private static void afiseazaJucator(Factory factory) {
	 Jucator jucator=factory.creeazaJucator(numeJucator);
	 System.out.println(jucator.toString());
 }
	
	public static void main(String[] args) {
		afiseazaJucator(new FactoryPortar(),"Mihai");
		afiseazaJucator(new FactoryFundas(),"Ion");
	}
}
