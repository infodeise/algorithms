package algorithms_study;

import java.util.HashSet;

public class LongestSubsequence {

	public static void main(String[] args) {
		int[] arr = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		System.out.println("The longest subsequence is: "+ findTheLongestConsecutiveSubsequence(arr));

	}
	
	private static int findTheLongestConsecutiveSubsequence(int[] numbers) { 
		int result = 0;
		HashSet<Integer> numbersHash = new HashSet<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			numbersHash.add(numbers[i]);
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if(!numbersHash.contains(numbers[i]-1)) {
				int j = numbers[i];
				while(numbersHash.contains(j)) {
					j++;
				}
				
				int count = j -numbers[i];
				if(result < count) {
					result = count;
				}
			}
		}
		
		return result;
	}

}
