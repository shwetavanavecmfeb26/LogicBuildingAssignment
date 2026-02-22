class Pattern{
     public static void main(String[] arg){
              int x=5;
            for(int i=1;i<=x;i++){
                  for(int j=1;j<=i;j++){
			System.out.print(j);
                      if(j<i)
                        System.out.print("*");

                   }
		System.out.println();

             }


     }

}