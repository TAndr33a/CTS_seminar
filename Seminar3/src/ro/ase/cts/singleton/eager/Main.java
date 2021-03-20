package ro.ase.cts.singleton.eager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ReceptieHotel receptie1= ReceptieHotel.getInstanta("Ion",4,"Hotel1");
		ReceptieHotel receptie2= ReceptieHotel.getInstanta("Anndrei",2,"Hotel2");
		System.out.println(receptie1.toString());
		System.out.println(receptie1.toString());
		receptie1.setNumeReceptioner("Andrei");
		receptie2.setEtaj(4);
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());*/
		
		
		Cetate cetate1=Cetate.getInstanta("Sighisoara",700);
		Cetate cetate2=Cetate.getInstanta("Sighisoara",700);
	}

}
