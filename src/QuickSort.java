import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements ");
		for(int i = 0 ;i < n;i++)
		  arr[i] = sc.nextInt();
		
		quicksort(arr, 0 , arr.length -1);

		for(int i = 0 ;i < arr.length;i++)
			  System.out.print(arr[i]);
	}
	
	static void quicksort(int arr[], int start, int end) {
		if(start >= end)
			return;
		
		int pIndex = partition(arr, start, end);
		quicksort(arr,start, pIndex-1);
		quicksort(arr, pIndex+1, end);
		
	}
	
	static int partition(int arr[],int start, int end) {
		int pivot = arr[end];
		int pIndex = start;
		
		for(int i= start; i < end; i++) {
			if(arr[i] <= pivot) {
				swap(arr, i,pIndex);
				pIndex++;
			}
			
		}
		swap(arr,pIndex,end);
		return pIndex;
	}
	
static void swap(int arr[], int i, int j) {
		System.out.println("value of i"+i);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		
	}

}
