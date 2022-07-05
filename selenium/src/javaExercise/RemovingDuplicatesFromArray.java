package javaExercise;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array[] = {"apple","samsung","vivo","oppo","oneplus","realme","moto","nokia","apple","nokia"};
		
		
		// finding whether the array contains duplicates or not using hashset
		
		Set<String> uniqueValues = new HashSet<String>();
		Set<String> duplicateValues = new HashSet<String>();
		int flag=0;
		
		for(String e:array)
		{
			//HashSet has a method called add. This method returns a boolean value when the parameter passed is already present in the HashSet
			
			if(uniqueValues.add(e)==false)
			{
//				System.out.println("The array contains duplicate values");
				flag=1;
				duplicateValues.add(e);
				
				
			}
			
		}
		
		if(flag==1) {
			System.out.println("The duplicate values present in that array is "+duplicateValues);
		}
		if(flag==0)
		{
			System.out.println("The array is an unique array ");
		}
		
		
		

	}

}
