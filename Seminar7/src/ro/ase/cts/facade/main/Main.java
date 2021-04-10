package ro.ase.cts.facade.main;

import ro.ase.cts.facade.BirouDeCredite;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana persoana=new Persoana("Andreea","12345671231822");
		if(persoana.getVarsta()>=18 ) {
			if(!Politie.esteUrmarit(persoana)) {
				BirouDeCredite birou=new BirouDeCredite();
				if(!birou.areCredite(persoana)) {
					System.out.println("S-a cret contul");
				}
			}
		}
	}

	Persoana persoana2=new Persoana("Marian","15545671231822");
	if(Facade.facade(persoana2)) {
		System.out.println("S-a creat contul");
	}else {
		System.out.println("Nu se poate");
	}
}
