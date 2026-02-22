import java.util.Scanner;

class StringArr{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[4];

	     System.out.println(" Enter 4 names: ");
             for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextLine();
             }

  		System.out.println("All Name of   is: ");
		for(String name:arr){
		System.out.println(name);
 	  }		
			
	

      }

}