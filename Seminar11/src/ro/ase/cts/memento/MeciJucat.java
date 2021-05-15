package ro.ase.cts.memento;

public class MeciJucat {
	private String numeEchiaGazda;
	private String numeEchipaOaspeti;
	private int nrBileteVandute;
	private int nrSpectatori;
	private int numarJandarmi;
	private int numaStewarzi;
	
	
	
	
	
	public MeciJucat(String numeEchiaGazda, String numeEchipaOaspeti, int nrBileteVandute, int nrSpectatori,
			int numarJandarmi, int numaStewarzi) {
		super();
		this.numeEchiaGazda = numeEchiaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSpectatori = nrSpectatori;
		this.numarJandarmi = numarJandarmi;
		this.numaStewarzi = numaStewarzi;
	}
	
	
	public String getNumeEchiaGazda() {
		return numeEchiaGazda;
	}
	public void setNumeEchiaGazda(String numeEchiaGazda) {
		this.numeEchiaGazda = numeEchiaGazda;
	}
	public String getNumeEchipaOaspeti() {
		return numeEchipaOaspeti;
	}
	public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}
	public int getNrBileteVandute() {
		return nrBileteVandute;
	}
	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public int getNumarJandarmi() {
		return numarJandarmi;
	}
	public void setNumarJandarmi(int numarJandarmi) {
		this.numarJandarmi = numarJandarmi;
	}
	public int getNumaStewarzi() {
		return numaStewarzi;
	}
	public void setNumaStewarzi(int numaStewarzi) {
		this.numaStewarzi = numaStewarzi;
	}
	
	
	public Memento crereMemento() {
		Memento memento=new Memento(this.numeEchiaGazda,this.numeEchipaOaspeti,this.nrBileteVandute);
		return memento;
	}
	
	public void setMemento(Mememento memento) {
		this.numeEchiaGazda=memento.numeEchiaGazda;
		this.numeEchipaOaspeti=memento.numeEchipaOaspeti;
		this.nrBileteVandute=memento.nrBileteVandute;
	}
	
}



