import java.util.Scanner;
class PrintNo{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
 		int n=sc.nextInt();

		System.out.print(" Number  from 1 to "+n+" : ");
		for(int i=1;i<=n;i++){
                   
		   System.out.print(i+" ");

                }
      }

}