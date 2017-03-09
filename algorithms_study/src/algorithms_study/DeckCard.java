package algorithms_study;

import java.util.HashMap;

public class DeckCard {
	private static HashMap<String, Integer> mapDeck = new HashMap<String, Integer>();
	public static void main(String[] args) {

		String A = "23A84Q";//[1...1000]
		String B = "K2Q25J";// 2-9 T J Q K A tamanho igual string A e B
		
		System.out.println("A ganhou "+countWinturns(A, B)+" turnos");
		
	}
	
	public static void createCardsDictionary() {
		for(int i = 2; i < 10; i++) {
				mapDeck.put(String.valueOf(i), i);
		}
		
		mapDeck.put("T", 10);
		mapDeck.put("J", 11);
		mapDeck.put("Q", 12);
		mapDeck.put("K", 13);
		mapDeck.put("A", 14);
	}
	
	public static int countWinturns(String A, String B) {
		
		createCardsDictionary();
		int countWinA = 0;
		//regular expression (2-9 T J Q K A)
		for(int i = 0; i < A.length(); i++) {
			
			if(mapDeck.get(String.valueOf(A.charAt(i))) > mapDeck.get(String.valueOf(B.charAt(i)))) {
				countWinA++;
			}
		}
		return countWinA;
	}

}
