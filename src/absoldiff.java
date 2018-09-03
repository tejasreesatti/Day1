import java.util.* ;
public class absoldiff {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int k;
		System.out.println("Enter the value of K");
		k = sc.nextInt();
		for(int i = 0; i < size - 1; i++) {
			for(int j = i+1; j < size; j++) {
				if(Math.abs(i - j) <= k)
				{
					if(arr[i] == arr[j]) {
						System.out.println("The pair exists at "+(i + 1)+" and "+(j+1));
					}
				}
			}
		}
		sc.close();
	}
}
