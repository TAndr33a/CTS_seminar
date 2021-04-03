package ro.ase.cts.builder;

public class RezervareBuilderV2 implements RezervareBuilderAbstract{
	private int codRezervare;
	private boolean areMancareInclus;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(codRezervare,areMancareInclus,areBauturaInclusa,areScaunErgonomic,areMuzicaAmbientala,genMuzica) 
			
		}
		
		
		
		public RezervareBuilderV2 setCodRezervare(int codRezervare) {
			 rezervare.setCodRezervare(codRezervare);
			 return this;
		}
		public RezervareBuilderV2 setAreMancareInclus(boolean areMancareInclus) {
			rezervare.setAreMancareInclus(areMancareInclus);
			return this;
		}
		public   RezervareBuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
			rezervare.setAreBauturaInclusa(areBauturaInclusa);
			return this;
		}
		public   RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
			rezervare.setAreScaunErgonomic(areScaunErgonomic);
			return this;
		}
		public  RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
			rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
			return this;
		}
		public  RezervareBuilderV2 setGenMuzica(String genMuzica) {
			rezervare.setGenMuzica(genMuzica);
			return this;
		}
		
	}

}
