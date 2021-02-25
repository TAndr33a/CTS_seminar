package ro.ase.cts.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Zookeper getZookeper() {
		return zookeper;
	}

	public void setZookeper(Zookeper zookeper) {
		this.zookeper = zookeper;
	}

public Zoo(List<Animal> animals, Zookeper zookeper) {
		super();
		this.animals = animals;
		this.zookeper = zookeper;
	}

private List<Animal> animals;
private Zookeper zookeper;

public void feedAllAnimals() {
	for(Animal a :animals) {
		zookeper.feed(a);
	}
}

public void addAnimal(Animal a) {
	animals.add(a);
}

public Zoo() {
	animals= new ArrayList<>();
	zookeper = new Zookeper("Gigi");
}

}
