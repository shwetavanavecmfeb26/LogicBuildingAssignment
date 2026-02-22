import java.util.Scanner;

class LargestEle{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];

	     System.out.println(" Enter 5 integers: ");
             for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
             }

  		
		int largest=arr[0];
		for(int i=0;i<arr.length;i++){
		  if( arr[i]>largest)
			largest=arr[i];
 	  }		
			
	System.out.print("Largest Element is "+largest);

      }

}