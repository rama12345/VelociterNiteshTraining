package com.velociter.nitesh.chapter4;


public class StringOperations {

	public static void main(String[]args)
    {
        String textOfString="Hardships often prepare ordinary people for an extraordinary destiny",
        		words="",arrayOfString[]=new String[20],tempCharacter,smallWords="",largeWords="";
        int i,j,lenghtOfString,numberOfWords=0;
        char characterOfString;
        textOfString = textOfString + " ";
        lenghtOfString = textOfString.length();
        System.out.print("Before Asecnding Order Sentence is : "+textOfString);
        for(i=0;i<lenghtOfString;i++){
        	// get the character from string
        	characterOfString = textOfString.charAt(i);
        	// check the condition of getting words in between space
            if(characterOfString!=' '){
            	words += characterOfString;
            }else{
            	// start the words has counting from 0-length
            	arrayOfString[numberOfWords++] = words;
            	words = "";
            }
        }
        // get the initial word in small words and longwords
        smallWords = largeWords = arrayOfString[0];    
        for(i = 0; i < numberOfWords; i++){      
            if(smallWords.length() > arrayOfString[i].length())    
            	smallWords = arrayOfString[i];    
            if(largeWords.length() < arrayOfString[i].length())    
            	largeWords = arrayOfString[i];    
        }    
        System.out.println("\nSmallest Word Of String : " + smallWords);    
        System.out.println("Largest Word Of String : " + largeWords);  
        // check the start to end of bubble shorting 
        for(i=1;i<numberOfWords;i++){
            for(j=0;j<numberOfWords-i;j++){
                if(arrayOfString[j].compareToIgnoreCase(arrayOfString[j+1])>0){
                	tempCharacter = arrayOfString[j];
                    arrayOfString[j] = arrayOfString[j+1];
                    arrayOfString[j+1] = tempCharacter;
                }
            }
        }	  
        
        System.out.print("The Resulting String After Asecnding Order : ");
        for(i=0;i<numberOfWords;i++)
            System.out.print(arrayOfString[i]+" ");
    }
}