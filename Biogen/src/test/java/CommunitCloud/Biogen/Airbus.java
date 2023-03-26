package CommunitCloud.Biogen;



public class Airbus extends ParentAirCraft {

	public static void main(String[] args) {
		Airbus a =new Airbus();
		a.saftyGuidelines();
		a.engine();
		a.colour();
		
	}

	@Override
	public void colour() {
		System.out.println("Airbus colore is Red");
	}

}
