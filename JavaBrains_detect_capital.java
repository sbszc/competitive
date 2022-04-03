import java.util.function.Predicate;

public class JavaBrains_detect_capital {
	public static void main(String[] args) {
		// Valid: AAAA Aaaa aaaa

		String sentence = "A a AA aa Aa";

		if (isValidSentence(sentence)) {
			System.out.println("Valid sentence");
		} else {
			System.out.println("Not valid sentence");
		}
	}

	public static boolean isValidSentence(String sentence) {
		boolean isValidSentence = true;

		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (!isValidWord(words[i])) {
				isValidSentence = false;
				break;
			}
		}

		return isValidSentence;
	}

	public static boolean isValidWord(String word) {
		boolean isValidWord = true;

		int wordLen = word.length();
		if (wordLen > 1) {
			Predicate<Character> isValidLetter;
			if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
				isValidLetter = letter -> Character.isUpperCase(letter);
				for (int i = 2; i < wordLen; i++) {
					if (!isValidLetter.test(word.charAt(i))) {
						isValidWord = false;
						break;
					}
				}
			} else {
				isValidLetter = letter -> Character.isLowerCase(letter);
				for (int i = 1; i < wordLen; i++) {
					if (!isValidLetter.test(word.charAt(i))) {
						isValidWord = false;
						break;
					}
				}
			}
		}
		return isValidWord;
	}
}