
import java.util.Scanner;

/*class Sum{
       public static  int sumOfTwoNumbers(int x,int y){
             int sum=x+y;
             return sum;  
         
    }
      public static void main(String[] arg){
              Scanner sc=new Scanner(System.in);
	      System.out.print("Enter First Number: ");
               int a=sc.nextInt();
	      System.out.print("Enter second Number: ");
               int b=sc.nextInt();
         System.out.println("Sum of "+a+" and " +b+ " is "+sumOfTwoNumbers(a,b)); 
     }

}*/



class Sum{
       public static  int sumOfTwoNumbers(int x,int y){
             int sum=x+y;
             return sum;  
         
    }
      public static void main(String[] arg){
              Scanner sc=new Scanner(System.in);
	      System.out.print("Enter First Number: ");
               int a=sc.nextInt();
	      System.out.print("Enter second Number: ");
               int b=sc.nextInt();
		int sum=sumOfTwoNumbers(a,b);
         System.out.println("Sum of "+a+" and " +b+ " is "+sum); 
     }

}



