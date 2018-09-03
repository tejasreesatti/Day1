import java.util.Scanner;

public class SearchElementInMultiDimentionArray {
	public static void main (String args[]) {
		int m, n, search;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array dimensions");
			m = sc.nextInt();
			n = sc.nextInt();
		
		int i, j;
		int arr[][] = new int[m][n];
		System.out.println("Enter the elements");
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
					arr[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Enter the element to be searched");
		 search = sc.nextInt();
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				if (arr[i][j] == search) {
					System.out.println("Element exists in the Array");
					System.exit(0);
				}
			}
		}
		System.out.println("Element does not exists in the Array");
		sc.close();
	}
}
