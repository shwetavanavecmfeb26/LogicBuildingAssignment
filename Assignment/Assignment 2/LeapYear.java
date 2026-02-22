class LeapYear{
        public static void main(String[] arg){
              int year=1900;
	      //int year1=1900;
            
            if(year%4==0 && year%100!=0 || year%400==0)
    		  System.out.println("It is Leap Year");
	    else
		  System.out.println("It is not Leap Year");
     }
}


