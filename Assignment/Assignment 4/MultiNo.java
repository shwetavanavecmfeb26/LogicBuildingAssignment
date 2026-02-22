import java.util.Scanner;

class MultiNo{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
 		int n=sc.nextInt();

		System.out.println("Multiples of 3 between 1 to " +n+": ");
     		for (int i=1;i<=n;i++){
 			int multi=3*i;
		       if(multi<=n)
			  System.out.print(multi+" ");
		  


               }

       }

}