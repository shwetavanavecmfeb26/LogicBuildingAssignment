import java.util.Scanner;
import java.util.Arrays;

class SortArr{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];

	     System.out.println(" Enter 5 integers: ");
             for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
             }
               System.out.print("Sort Array: " );
  		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
		     System.out.print(arr[i]+ " ");
  
 	  }		
			
	
      }

}