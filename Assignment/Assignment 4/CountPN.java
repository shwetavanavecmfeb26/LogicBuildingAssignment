import java.util.Scanner;

class CountPN{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];

	     System.out.print(" Enter 5 integers: ");
             for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
             }
		int countpos=0;
		int countneg=0;
		for(int i=0;i<arr.length;i++){
		if(arr[i]>0)
                      countpos++;
		else
			countneg++;
 	  }		
			
	System.out.print(" count of Positive Number:  "+countpos);
        System.out.println();

        System.out.print(" count of Positive Number:  "+countpos);
      }

}