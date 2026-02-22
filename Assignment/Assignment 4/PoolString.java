import java.util.Scanner;
class PoolString{
      public static void main(String[] arg){
             String s1=new String("Hello");
	     String s2=s1.intern();
	     String s3="Hello";
	

System.out.println("Is str2 andstr3 pointing to the same object as str1? : "+(s2==s3));

       
       }

}