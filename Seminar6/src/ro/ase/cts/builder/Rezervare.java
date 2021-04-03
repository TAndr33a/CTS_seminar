package ro.ase.cts.builder;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareInclus;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	public Rezervare(int codRezervare, boolean areMancareInclus, boolean areBauturaInclusa, boolean areScaunErgonomic,
			boolean areMuzicaAmbientala, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareInclus = areMancareInclus;
		this.areBauturaInclusa = areBauturaInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzica = genMuzica;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [codRezervare=");
		builder.append(codRezervare);
		builder.append(", areMancareInclus=");
		builder.append(areMancareInclus);
		builder.append(", areBauturaInclusa=");
		builder.append(areBauturaInclusa);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areMuzicaAmbientala=");
		builder.append(areMuzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append("]");
		return builder.toString();
	}
	
	
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	public void setAreMancareInclus(boolean areMancareInclus) {
		this.areMancareInclus = areMancareInclus;
	}
	public void setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
	}
	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}
	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	
	
}
