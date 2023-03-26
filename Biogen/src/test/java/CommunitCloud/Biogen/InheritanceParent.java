package CommunitCloud.Biogen;

public class InheritanceParent {

	
	public void engine(String a) {
		System.out.println("Parent four wheeler engine ");
	}
	public void engine(int b) {
		System.out.println("Parent six wheeler engine ");
	}
	public void engine(int a, String b) {
		System.out.println("Parent two wheeler engine overriding ");
	}
	public static void main(String[] args) {
		InheritanceParent obj =new InheritanceParent();
		//obj.engine("");
		obj.engine(2);
		obj.engine("Sid");
		
	}
}
