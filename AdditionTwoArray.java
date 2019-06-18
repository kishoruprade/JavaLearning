package practicePrograms;

public class AdditionTwoArray {

	public static void main(String[] args) {
		int[][] arrOne= {{1,2,4},{3,5,6}};
		int[][] arrTwo= {{1,2,4},{3,5,6}};
		
          int[][] res = new int[2][3];
          
          for(int i=0;i<2;i++){
        	  for(int j=0;j<3;j++){
        		  res[i][j]=arrOne[i][j]+arrTwo[i][j];
        		  System.out.print(res[i][j]+" ");        		  
        	  }
        	  System.out.println();
          }
  
     
     
		
	}

}
