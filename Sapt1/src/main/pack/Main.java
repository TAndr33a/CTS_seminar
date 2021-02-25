package main.pack;

import ro.ase.cts.zoo.Giraffe;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.Zookeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zookeper keeper = new Zookeper("Dani");
		Zoo zoo = new Zoo();
		zoo.setZookeper(keeper);
	
	Giraffe giraffe=new Giraffe("Girafa",10);
	Giraffe secondGiraffe=new Giraffe("Girafa2",15,200);
	
	zoo.addAnimal(giraffe);
	zoo.addAnimal(secondGiraffe);
	
	zoo.feedAllAnimals();
	
	Zebra z1=new Zebra("Zebra1",7);
	Zebra z2=new Zebra("Zebra2",9,12);
	
	zoo.addAnimal(z1);
	zoo.addAnimal(z2);
	}

}
