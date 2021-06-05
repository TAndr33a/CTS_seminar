package ro.ase.cts.categoriiTeste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import testare.Grupa;

public interface TesteUrgente {
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
}
