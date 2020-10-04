 import java.util.Scanner; 

/**
 * This program determines the maximum number between 3 numbers
 * @author Zach Ramirez  
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create a scanner for user input 
    Scanner input = new Scanner(System.in);  

    //Ask the user for their numbers 
    System.out.println("please enter your first number"); 
    int number = input.nextInt(); 
    System.out.println("please enter your second number"); 
    int secondNumber = input.nextInt(); 
    System.out.println("Please enter your final number"); 
    int thirdNumber = input.nextInt();  
    
    //determine which number is maximum 
    if(number >= secondNumber && number >= thirdNumber){
      System.out.println("Maximum:" + number); 
      
    if(thirdNumber >= number && thirdNumber >= secondNumber); 
    }else{
      System.out.println("Maximum:" + secondNumber); 
    }
  
  
  
   
  

    
  }
}
