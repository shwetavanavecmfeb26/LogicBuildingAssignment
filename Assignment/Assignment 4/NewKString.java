import java.util.Scanner;
class NewKString{
      public static void main(String[] arg){
             String s1=new String("Hello");
	     String s2=new String("Hello");


       //Both variables point to the same object using == but not point same variable
	   System.out.println("Using ==:  "+(s1==s2));

           System.out.println("Using.equals():  "+s1.equals(s2));


       }

}