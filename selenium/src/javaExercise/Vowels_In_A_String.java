package javaExercise;

import java.util.Scanner;

public class Vowels_In_A_String {
	public static void main(String[] args) {
		
		System.out.println("Enter the word ");
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		char[]	chars = word.toCharArray();
		
		int count=0;
		
		for(char c: chars)
		{
			switch(c) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			
			}
			
		}
		
		System.out.println("The total no of vowels in that word is "+count);
			
		
	}

}
