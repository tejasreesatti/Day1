import java.util.Scanner;

public class palindrome {
	void palindrome_check(int num) {
		int temp = num;
		int reverse = 0;
		int remain;
		while(num > 0) {
			remain = num % 10;
			reverse = (reverse * 10) + remain;
			num /= 10;
		}
		
		if(temp == reverse) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

	public static void main(String args[])
	{
		int num;
		
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		palindrome obj = new palindrome();
		obj.palindrome_check(num);
		sc.close();
	}

}
