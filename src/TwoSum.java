import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int input[] = {4,4,6,5,8};
		int target = 8;
		int[] res = twoSum(input,target);
		System.out.println(res[0]+" " + res[1]);
	}

	public static int[] twoSum(int[] input, int target) {
		HashMap<Integer,Integer> visitedNumbers = new HashMap<>();
		for(int i=0;i<input.length;i++) {
			int delta = target- input[i];
			if(visitedNumbers.containsKey(delta)) {
				return new int[] {i,visitedNumbers.get(delta)};
			}
			visitedNumbers.put(input[i], i);
		}
		
		return new int[] {-1,-1};
	}
}
