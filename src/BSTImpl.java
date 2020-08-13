
public class BSTImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,6,7,9};
		
		int find = 8;
		
		int found = findElement(arr, 0, arr.length - 1, find);
		
		System.out.println("Element found "+found);
	}
    
	
	static int findElement(int arr[],int left, int right, int find) {
		
		if(left > right)
			return -1;
		
		int mid = left + (right - left)/2;
		
		if(arr[mid] == find) {
			System.out.println("inside");
			return mid;
		}
		
		if(arr[mid] <= find) {
			return findElement(arr, mid+1, right, find);
		}else {
			return findElement(arr,left,mid-1,find);
		}
		
	}
}
