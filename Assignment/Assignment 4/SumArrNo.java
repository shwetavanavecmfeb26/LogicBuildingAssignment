import java.util.Scanner;

class SumArrNo{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];

	     System.out.print(" Enter 5 integers: ");
             for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
             }
		int sum=0;
  		System.out.print("The Sum of All Number is: ");
		for(int array:arr){
		sum+=array;
 	  }		
			
	System.out.print(sum+" ");

      }

}