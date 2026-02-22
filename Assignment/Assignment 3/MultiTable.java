import java.util.Scanner;
class MultiTable{


         static void printMultiplicationTable(int x){

              for(int i=1;i<=10;i++){
                   System.out.println(x+" * "+i+" = "+(x*i));


               }
           }

        public static void main(String[] arg){
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter Number: ");
	     int i=sc.nextInt(); 
 
	     printMultiplicationTable(i);

     }



}