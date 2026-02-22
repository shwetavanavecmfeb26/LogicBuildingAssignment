import java.util.Scanner;

class FacNo{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
 		int n=sc.nextInt();
		
		System.out.print("Factorial of " +n+ ": ");
		int fac=1;
		for(int i=n;i>=1;i--){
		   fac*=i;
       }

	System.out.print(fac);
	


      }

}