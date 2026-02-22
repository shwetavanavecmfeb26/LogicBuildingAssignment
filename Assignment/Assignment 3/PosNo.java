import java.util.Scanner;
class PosNo{


     static int  askForPositiveNumber(){
          Scanner sc=new Scanner(System.in);
		int number;
            do{
	      System.out.print("Enter Positive Number: ");
	      number=sc.nextInt();
            }while(number<=0);
          return number;
                  			
      }
      
     public static void main(String[] arg){
             
	   int positiveNumber=askForPositiveNumber();
         System.out.println("You Entered Positive Number: "+positiveNumber);



       }

   
}