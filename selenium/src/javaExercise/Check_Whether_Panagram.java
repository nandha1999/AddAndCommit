package javaExercise;

public class Check_Whether_Panagram {
	
	//	What is a panagram?
	// A Panagram String should contain all the 26 alphabets 
	
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy do";
		System.out.println(isAnagram(s.toLowerCase()));
	}
	
	public static boolean isAnagram(String s) {
		
		if(s.length()<26) {
			return false;
			
		}
		else
		{
		
		for(char c='a';c<='z';c++) {
			
			if(s.indexOf(c)<0) {
				return false;
			}
		}
		}
		return true;
		
		
		
		
		
	}

}
