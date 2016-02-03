package Feb1.Classes;

public class Loan {
	
	
	public double loan(double loanAmt, double rate, double futureAmt, int numPeriods) {
		
		
		double interest = rate / 100.0;
		double partial = Math.pow((1 + interest), -numPeriods);
		double demoninator = (1 - partial) / interest;
		
		double answer = (loanAmt / demoninator) - ((futureAmt - partial)/demoninator );
		
		
		
		
		return answer;
		
		
		
	}
	

}
