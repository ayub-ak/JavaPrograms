package stringInterviewProgs;

import java.util.Arrays;

public class FindAnagramUsingCharArray {

	public static void main(String[] args) 
	{
		//https://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html 
		String text = "army", input = "mary";
		System.out.println("Is the input Anagram : "+isAnagram(text,input));
	}
	
	public static boolean isAnagram(String text, String input)
	{
		if(text.length()==input.length())
		{
			char[] firstWord = text.toCharArray();
			char[] secondWord = input.toCharArray();
			Arrays.sort(firstWord);
			Arrays.sort(secondWord);
			return Arrays.equals(firstWord, secondWord)? true:false;
		}
		return false;
	}

}
