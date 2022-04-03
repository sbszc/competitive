import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class CodeSignal_vowels {
    public static void main(String[] args) {
		String s = "hello, world";
		//String s = "codesignal";
		//String s = "eIaOyU";
		
		String[] letters = s.split("");

        Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);

		List<String> vowels = Arrays.stream(letters)
				.filter(letter -> pattern.matcher(letter).matches())
				.toList();

		if (!vowels.isEmpty()) {
			int vowelsIndex = vowels.size() - 1;
			for (int i = 0; i < letters.length; i++) {
				if (pattern.matcher(letters[i]).matches()) {
					letters[i] = vowels.get(vowelsIndex);
					vowelsIndex--;
				}
			}
	
			s = String.join("", letters);
		}

        System.out.println(s);
	}
}
