package e2;
import java.util.Arrays;
import java.util.Scanner;

public class e2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String word1 = scanner.nextLine();
		System.out.println("Enter the second String: ");
		String word2 = scanner.nextLine();
		word1 = word1.toUpperCase(); //Capitalize all letters
		word2 = word2.toUpperCase();
		System.out.println("Are they anagrams? " + isAnagram(word1, word2));
		printLetterCounts(word1);
		String string1 = "abc";
		String string2 = new String("abc");
		System.out.println(string1 == string2); //this outputs false, because the second "abc" gets stored in a different spot in the memory.
												//if no new String is created it works, because both string1 and string2 point to the same place in the memory, where "abc" was stored.
		System.out.println(string1.equals(string2));	//equals() compares the content of the objects and not the pointer to the memory and thus outputs true
	}
	
	public static boolean isAnagram(String a, String b) {
		int[] countsA = countLetters(a);
		int[] countsB = countLetters(b);
		if(Arrays.equals(countsA, countsB)) {
			return true;
		}
		return false;
	}
	
	public static int[] countLetters(String s) {
		int[] counts = new int[26];
		for(int i = 0; i < s.length();i++) {
			char c = s.charAt(i);			//All letters are in Order in they're ASCII value after A.
			int letter = c-'A'; 			//Use this to map those to the int Array
			counts[letter]++;
		}
		return counts;
	}
	
	public static void printLetterCounts(String s) {
		int[] counts = countLetters(s);
		for (int i = 0; i < 26; i++) {
			if(counts[i] != 0) {
				System.out.println((char)(i + 'A') +": " + counts[i]);
			}
		}
	}
}
