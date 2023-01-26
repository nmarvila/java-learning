package enhancedSwitch;

public class Vowels {
	public static void main(String[] args) {
		boolean yIsVowel = true;
		
		char ch = 'Y';
		
		boolean isVowel = switch(ch) {
			case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
			case 'y', 'Y' -> { if(yIsVowel) yield true; else yield false; }
			default -> false;
		};
		
		if(isVowel) System.out.println(ch + " is a vowel.");
	}
}
