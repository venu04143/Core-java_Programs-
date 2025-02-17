package TypesofMethods;

public class ReturnwithArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnwithArgs intrest = new ReturnwithArgs();
		
		int borrowed=25000;
		
		double ans = intrest.intrestperMonth(borrowed, 2);
        
		System.out.println(" Intrest permonth for borrowing   "+borrowed + " is "+ ans) ;
	}
	
	double intrestperMonth(int borrowed ,double intrest) {
		
		double permonth=borrowed/100*intrest;
		return permonth;
	}

}
