package ro.ase.cts.memento;

public class Main {
	public static void main(String[] args) {
		MeciJucat meci = new MeciJucat(150,"Echipa2",250,145);
		Memento memento=meci.creareMemento();
		ManagerMemento manager=new ManagerMemento();
		manager.adaugareMemento(memento);
		
		meci.setNumarSpectatori(7500);
		meci.setNumarBileteVandute(2780);
		meci.setNumeEchiaGazda("Real");
		meci.setNumeEchipaOaspeti("FCSB");
		
		manager.adaugaMemento(meci.creareMemento());
		System.out.println(meci.toString());
		meci.setMememnto(manager.getMemento(0));
		System.out.println(meci.toString());
		meci.setMemento(manager.getLastMemento());
		System.out.println(meci.toString());
	}
}
