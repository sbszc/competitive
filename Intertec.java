// package whatever; // don't place package name!

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/*
Write a program that parses a sentence and replaces each word with the following: 
1) The first letter of the word
2) The number of distinct characters between first and last character
3) The last letter of the word. 
For example, Smooth would become S3h. 
Words are separated by spaces or non-alphabetic characters and these separators should be maintained in their original form and location in the answer. 
A few of the things we will be looking at is accuracy, efficiency, solution completeness. 
*/
class Intertec {

  public static String middleNumber(String word){
    if (word.length() > 2) {
      String[] middleLetters = word.substring(1,word.length()-1).split("");
      int distinctLettersQuantity = new HashSet<String>(Arrays.asList(middleLetters)).size();
      return String.valueOf(distinctLettersQuantity);
    } else {
      return "";
    }
  }
  public static String wordParser(String input) {
    List<String> words = Arrays.asList(input.split("\\P{Alpha}+"));

    words = words.stream().map((word) -> {
      String firstLetter = word.substring(0,1);
      String middleNumber = middleNumber(word);
      String lastLetter = word.substring(word.length()-1);
      return firstLetter + middleNumber + lastLetter;
    }).collect(Collectors.toList());
    
    List<String> separators = new ArrayList<>(Arrays.asList(input.split("\\p{Alpha}+")));
    separators.remove(0);
    
    int wordsSize = words.size();
    int separatorsSize = separators.size();
    StringBuilder stringBuilder = new StringBuilder(wordsSize+separatorsSize);

    for (int i=0; i<wordsSize-1; i++) {
      stringBuilder.append(words.get(i));
      stringBuilder.append(separators.get(i));
    }
    stringBuilder.append(words.get(wordsSize-1));
    if (wordsSize == separatorsSize) stringBuilder.append(separators.get(separatorsSize-1));//If ends with separator

    
    return stringBuilder.toString();
  }
  
	public static void main (String[] args) {
    String output = wordParser("Creativity is thinking-up new things. Innovation is doing new things!");
		System.out.println(output);
    // expected: C6y is t4g-up n1w t4s. I6n is d3g n1w t4s!
	}
}