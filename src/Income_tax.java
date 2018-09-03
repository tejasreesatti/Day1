import java.util.Scanner;
public class Income_tax {
	void taxable_amount (double salary) {
		double diff , tax;
		if(salary <= 180000) {
			System.out.println("No Tax");
		}
		else if(salary >= 180001 && salary <= 300000) {
			diff = salary - 180000;
			tax = diff * 0.1;
			System.out.println("The taxable amount is " +tax);
		}
		else if(salary >= 300001 && salary <= 500000) {
			diff = salary - 180000;
			tax = diff * 0.1;
			diff -= tax;
			tax += diff * 0.2;
			System.out.println("The taxable amount is " +tax);
		}
		else {
			diff = salary - 180000;
			tax = diff * 0.1;
			diff -= tax;
			tax += diff * 0.2;
			diff -= tax;
			tax += diff * 0.3;
			System.out.println("The taxable amount is " +tax);
		}
	}
	public static void main(String args[]) {
		double salary;
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the Salary");
		salary = v.nextDouble();
		Income_tax obj = new Income_tax();
		obj.taxable_amount(salary);
		v.close();
	}
}
