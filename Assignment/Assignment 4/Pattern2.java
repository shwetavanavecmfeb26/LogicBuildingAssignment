class Pattern2{
     public static void main(String[] arg){
              int x=5;
            for(int i=1;i<=x;i++){
		int num=1;
                  for(int j=1;j<=i;j++){
                       
			System.out.print(num);
    		
                      if(j<i)
                        System.out.print("*");
		  num+=2; 
		
                   }
		System.out.println();

             }


     }

}