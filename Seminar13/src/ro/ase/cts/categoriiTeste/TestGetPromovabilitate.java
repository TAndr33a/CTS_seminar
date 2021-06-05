package ro.ase.cts.categoriiTeste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import testare.Grupa;
import testare.Student;

public interface TestGetPromovabilitate {
	
	//5.Error condition
	@Test
	public void testGePromovabilitateError() {
		Grupa grupa=new Grupa(1078);
		assertEquals(0,grupa.getPromovabilitate(),0.001);
	}
	
	//Correct
	//4.Refferance-avem referinta metoda areRestante
	//Existance-verificam daca nu avem niciun student,e facut
	
	//Cardinality
	@Test
	public void testGetPromovabilitateCardinalityAreRestanta() {
		Grupa grupa= new Grupa(1078);
		Student student= new Student();
		student.adaugaNota(10);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getPromovabilitate(),0.001);
	}
}
