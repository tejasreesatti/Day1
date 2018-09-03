import java.util.Scanner;
public class discountcalc {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of the item");
		float itemValue = sc.nextFloat();
		float discount = (float) (itemValue * 0.35);
		float newPrice = itemValue - discount;
		System.out.println(newPrice);
	sc.close();	
	}
}
