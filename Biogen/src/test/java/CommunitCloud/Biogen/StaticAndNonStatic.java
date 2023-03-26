package CommunitCloud.Biogen;

public class StaticAndNonStatic {
	
public static String str="abc";

public static void testcase(){
	//System.out.println(str);
}
public static void main(String[] args) {
	long t_s=System.nanoTime();
	System.out.println("-------------------");
	long t_f=System.nanoTime();
	
	long diff= t_f-t_s;
	System.out.println(diff);
	
}



}
