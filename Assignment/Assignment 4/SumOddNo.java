import java.util.Scanner;

class SumOddNo{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
 		int n=sc.nextInt();
		
		System.out.print("The sum Of Odd Number from 1 to " +n+ ": ");
		int sum=0;
		for(int i=1;i<=n;i++){
		    if(i%2!=0)
			sum+=i;
                }
	System.out.print(sum+" ");	

      }

}