package CommunitCloud.Biogen;

import org.testng.annotations.Test;

public class SBIZTest implements RBIRulesTest{
	
	public static void main(String[] args) {
		RBIRulesTest r=new SBIZTest();
		r.carLoanRateOfInterest();
		
		SBIZTest s= new SBIZTest();
		s.carLoanRateOfInterest();
		
		
	}
	@Test
	@Override
	public void carLoanRateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("SBI Car loan rate of interst is: 6.5");
	}
	@Test
	@Override
	public void goldLoanReateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("SBI Gold loan rate of interst is: 5.5");
	}
	@Test
	@Override
	public void PersonalLoanRateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("SBI Personal loan rate of interst is: 11.25");
	}
	
}
