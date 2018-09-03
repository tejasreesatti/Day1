import java.util.Scanner;

public class armstrong {
	int CubeSum (int num) {
		int c = 0;
		while(num > 0) {
			int remainder = num % 10;
			
			c += remainder * remainder * remainder;
			
			num  /= 10;
		}
	return c;
	}
	

	public static void main(String args[])
	{
		int num;
		
		System.out.println("Enter the value");
		Scanner v = new Scanner(System.in);
		num = v.nextInt();
		
		System.out.println(num);
		armstrong obj = new armstrong();
		int c = obj.CubeSum(num);

		if (num == c) {
			System.out.println("Its an armstrong number");
		}
		else {
			System.out.println("Its not an armstrong number");
		}
		
	
	v.close();	
	}
}
