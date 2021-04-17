package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari{

	private OperatorRezervari operator;
	private int nrMinimPersoane;
	
	
	public ProxyOperatorRezervari(OperatorRezervari operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane=nrMinimPersoane;
	}



	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		// TODO Auto-generated method stub
		if(nrPersoane >= 4) {
			operator.realizeazaRezervare(numeClient, nrPersoane);
		}else {
			System.out.println("Va rugam veniti fara rezervare");
		}
	}

}
