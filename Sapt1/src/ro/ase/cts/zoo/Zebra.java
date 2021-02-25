package ro.ase.cts.zoo;

public class Zebra {
private String name;
private float greutate;
private int no_stripes;



public Zebra(String name, float greutate) {
	super(name, greutate);
	
}

public Zebra(String name,float greutate,int no_stripes) {
	super(name,greutate);
	this.no_stripes=no_stripes;
}




public int getNo_stripes() {
	return no_stripes;
}
	

public void setNo_stripes(int no_stripes) {
	this.no_stripes=no_stripes;
}
}
