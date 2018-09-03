import java.util.Scanner;

public class missingArrayElement {
	static int getMissingNo (int a[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;   
        for ( i = 0; i< n; i++)
           total -= a[i];
        return total;
    }
      
 
    public static void main(String args[])
    {
    	Scanner v = new Scanner(System.in);
    	int n;
    	System.out.println("Enter the number of numbers");
    	n = v.nextInt();
        int a[] = new int[n];
        for(int j = 0; j < n;j++) {
			a[j]=v.nextInt();
		}
        int miss = getMissingNo(a,n);
        System.out.println(miss);  
        v.close();
    }
}
