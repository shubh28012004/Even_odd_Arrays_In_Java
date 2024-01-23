// user input 
import java.util.*;
public class UserInput{
	public double[] inputNumbers(int size){
		Scanner sc=new Scanner(System.in);
		
		double[] inputarray = new double[size];
		int i ;
		for(i=0;i<size;i++){

			System.out.println("Enter number "+(i+1) + ":");
			inputarray[i] = sc.nextDouble();
		
				
		}
		return inputarray ; 
	}


}