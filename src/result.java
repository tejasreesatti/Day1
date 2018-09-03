import java.util.Scanner;
public class result {
	void result_declaration(double sub1, double sub2, double sub3) {
		if(sub1 >= 60 && sub2 >= 60 && sub3 >= 60) {
			System.out.println("Passed");
		}
		else if((sub1 >= 60 && sub2 >= 60)||(sub2 >= 60 && sub3 >= 60)||(sub3 >= 60 && sub1 >= 60)) {
			System.out.println("Promoted");
		}
		else {
			System.out.println("Failed");
		}
	}
	public static void main(String args[]) {
		double sub1,sub2,sub3;
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the marks of subject1");
		sub1 = v.nextDouble();
		System.out.println("Enter the marks of subject2");
		sub2 = v.nextDouble();
		System.out.println("Enter the marks of subject3");
		sub3 = v.nextDouble();
		result obj = new result();
		obj.result_declaration(sub1, sub2, sub3);
		v.close();
		
	}

}
