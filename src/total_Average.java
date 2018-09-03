import java.util.Scanner;

public class total_Average {
public static void main(String args[]) {
	int arr[][] = new int[3][3];
	int i, j;
	Scanner v = new Scanner(System.in);
	for(i = 0; i < 3; i++)
	{
		System.out.println("Enter marks of student "+(i+1));
		for(j = 0; j < 3;j++) {
			arr[i][j]=v.nextInt();
		}
	}
	v.close();
	int subt[] = new int[3], stut[] = new int[3];
	for(i = 0; i < 3; i++) {
		for(j = 0; j < 3; j++) {
			subt[j] += arr[i][j]; 
		}
	}
	for(i = 0; i < 3; i++) {
		for(j = 0; j<3;j++) {
			stut[i]+=arr[i][j];
		}
	}
	for(i = 0; i < 3; i++) {
		System.out.println("The total marks of subject "+(i+1)+ " is " +subt[i]);
		subt[i] /= 3;
		System.out.println("The average marks of subject "+(i+1)+ " is " +subt[i]);
	}
	for(i = 0; i < 3; i++) {
		System.out.println("The total marks of student "+(i+1)+ " is " +stut[i]);
		stut[i] /= 3;
		System.out.println("The average marks of student "+(i+1)+ " is " +stut[i]);
	}
	
}
}
