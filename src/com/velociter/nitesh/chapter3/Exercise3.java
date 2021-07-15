package com.velociter.nitesh.chapter3;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int setCount = 5;                                                  
		    int setSize = 6;                                                   
		    int range = 49;                                                    
		    int lucky;                                                         
		    int luckyCount;                                                    
		 
		    for(int i = 0 ; i < setCount ; ++i) {
		      int lucky1 = 0;                                                  
		      int lucky2 = 0;
		      int lucky3 = 0;
		      int lucky4 = 0;
		      int lucky5 = 0;
		      int lucky6 = 0;
		 
		      luckyCount = 0;                                                  
		      while(luckyCount < setSize) {
		    	lucky = (int)(range*Math.random()) + 1;
		        switch(luckyCount) {
		          case 0:                                                      
		            lucky1 = lucky;                                            
		            luckyCount++;                                              
		            break;
		          case 1:                                                      
		            if(lucky != lucky1) {                                      
		              lucky2 = lucky;                                          
		              luckyCount++;                                            
		            }
		            break;
		          case 2:                                                      
		            if(lucky != lucky1 && lucky != lucky2) {
		              lucky3 = lucky;
		              luckyCount++;
		            }
		            break;
		           case 3:                                                     
		            if(lucky != lucky1 && lucky != lucky2 && lucky != lucky3) {
		              lucky4 = lucky;
		              luckyCount++;
		            }
		            break;
		           case 4:                                                     
		            if(lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4) {
		              lucky5 = lucky;
		              luckyCount++;
		            }
		            break;
		           case 5:                                                     
		            if(lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4 && lucky != lucky5) {
		              lucky6 = lucky;
		              luckyCount++;
		            }
		            break;
		        }
		      }
		 
		      System.out.print("\nSet " + (i + 1) + ":");                      
		 
		      System.out.print(" " + lucky1 + " " + lucky2  + " " + lucky3  +  
		                       " " + lucky4  + " " + lucky5  + " " + lucky6);
		}
	}
}
