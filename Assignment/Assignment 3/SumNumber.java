import java.util.Scanner;
class SumNumber{
 
      static void calculateSum(int n){
        int sum=0;
	    for(int i=1;i<=n;i++){
		
                sum+=i;
             }	
            System.out.print("The Sum of Number from 1 to "+n+" is: "+sum);
     
            System.out.println();

       }

       public static void main(String[] arg){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Number: ");
            int i=sc.nextInt();
	    calculateSum(i);
         }

}