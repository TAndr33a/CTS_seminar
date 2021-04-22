package ro.ase.cts.flyweight;

public class Companie implements FlyWeightAbstract{
	
	private String numeCompanie;
	private String nrTelefon;
	private String CUI;
	
	public Companie(String numeCompanie, String nrTelefon, String cUI) {
		super();
		this.numeCompanie = numeCompanie;
		this.nrTelefon = nrTelefon;
		CUI = cUI;
		
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Companie [numeCompanie=");
		builder.append(numeCompanie);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", CUI=");
		builder.append(CUI);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println("Compania"+this.toString()+"a realizat o rezervare"+rezervare.toString());
	}
	
}
