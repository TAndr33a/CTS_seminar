package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import testare.Grupa;
import testare.Student;

public class TestGrupa {
	
	private Grupa grupa;

	
	
	//Right bicep
	//1. Test de right(rezultatele sunt bune veific daca param de eici este egal cu cel din get)
	
	

	@Test
	public void testConstructorRight() {
		Grupa grupa=new Grupa(1078);
		assertEquals(1078,grupa.getNrGrupa());
	}

	
	//2.Limite-bounderies
	
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000,grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100,grupa.getNrGrupa());
	}
	
	//3.Relatiile inverse-nu se poate
	
	//4.Crosscheck-testare pin intermediul altor metode-nu se poate pt ca nu avem alta metoda care sa faca acelasi lucru
	//daca exista un constr default si unul cu un param, puteam face veriicarea atribuind numele cu setter la cel fara param 
	//si verificat cu cel cu un param
	
	//5.Error condition
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorSubLimita() {
		Grupa grupa=new Grupa(999);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorPesteLimita() {
		Grupa grupa=new Grupa(1101);
	}
	
	//6.Performanta-consuma prea multe resurse
	@Test(timeout=200)
	public void testConstructorPerformanta() {
		Grupa grupa=new Grupa(1000);
	}
	
	
	//Correct
	//1.Conformance-respectarea unui format
	//2.Ordine- daca avem o anumita ordine(in general liste)-ex:verific daca cele doua grupe sunt in ordine crescatoare
	//3.Range-verificare limite din afara intervalului si din interior(spre deoseb de boundary)-le avem deja pe toate
	//4.Refferance-daca depinde de ceva exterior-nu avem
	//5.Existance-verifica daca un param al metodei nu exista-vrificam daca listei i-a alocat spatiu(=exista)
	
	@Test
	public void testConstructorExistaLista() {
		Grupa grupa=new Grupa(1078);
		assertNotNull(grupa.getStudenti());
	}
	
	//6.Cardinalitate- sa verificam ce se intampla cand avem 1,niciunul sau n studenti-pt construcotir nu merge pt ca acesta
	//doar aloca spatiu
	//7.Time-dif la performance se testeaza resursa(printre care si timp), iar aici verificam timpul,mom in care e apelat
	//constr e primul deci nu are rost iar timpul l-am verificat deja
	
//////////////////////////////////////////
	//Right
	@Test
	public void testGetPromovabilitateRight() {
		Grupa grupa=new Grupa(1078);
		for(int i=0;i<8;i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
	}
	
	//Boundary
	@Test
	public void testGetPromovabilitateBoundary() {
		Grupa grupa=new Grupa(1078);
		for(int i=0;i<8;i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1,grupa.getPromovabilitate(),0.01);
	}
	
	//3.Relatiile inverse
		@Test
		public void testGetPromovabilitateInverse() {
			int nrIntegralisti=31;
			int nrRestantieri=2;
			Grupa grupa=new Grupa(1078);
			for(int i=0;i<8;i++) {
				Student student = new Student();
				student.adaugaNota(10);
				grupa.adaugaStudent(student);
			}
			for(int i=0;i<2;i++) {
				Student student = new Student();
				student.adaugaNota(4);
				grupa.adaugaStudent(student);
			}
			assertEquals(grupa.getPromovabilitate()*grupa.getStudenti().size(),0.001);
		}
		
		//4.Crosscheck//nu avem alte metod care sa faca acelasi lucru
		
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
