package main.pack;

import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.Zookeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zookeper keeper = new Zookeper("Dani");
		Zoo zoo = new Zoo();
		zoo.setZookeper(keeper);
	}

}
