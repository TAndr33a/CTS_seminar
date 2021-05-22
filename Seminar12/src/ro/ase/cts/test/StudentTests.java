package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		/*fail("Not yet implemented");//forteaza testul sa pice*/
		
		//testare constructor
		String nume="Mihai";
		Student student =new Student("Mihai");
		
		assertEquals(nume,student.getNume());//primul param este rezultatul la care ma astept//al doilea rezultatul obtinut
		
	}

	@Test
	public void testConstructorFaraParametrii() {
		Student student=new Student();
		assertNotNull("Numele este null",student.getNume());//verificam sa nu fie null//aici avem unexpected param
		assertNotNull("Lista nu este initializata",student.getNote());
	}
	
	@Test
	public void testAdaugareNota() {
		Student student=new Student();
		int nota=7;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student=new Student();
		int nota=7;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
	}
	
	@Test
	public void testCalculMedie() {
		Student student=new Student();
		int nota= 5;
		int nota2=10;
		
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		float medie=student.calculeazaMedie();
		float medie2=(nota+nota2)/2.0f;
		assertEquals(medie2,medie,0.001);
	}
	
	@Test
	public void testAreRestante() {
		Student student=new Student();
		student.adaugaNota(4);
		student.adaugaNota(10);
		assertTrue(student.areRestante());//in loc de doi param, true si restantele
	}
	
	@Test
	public void testNuAreRestante() {
		Student student=new Student();
		student.adaugaNota(6);
		
	}
}
