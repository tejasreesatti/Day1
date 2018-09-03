import java.util.Scanner;
public class stringrev {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String strMain = sc.nextLine();
	    String arrSplit[] = strMain.split(" ");
	    String fo="";
	    for (int i = 0; i < arrSplit.length; i++)
	    {
	    	String reverse = "";
	    	for(int j = arrSplit[i].length()-1; j >= 0;j--) {
	    		reverse += arrSplit[i].charAt(j);
	    	}
	    	fo = fo + reverse +" ";
	    } 
	System.out.println(fo);
	sc.close();
	}	
	
}
