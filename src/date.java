import java.util.Scanner;
public class date {
	public static void main(String args[]) {
		String date, temp = "";
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the Date in the format dd,mm,yyyy");
		date = v.nextLine();
		int x = date.length();
		for(int i = 0; i < x; i++) {
			char ch = date.charAt(i);
			if(ch == ',')
				temp += '/';
			else
				temp += ch;
			
		}
		String n = ""+temp.charAt(3)+temp.charAt(4);
		int mo = Integer.parseInt(n);
		String m = "";
		switch(mo)
		{
		case 1:
			m="jan";
			break;
		case 2:
			m="feb";
			break;
		case 3:
			m="Mar";
			break;
		case 4:
			m="Apr";
			break;
		case 5:
			m="May";
			break;
		case 6:
			m="jun";
			break;
		case 7:
			m="jul";
			break;
		case 8:
			m="aug";
			break;
		case 9:
			m="sep";
			break;
		case 10:
			m="oct";
			break;
		case 11:
			m="nov";
			break;
		case 12:
			m="dec";
			break;
		default:
			System.out.println("Enter a valid month");
		
		}
		System.out.println(temp.substring(0,3)+ m + temp.substring(5));
		v.close();
	}

}
