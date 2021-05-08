package main;

import command.ComandaConstituire;
import command.ComandaDepunere;
import command.ContBancar;
import command.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ManagerComenzi manager=new ManagerComenzi();
			ContBancar cont=new ContBancar("RO34545334",0);
			
			manager.invoca(new ComandaConstituire(cont,1000));
			manager.invoca(new ComandaDepunere(cont,500));
			
			manager.executaComanda();
			manager.invoca(new ComandaRetragere(cont,900));
			manager.invoca(new ComandaRetragere(cont, 700));
			manager.executaComenzi();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
