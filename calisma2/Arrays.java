package calisma2;

public class Arrays {
	
	public  void MaxFinder(int array[]) {
		int firstNumber = array [0];
		for(int i=1;i<array.length;i++ ) {
			if(array [i]>firstNumber){
				firstNumber= array[i];
				}	
		}
		System.out.println(firstNumber);
	}
	public int [] numbers (int array []){
		
		
		int[] sortedArrays1s = new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			int counter=0;
			for(int j = 0 ;j<array.length;j++) {
				if(array[i]>array[j]) {
					counter=counter+1;
							}
				}
			
			  sortedArrays1s[counter]=array[i];
			}
		return sortedArrays1s;
		}
		
		
		
	}


