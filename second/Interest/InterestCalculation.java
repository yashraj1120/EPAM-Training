package epam.second;

public class InterestCalculation {

	
	public double simpleInterest(double principal,double rate,int term)
	{
		return (double)principal*(rate/100)*term;
	}
	
	public double compoundInterest(double principal,double rate,int n,int term) {
		double amount;
		amount=(1+(double)rate/n);
		amount=Math.pow(amount,n*term);
		amount*=principal;
		return amount;
	}
	
}
