import java.util.Scanner;
public class Intrest {
	void simpleIntrest(double p, double r, double t) {
		double SI  = p + (p * t * r)/100;
		System.out.println("The Simple Intrest is  "+SI);
	}
	void compoundIntrest(double p, double r, double t) {
		double CI = p * Math.pow((1+r*0.01),t);
		System.out.println("The Compound Intrest is "+CI);
	}
	public static void main(String args[]) {
		double pple;
		double timeperiod;
		double rate_of_Intrest;
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		pple = v.nextDouble();
		System.out.println("Enter the Time Period");
		timeperiod = v.nextDouble();
		System.out.println("Enter the rate of Intrest");
		rate_of_Intrest = v.nextDouble();
		Intrest obj = new Intrest();
		obj.simpleIntrest(pple, rate_of_Intrest, timeperiod);
		obj.compoundIntrest(pple, rate_of_Intrest, timeperiod);
		v.close();		

	}
}
