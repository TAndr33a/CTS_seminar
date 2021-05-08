package command;

public class ContBancar {
	private String iban;
	private float sold;
	
	public ContBancar(String iban, float sold) {
		super();
		this.iban = iban;
		this.sold = sold;
	}
	
	public void constituire(float sumaInitiala) {
		this.sold=sumaInitiala;
		System.out.println("S-a construit contul cu suma +sold");
	}
	
	public void retragere(float suma) {
		if(sold>= suma) {
			sold-=suma;
			System.out.println("S-a realizat o retragere");
		}else {
			System.out.println("Nu sunt fonduri suficiente");
		}
	}
	
	public void depunere(double suma) {
		this.sold+=suma;
		System.out.println("S-a realizat o depunere");
	}
}
