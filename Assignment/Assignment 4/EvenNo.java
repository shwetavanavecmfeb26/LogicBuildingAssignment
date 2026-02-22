import java.util.Scanner;

class EvenNo{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
 		int n=sc.nextInt();
		
		System.out.print("Even Number  1 to " +n+ ": ");
		for(int i=1;i<=n;i++){
		if(i%2==0)
          	    System.out.print(i+" ");
              }

      }

}