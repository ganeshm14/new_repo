
public class intersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,4,6,9};
		int b[] = {3,5,8};
		System.out.println("The first array is : ");
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]+ ",");
		System.out.println();
		System.out.println("The second array is : ");
		for(int j=0;j<b.length;j++) 
			System.out.print(b[j]+ ",");
		System.out.println();
		intersection(a,b);
		
		
	}

	private static void intersection(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int k=0;
		int c[] = new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j =0;j<b.length;j++)
			{
				if(a[i]==b[j]) {
					c[k]=a[i];
					k++;
				}
				else
					continue;
			}
		}
		
		System.out.println("The intersection of 2 array is : ");
		if(k==0) {
			System.out.println("none");
		}
		for(int l=0;l<k;l++) {
			System.out.print(c[l]+ " ");
		}
		
		
		
		
		
		
		
	}

}
