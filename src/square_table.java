import java.io.*;
public class square_table {
	void square (int num) {
		int sqr = num * num;
		System.out.println(num + " * 1 = " + num +", Square = " + sqr);
	}

	public static void main (String args[])throws IOException 
	{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value");
		int num = Integer.parseInt(b.readLine());
		square_table object = new square_table();
		object.square(num);
	}
}
