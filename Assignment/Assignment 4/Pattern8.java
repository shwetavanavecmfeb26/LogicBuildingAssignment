class Pattern8{
     public static void main(String[] arg){
              int n=6;
             //Upper Triangle
            for(int i=1;i<=n;i++){
	
                  for(int j=1;j<=n-i;j++){
                       
			System.out.print(" ");                      
		 		
                   }
		   for(int K=1;K<=i;K++){
                       
			System.out.print("* ");                      		
                   }

		System.out.println();

             }
        // lower triangle
            for(int i=n-1;i>=1;i--){
	
                  for(int j=1;j<=n-i;j++){
                       
			System.out.print(" ");                       		
                   }
		   for(int K=1;K<=i;K++){
                       
			System.out.print("* ");                      		
                   }

		System.out.println();

             }

     }

}