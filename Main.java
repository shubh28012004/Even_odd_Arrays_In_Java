// Name: Shubh Agarwal
// PRN: 2207126108
// Batch: AIML B2 

import java.util.* ; 

public class Main {
    public static void main(String[] args) {
        // Create an instance of UserInput 
        UserInput userInput = new UserInput();
        Scanner sc = new Scanner(System.in);
        int size ; 
        System.out.println("Enter the size of array ");
        size = sc.nextInt();
        double[] inputarray = userInput.inputNumbers(size);
        double[] even = new double[size];
		double[] odd = new double[size];
		int count = 0 ; 
		int even_index = 0 ;
		int odd_index = 0 ; 
		int i ;
		for(i=0;i<size;i++){
			if(inputarray[i]%2==0){
				even[even_index] = inputarray[i];
				even_index++;
			}
			else{
				odd[odd_index] = inputarray[i];
				odd_index ++ ; 
			}
		}
		System.out.println("Even numbers are: ");
		for(i=0;i<even_index;i++){
			
			System.out.print(even[i] + " ");
		}
		System.out.println("\n\n ");
		System.out.println("odd numbers are: ");
		for(i=0;i<odd_index;i++){
			System.out.println(odd[i]);
		}
	}
}


