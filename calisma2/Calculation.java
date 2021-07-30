package calisma2;

public class Calculation {
	
		public String Palindrom(String input) {
		      String temp="";
		        System.out.println(input.length());
		        for (int i = input.length()-1 ; i>= 0; i--) {
		          char temp1=input.charAt(i);
		          temp=temp + String.valueOf(temp1);
		        }
		        
		return temp;
		}
		
		

	}
