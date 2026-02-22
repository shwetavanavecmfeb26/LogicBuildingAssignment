import java.util.Scanner;


class CheckAge{

	public static void checkAgeCategory(int x){
		if(x>0 &&x<=18)
		     System.out.println("You are a Minor ");
		else if(x>18 && x<=40)
		     System.out.println("You are an Adult");
		else
		     System.out.println("You are a Senior");



		
      } 

	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int i=sc.nextInt();
            checkAgeCategory(i);
		

   
             
   }
}