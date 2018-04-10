package Assignment1;

import java.util.Scanner;

public class EasiestProb {
  
  public static void main(String [] args){
    
    int firstValue;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Input the number:");
    firstValue = Integer.parseInt(input.nextLine());
    
    while(firstValue != 0){ 
    getSecondVal(firstValue);
    firstValue = Integer.parseInt(input.nextLine());
    }
    //System.out.println("It worked");
    
    
  }
  
  //Sums the numbers that make an integer
  public static int getSum(int value){
    
    int sum = 0;
      
    //Tokenizes an integer into its various digits
    for (char ch : Integer.toString(value).toCharArray()) { 
      
      int digit = ch - '0';
      sum += digit;
    //System.out.println(digit);
    }
    return sum;
  }
  //looks for a value greater than 10 that matches the sum of the given integer individual values
  //Prints the value out
  
  public static void getSecondVal(int firstValue){
    
    int secondValue, firstValSum, resultSum;
    boolean foundVal = false;
    
    firstValSum = getSum(firstValue);
    secondValue = 11;
    
    while(foundVal == false){
      
      resultSum = getSum(firstValue * secondValue);
      
      if(firstValSum == resultSum){
        
        foundVal = true;
        System.out.println(secondValue);
       
      }
      
      secondValue++;
    }
      
    
  }
}
