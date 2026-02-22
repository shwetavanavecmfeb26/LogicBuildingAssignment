import java.util.Scanner;


class IndexArr{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];

	     System.out.println(" Enter 5 integers: ");
             for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
             }
               System.out.print("Enter number to search:" );
  		int number=sc.nextInt();

		
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==number){
		        System.out.print(" The "+number+" is found at index "+i );

			
		     }
  		   
 	  }		
	  
    				
	
      }

}