import java.util.Scanner;

public class FindMinRotatedArray {

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
		System.out.println("minimum value is "+findMin(arr,0,arr.length-1));
	}
	
	private static int findMin(int arr[], int left, int right) {
		
		if(left == right) {
			return arr[left];
		}
		if(right < left) {
			return arr[0];
		}
		int mid = left + (right - left)/2;
		
		if(mid < right && arr[mid + 1] < arr[mid])
			return arr[mid + 1];
		
		if(mid > left && arr[mid] < arr[mid - 1])
			return arr[mid];
		
		if(arr[right] > arr[mid])
			return findMin(arr, left, mid-1);
		return findMin(arr, mid+1,right);
	
	}

}
