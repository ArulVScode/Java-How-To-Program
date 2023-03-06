public class Interest {
     
	public static void main(String[] args) {
	      
		double ammount;
		double principal = 1000.0;
		double rate = 0.05;
		
		System.out.printf("%s%20s\n", "Year ", "Ammount on Deposit");
		
		for(int year = 1; year <= 10; year++) {
			 
			ammount = principal * Math.pow(1.0 + rate, year);
			
			System.out.printf("%4d%,20.2f\n", year, ammount );
		}
	}
}