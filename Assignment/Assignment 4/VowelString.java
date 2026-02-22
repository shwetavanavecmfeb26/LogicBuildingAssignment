import java.util.Scanner;
class VowelString{
      public static void main(String[] arg){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter A String: ");
             String str=sc.nextLine();

           int count=0;

	   str=str.toLowerCase();

           for( int i=0;i<str.length();i++){

 		char ch=str.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			count++;
	  	}
	    }
		System.out.println("Number of vowels in String: "+count);
       }

}