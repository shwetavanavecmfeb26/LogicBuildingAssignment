import java.util.Scanner;
class ReString{
      public static void main(String[] arg){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter A String: ");
             String name=sc.nextLine();

            String reversed="";


		for(int i=name.length()-1;i>=0;i--){
			reversed+=name.charAt(i);
		

                }
		System.out.println("Reversed A String: "+reversed);
       }

}