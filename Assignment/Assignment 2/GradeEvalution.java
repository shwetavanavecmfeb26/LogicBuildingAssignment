class GradeEvalution{
        public static void main(String[] arg){
              int marksInMaths=80;
              int marksInScience=85;
              int marksInHistory=90;


	      int average=( marksInMaths+marksInScience+marksInHistory)/3;
              System.out.println("Average Marks= "+average);

	      if(average>=90)
		  System.out.println("Grade:A");

	      else if(average>=70 && average<=89)
    		  System.out.println("Grade:B");

 	      else if(average>=50 && average<=69)
    		  System.out.println("Grade:c");

              else if(average>=30 && average<=49)
    		  System.out.println("Grade:D");

              else 
    		  System.out.println("Fail");
	

      }




}