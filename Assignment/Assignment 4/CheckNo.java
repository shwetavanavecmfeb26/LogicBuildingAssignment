import java.util.Scanner;


class CheckNo{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];

	     System.out.println(" Enter 5 integers: ");
             for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
             }
               System.out.print("Enter number to search:" );
  		int number=sc.nextInt();

		Boolean found=false;

		for(int i=0;i<arr.length;i++){
		    if(arr[i]==number){
			found=true;
			break;
		     }
  		   
 	  }		
	  
    		if(found)
		   System.out.print("Found");
		else
		    System.out.print("Not Found" );

		
	
      }

}