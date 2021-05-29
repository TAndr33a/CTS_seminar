package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import testare.Grupa;
import testare.Student;

public class GupaFixtureTest {

	@Before
	public void setUp() {
		Grupa grupa=new Grupa(1078);
		for(int i=0;i<35;i++) {
			Student student=new Student();
			for(int j=0;i<7;j++) {
			student.adaugaNota(9);
		}
		grupa.adaugaStudent(student);
	}
	}
	
	
	//6.Performance
	@Test(timeout=500)
	public void testGePromovabilitatePerformance() {
		grupa.getPromovabilitate();//setupul este sus
	}
}
