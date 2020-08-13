import java.util.Scanner;

public class MergeSort {

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
		mergeSort(arr);
		
		for(int i = 0 ;i < arr.length;i++)
			  System.out.print(arr[i]);
		
	}
	
	static void mergeSort(int arr[]) {
		
		int n = arr.length;
		
		if(n < 2)
			return;
		
		
		
		int mid = n/2;
		
		int left[] = new int[mid];
		int right[] = new int[n-mid];
		for(int i=0;i < mid;i++) {
			left[i] = arr[i];
		}
		
		for(int i=mid;i < n;i++) {
			right[i - mid] = arr[i];
		}
		
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left,right,arr);
		
		
		
	}
	static void merge(int l[],int r[],int arr[]) {
		
		int i=0;
		int j= 0;
		int k=0;
		while(i < l.length && j < r.length) {
			
			if(l[i] <= r[j]) {
			//swap(arr, l[i],r[j]);
			
				arr[k] = l[i];
				i++;
			}
			
			else  {
				//swap(arr, l[i],r[j]);
			
				arr[k] = r[j];
				j++;
			}
			k++;
		}
		while(i < l.length ) {
			
			arr[k++] = l[i];
			i++;
		}
		while(j < r.length ) {
			
		arr[k++] = r[j];
		j++;
		}
		
	}
	
	

}
