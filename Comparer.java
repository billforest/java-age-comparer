// Comparer.java

import java.util.Scanner;

public class Comparer {
  
  public static void main( String[] args) {
  
  Scanner s = new Scanner( System.in);
  
  int n1;
  int n2;
  
  System.out.println( "Please give me a number:" );
  n1 = s.nextInt();
  System.out.println( "Please give me a second number:" );
  n2 = s.nextInt();
  
  System.out.println( "Is the 1st number greater than the 2nd number?" + (n1 > n2) );
  
  System.out.println( "Please give me a number:" );
  n1 = s.nextInt();
  }
}
  