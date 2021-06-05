package ro.ase.cts.mocks;

import java.util.List;

import testare.IStudent;

public class StudentStub implements IStudent{//toate val returnate sunt hardcodate

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return "Gigel";
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;//ar trb o lista in mod normal
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
