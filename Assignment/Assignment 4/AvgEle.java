import java.util.Scanner;

class AvgEle{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];

	     System.out.print(" Enter 5 integers: ");
             for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
             }
		int sum=0;
  		
		for(int array:arr){
		sum+=array;
 	  }
		int avg=sum/arr.length;		
			
	System.out.print("Average of NUmbers: " +avg);

      }

}