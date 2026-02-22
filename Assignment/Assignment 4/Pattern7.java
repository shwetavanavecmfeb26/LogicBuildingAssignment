class Pattern7{
     public static void main(String[] arg){
              int x=6;
            
            for(int i=1;i<=x;i++){
	
                  for(int j=1;j<=x;j++){
                       
			if(i==1||i==x||j==1||j==x){
				System.out.print("*");

                        }
			else{
 				System.out.print(" ");
 			}
    		
                      
		 		
                   }
		System.out.println();

             }


     }

}