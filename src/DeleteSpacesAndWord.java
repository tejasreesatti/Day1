import java.util.Scanner;
public class DeleteSpacesAndWord {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string.");
		String strMain = sc.nextLine();
		String fin = "";
		int i;
		for(i = 0; i < strMain.length()-1; i++) {
			if(strMain.charAt(i) == strMain.charAt(i+1) && strMain.charAt(i) == ' ') {
				
			}
			else
			{
				fin += strMain.charAt(i);
			}
		}
		fin = fin + strMain.charAt(i);
		strMain = fin;
		fin = "";
		System.out.println("Enter the word to be deleted");
		String word = sc.nextLine();
		System.out.println("Enter the position of the word");
		int position = sc.nextInt();
		int count = 0;
		for(i = 0; i < strMain.length(); i++)
		{
			if(strMain.charAt(i) == ' ') {
				count++;
				if(count == (position - 1))
				{
					fin = strMain.substring(0,  i+1)+strMain.substring(i+2+word.length());
				}
			}
		}
		System.out.println(fin);
		sc.close();
	}
}
