package CommunitCloud.Biogen;

public class TetsTest {

	public static void main(String[] args) {
	/*
		  // Sample string input
        String str = "00000123569";
        String newstr = "";
        int ind = 0;
        for (int i = 0; i < str.length(); i++) {
            char p = str.charAt(i);
            if (p != '0') {
                ind = i;
                break;
            }
        }
        newstr = str.substring(ind, str.length());
        // Printing leading zeros inside string
        System.out.println(newstr);
        */
		String str="000001234560000087";
		String newstr="";
		int count=0;
		for(int i=0;i<str.length();i++) 
		{
			char p=str.charAt(i);
			if(p!='0') 
			{
				count =i;
				break;
			}
		}
		newstr= str.substring(count, str.length());
		System.out.println(newstr);
	}

}
