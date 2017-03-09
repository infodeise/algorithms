package algorithms_study;

import java.util.Arrays;

public class ReverseVector {

	public static void main(String[] args) {
		String[] input = {"A", "B", "C", "D", "E", "F"};
		
		System.out.println(Arrays.toString(reverse(input)));
	}
	
	private static String[] reverse(String[] vector) {
		String aux ="";
		int finalPosition = vector.length-1;
		for(int i=0; i < vector.length/2; i++) {
			aux = vector[finalPosition-i];
			vector[finalPosition-i]=vector[i];
			vector[i]=aux;
		}
		
		return vector;
	}

}
