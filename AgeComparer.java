// AgeComparer.java

import java.util.Scanner;

public class AgeComparer {
  
  public static void main( String[] args) {
  
  Scanner s = new Scanner( System.in);
  
  String name1;
  int num1;
  String name2;
  int num2;
  String result;
  int choice;
  
  System.out.println( "Enter the first name:" );
  name1 = s.next();
  System.out.println( "When is his/her birthday? OR how old is he/she? " );
  num1 = s.nextInt();
  
  System.out.println( "Enter the second name:" );
  name2 = s.next();
  System.out.println( "When is his/her birthday? OR how old is he/she? " );
  num2 = s.nextInt();
  
  System.out.println( "Will you compare by age? (1) or birth year? (2)");
  choice = s.nextInt();
  
  if( num1 == num2){
    result = " the same age as "; // we're chingus!
  }
  else if ( choice == 1 ) { // Comparing by age
    
    if (num1 > num2) {
      result = " older than ";
    }
    else {
      result = " younger thant ";
    }
  }
    else if ( choice == 2 ) { // Comparing by birth year
     if ( num1 < num2) {
      result = " older than " ;
    } 
    else {
      result = " younger than ";
    }
    }
    
  
  else { // Error handling
    result = "Error.";
  }
  
  
  
    System.out.println( name1 + " is" + result + name2 + "." );
  
  
  
  }
}