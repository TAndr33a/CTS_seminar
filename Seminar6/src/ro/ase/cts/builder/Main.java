package ro.ase.cts.builder;

public class Main {
		public static void main(String[] args) {
			Rezervare r1=new Rezervare(12345,false,false,false,true, "rock");
			Rezervare r2=new RezervareBuilder().setCodRezervare(15).setAreScaunErgonomic(true).build();
			Rezervare r3=new RezervareBuilder().setCodRezervare(23).setAreBauturaInclusa(true).setAreMuzicaAmbientala(true).build();
			
			System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
			
			
			RezervareBuilderV2 rezervareBuilderV2=new RezervareBuilderV2();
			rezervareBuilderV2.setAreMancareInclus(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
			Rezevare rezervare3=rezervareBuilderV2.setCodRezervare(4).build();
			Rezevare rezervare4=rezervareBuilderV2.setCodRezervare(4).build();
		}
}
