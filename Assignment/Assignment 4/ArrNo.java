import java.util.Scanner;

class ArrNo{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];

	     System.out.print(" Enter 5 integers: ");
             for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
             }
  		System.out.println("Array Elements are: ");
		for(int array:arr){
		System.out.print(array+" ");
 	  }		
			


      }

}