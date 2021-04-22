package ro.ase.cts.Strategy;

public class Portofel implements Strategy{

	float sumaDisponibila;
	
	
	
	public Portofel(float sumaDisponibila) {
		super();
		sumaDisponibila = sumaDisponibila;
	}



	@Override
	public void realizeazaPlata(int suma) {
		// TODO Auto-generated method stub
		if(sumaDisponibila >= suma)
		System.out.println("Tranzactia a fost efectuata pentru suma"+suma);
		sumaDisponibila -= suma;
		return;
	}
	System.out.println("Fonduri insuficiente");
}
