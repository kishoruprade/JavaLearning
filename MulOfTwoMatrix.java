
public class MulOfTwoMatrix {

	public static void main(String[] args)
	{
		
		int[][] fst= {{1,1,1},{2,2,2},{3,3,3}};
		
		int[][] sec= {{1,1,1},{2,2,2},{3,3,3}};
		
		
		for(int i=0;i<fst.length;i++)
		{
			      for(int j=0;j<fst[i].length;j++)
			    	  
			            {
			    	                  
			    	                   
				               for(int k=0;k<sec.length;k++)
				                       {
				            	           int res=0; 
				            	              
					                           for(int l=0;l<sec[k].length;l++)
					                                {
						                               res=res+(fst[i][j]*sec[l][k]);
					                                }
					                           System.out.print(res+" ");    
				                        }
				               
				
			             }
				
			      System.out.println();
		}
		

	}

}
