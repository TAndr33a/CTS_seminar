package ro.ase.cts.singleton.eager;

import ro.ase.cts.singleton.lazy.ReceptieHotel;

public class Cetate {
	private String nume;
	private int vechime;
	
	
	private static Cetate instanta=null;


	private Cetate(String nume, int vechime) {
		super();
		this.nume = nume;
		this.vechime = vechime;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public int getVechime() {
		return vechime;
	}


	public void setVechime(int vechime) {
		this.vechime = vechime;
	}


	public static synchronized Cetate getInstanta(String nume, int vechime) {
		
			if(instanta == null) {
				instanta=new Cetate(nume,vechime);
			}
			
			return instanta;
		}
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cetate [nume=");
		builder.append(nume);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
