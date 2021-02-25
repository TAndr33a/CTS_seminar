package ro.ase.cts.zoo;

public class Zookeper {
	private String name;
	
public Zookeper(String name) {
		super();
		this.name = name;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void feed(Animal a) {
	System.out.println("");
}
}
