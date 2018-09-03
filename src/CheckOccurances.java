import java.io.*;
public class CheckOccurances {
	public static void main(String args[]) throws Exception{
		String arr[] = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson"
				,"Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter name");
	String ser = br.readLine(); 
	int count = 0;
	for(int i = 0; i < arr.length; i++) {
		if(arr[i].compareTo(ser) == 0) {
			count++;
		}
	}
	System.out.println(count);
}
}
