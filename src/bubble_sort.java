
public class bubble_sort {
	
	void bubblesort(int arr[]) {
		int i, j, temp;
		for(i = 0; i < 15; i++) {
			for(j = 0; j < 14; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(i = 0; i < 15; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
		bubble_sort obj = new bubble_sort();
		obj.bubblesort(arr);
		
	}

}
