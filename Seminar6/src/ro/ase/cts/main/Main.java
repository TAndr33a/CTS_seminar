package ro.ase.cts.main;

import ro.ase.cts.adapter.Bilet;
import ro.ase.cts.adapter.BiletAdapter;

public class Main {

	public static void rezervareSiVindeBiletCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vinde();
	}
	
	
	public static void rezervaSiVindeBiletPePlatforma(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bilet bilet=new Bilet(20);
			rezervareSiVindeBiletCasa(bilet);
	}
	
	BiletAdapter biletAdapter=new BiletAdapter(30);
	rezervareSiVindeBiletePePlatforma(biletAdapter);
	adapterBilet.rezervareBiletOnline();
	
	BiletOnline biletOnline=AdapterBiletObiecte(bilet);
	rezervareSiVindeBiletePePlatorma(biletOnline);

}
