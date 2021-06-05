package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.mocks.StudentDummy;
import ro.ase.cts.mocks.StudentFake;
import ro.ase.cts.mocks.StudentStub;
import testare.Grupa;

public class TestGrupaWithMocks {

	@Test
	public void testAdaugareStudent() {//mock
		StudentDummy student=new StudentDummy();
		Grupa grupa = new Grupa(1100);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getStudenti().size());
	}

	//stub
	@Test
	public void testGetPromovabilitate() {//dezavantaj: pt fiecare situatie ne-ar trb un stub
		//avantaj: foarte usor de realizat
		StudentStub student=new StudentStub();
		Grupa grupa = new Grupa(1100);
		grupa.adaugaStudent(student);
		
		assertEquals(0,grupa.getPromovabilitate(),0.01);
		
	}
	
	//pt mai multe situatii recomandat fake sau mock
	
	//fake
	public void testGrupaWithFakeRight() {//avantaj: se poate testa orice situatie
		//dezavantaj: mai greu de implementat, prin acele atribute ocup memorie
		Grupa grupa = new Grupa(1078);
		
		for(int i=0;i<7;i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<3;i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.7,grupa.getPromovabilitate(),0.01);
	}
	
}
