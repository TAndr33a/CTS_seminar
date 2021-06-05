package ro.ase.cts.mocks;

import java.util.List;

import testare.IStudent;

public class StudentFake implements IStudent{//pt toate metodele care au cv returnat noi trb sa avem un atribut
	private String valoareGetNume;
	private List<Integer> valoareGetNote;
	private int valoareGetMedie;
	private int valoareGetNota;
	private boolean valoareAreRestante;//pt aceastea ne trebuie si setteri care sa le stabileasca valorile
	
	
	
	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}

	public void setValoareGetNote(List<Integer> valoareGetNote) {
		this.valoareGetNote = valoareGetNote;
	}

	public void setValoareGetMedie(int valoareGetMedie) {
		this.valoareGetMedie = valoareGetMedie;
	}

	public void setValoareGetNota(int valoareGetNota) {
		this.valoareGetNota = valoareGetNota;
	}

	public void setValoareAreRestante(boolean valoareAreRestante) {
		this.valoareAreRestante = valoareAreRestante;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return valoareGetNote;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return valoareGetMedie ;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return valoareGetNota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return valoareAreRestante;
	}

}
