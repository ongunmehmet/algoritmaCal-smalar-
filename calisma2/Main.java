package calisma2;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Calculation calculate =new Calculation();
		
		
		Arrays calculateArray=new Arrays();
		int numbers []= {10,5,62,74,58,104};
		
		int [] sortedList = calculateArray.numbers(numbers);
		for(int num: sortedList)
		System.out.println(num);
		
		 
		
				

	}
 
}
