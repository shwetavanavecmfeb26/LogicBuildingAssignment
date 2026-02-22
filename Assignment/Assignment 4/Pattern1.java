class Pattern1{
     public static void main(String[] arg){
              int x=5;
	//upper number
            for(int i=1;i<=x;i++){
                  for(int j=1;j<=i;j++){
			System.out.print(i);
                      if(j<i)
                        System.out.print("*");

                   }
		System.out.println();

             }

	//lower
            for(int i=x;i>=2;i--){
                  for(int j=1;j<=i;j++){
			System.out.print(i);
                     if(j<i)
                        System.out.print("*");
			
                   

		 }
		System.out.println();

             }

     }

}