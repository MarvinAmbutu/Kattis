package individualEvaluation;

import java.util.Scanner;

public class SodaSurpler {
  
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    
    int e = input.nextInt();
    int f = input.nextInt();
    int c = input.nextInt();
    
    int soda = 0;
    int empty = e + f;
    while(empty >= c){
      int sod = 0;
      sod = empty/ c;
      
      empty = sod + (empty % c);
      soda += sod;
    }
    
    System.out.println(soda);
    
    input.close();
  }   
}
