package algorithms_study;

import java.util.HashMap;

//Discover how many turns the player A won
// Each player play play a turn and the winner is who get the bigger card
//Cards hierarchy: A K Q J T(10) 9-2
public class DeckCard {
	private static HashMap<String, Integer> mapDeck = new HashMap<String, Integer>();
	public static void main(String[] args) {

		String A = "23A84Q";//[1...1000]
		String B = "K2Q25J";// 2-9 T J Q K A same size String A e B
		
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
