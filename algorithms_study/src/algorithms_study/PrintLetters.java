package algorithms_study;

import java.util.LinkedHashMap;

public class PrintLetters {

	static String entry = "aaabbbcccc";
	
	public static void main(String[] args) {
		test(entry, 2);

	}
	
	public static void test(String entry, int numberTimesPrintEachLetter) {
		LinkedHashMap<String, Integer> ab = new LinkedHashMap<String, Integer>();
		String result = "";
		for(int i =0; i < entry.length(); i++) {
			String letter = String.valueOf(entry.charAt(i));
			int countLetter = ab.get(letter) == null ? 0 : ab.get(letter)+1;
			if(countLetter == 0 || countLetter < numberTimesPrintEachLetter) {
				ab.put(String.valueOf(letter), countLetter);
			    result = result+letter;
			}
		}
		System.out.println(result);
	}
}
