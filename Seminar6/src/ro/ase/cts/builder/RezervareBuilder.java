package ro.ase.cts.builder;

public class RezervareBuilder implements RezervareBuilderAbstract {

	private Rezervare rezervare;
	
	
	public RezervareBuilder(Rezervare rezervare) {
		super();
		this.rezervare = new Rezervare(0,false,false,false,false,"");
		
	}


	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return this.rezervare;
	}


	public RezervareBuilder setCodRezervare(int codRezervare) {
		 rezervare.setCodRezervare(codRezervare);
		 return this;
	}
	public RezervareBuilder setAreMancareInclus(boolean areMancareInclus) {
		rezervare.setAreMancareInclus(areMancareInclus);
		return this;
	}
	public   RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}
	public   RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	public  RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	public  RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	
}
