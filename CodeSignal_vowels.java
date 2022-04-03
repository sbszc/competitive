import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class CodeSignal_vowels {
    public static void main(String[] args) {
		String s = "Hello, World!";
		List<String> letters = Arrays.asList(s.split(""));

        Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);

		List<String> vowels = letters.stream()
				.filter(letter -> pattern.matcher(letter).matches())
				.toList();

		if (!vowels.isEmpty()) {
			int vowelsIndex = vowels.size() - 1;
			for (int i = 0; i < letters.size(); i++) {
				if (pattern.matcher(letters.get(i)).matches()) {
					letters.set(i, vowels.get(vowelsIndex));
					vowelsIndex--;
				}
			}
	
			s = String.join("", letters);
		}

        System.out.println(s);
	}
}
