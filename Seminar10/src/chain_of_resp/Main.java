package chain_of_resp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cont contEconomii=new ContEconomii(1000,"RO796566");
		Cont contCredit=new ContCredit(2000,"RO7577866");
		Cont contCurent=new ContCurent(1200,"RO7956786");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		contCurent.plateste(400);
		contCurent.plateste(700);
		contCurent.plateste(2000);
		contCurent.plateste(700);
		contCurent.plateste(700);
				
			
	}

}
