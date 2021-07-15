package com.velociter.nitesh.chapter4;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        String textOfString,words="",arrayOfString[]=new String[20],t;
        int i,j,l,numberOfWords=0;
        char characterOfString;
        System.out.println("Enter the sentence : ");
        textOfString = scanner.nextLine();
        textOfString = textOfString + " ";
        l = textOfString.length();
        for(i=0;i<l;i++){
        	characterOfString = textOfString.charAt(i);
            if(characterOfString!=' '){
            	words += characterOfString;
            }else{
            	arrayOfString[numberOfWords++] = words;
            	words = "";
            }
        }
        for(i=1;i<numberOfWords;i++){
            for(j=0;j<numberOfWords-i;j++){
                if(arrayOfString[j].compareToIgnoreCase(arrayOfString[j+1])>0){
                    t = arrayOfString[j];
                    arrayOfString[j] = arrayOfString[j+1];
                    arrayOfString[j+1] = t;
                }
            }
        }
        System.out.println("The New Sentence is : ");
        for(i=0;i<numberOfWords;i++)
            System.out.print(arrayOfString[i]+" ");
    }
}
