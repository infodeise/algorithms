package algorithms_study;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Alive is awesome";
		System.out.println(reverse(name));
		
	}
	
	private static String reverse(String name) {
//		String result="";
		long start = System.nanoTime();
		StringBuilder result = new StringBuilder();
		int length = name.length()-1;
		for(int i = length; i >=0 ; i--) {
			result.append(name.charAt(i));
//			result= result+name.charAt(i);
		}
		System.out.println(System.nanoTime()-start);
		return result.toString();
	}
	
	
}
