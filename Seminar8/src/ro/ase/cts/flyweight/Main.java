package ro.ase.cts.flyweight;

public class Main {
public static void main(String[] args) {
	Rezervare rezervare1=new Rezervare(1,2,"12:00");
	Rezervare rezervare2=new Rezervare(2,2,"14:00");
	Rezervare rezervare3=new Rezervare(3,5,"12:00");
	
	FlyWeightFactory fly= new FlyWeightFactory();
	Client client1=fly.getClient("0734567865");
	client1.printeazaRezervare(rezervare1);
	fly.getClient("0745675645").printeazaRezervare(rezervare2);
	fly.getClient("0734567865").printeazaRezervare(rezervare3);
}
}
