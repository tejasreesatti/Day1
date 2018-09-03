import java.io.IOException;



public class armstrong_range {
	int CubeSum (int num) {
		int c = 0;
		while(num > 0) {
			int remainder = num % 10;
			
			c += remainder * remainder * remainder;
			
			num  /= 10;
		}
	return c;
	}
	public static void main(String args[]) throws IOException
	{
		int num;
		for(num = 100; num <= 999; num++) {
			armstrong_range obj = new armstrong_range();
			int c = obj.CubeSum(num);
			if (c == num) {
				System.out.println(num);
			}
		}
		
		
	}

}
