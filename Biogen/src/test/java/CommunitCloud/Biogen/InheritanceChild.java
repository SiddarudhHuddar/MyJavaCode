package CommunitCloud.Biogen;

public class InheritanceChild {

	public void engine(int b) {
		System.out.println("child six wheeler engine ");
	}
	
	public void engine(int a, String b) {
		System.out.println("child two wheeler engine overriding ");
	}
	public static void main(String[] args) {
		InheritanceParent ob=new InheritanceParent();
		InheritanceChild g =new InheritanceChild();
		ob.engine(10, "Siddarudh");
		//ob.engine(2);
		g.engine(5, "Sid");
		//g.engine(0);
	}

}
