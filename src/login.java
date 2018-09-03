import java.util.Scanner;
import java.lang.System;
public class login {
	public static void main(String args[]) { 
		String name = "Tejasree.satti" , passwd = "1234abc";
		String userid, password;
		Scanner v = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter the user name");
			userid = v.nextLine();
			System.out.println("Enter the password");
			password = v.nextLine();
			if(userid.equals(name) && password.equals(passwd)) {
				System.out.println("Welcome");
				System.exit(0);
			}
		}
		
		System.out.println("Invalid Credentials, Contact the Admin");
		v.close();
	}
	
	}
