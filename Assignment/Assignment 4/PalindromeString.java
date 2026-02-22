import java.util.Scanner;
class PalindromeString{
      public static void main(String[] arg){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter A String: ");
             String str=sc.nextLine();


            String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
            String reversed="";


		for(int i=0;i<cleaned.length();i++){
			reversed+=cleaned.charAt(i);
		

                }
		if(cleaned.equals(reversed)){
		System.out.println("The String: "+str+  "is palindrome");
		}
		else{
		System.out.println("The String: "+str+  "is not palindrome");
		}
       }

}