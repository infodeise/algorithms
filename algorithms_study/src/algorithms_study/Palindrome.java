package algorithms_study;

public class Palindrome {

	public static void main(String[] args) {
		String word = "Arara";
		word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
		System.out.println(isPalindrome(word));
		
	}
	
	private static boolean isPalindrome(String word) {
		int left = 0;
		int rigth = word.length() -1;
		
		while(left < rigth) {
			if(word.charAt(left++) != word.charAt(rigth--)) {
				return false;
			}
		}
		return true;
	}
	
	
}
