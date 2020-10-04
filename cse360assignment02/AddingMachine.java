package cse360assignment02;

/**
 * 
 * @author Gianni Vaiente
 * CSE 360 
 * Assignment 2 (part 1)
 */

public class AddingMachine {
	
	  /**
	   * total represents the current number stored in the adding machine.
	   * 
	   */
  private int total;
  /**
   * Creates an Object of type AddingMachine, and sets the total to 0. 
   * 
   * @param  variable Description text text text. 
   * @return Description text text text.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  /**
   * Returns the integer store in the AddingMachine's total variable.               
   * 
   * @param none
   * @return the AddingMachine's current total value.
   */
  public int getTotal () {
    return 0;
  }
  
  /**
   * the int value is added to the AddingMachine's total value.      
   *
   * @param  int value - the integer you want to add        
   * @return void 
   */
  public void add (int value) {
  }
  
  /**
   * the int value is subtracted from the AddingMachine's total value.               
   * 
   * @param int value - the integer you want to subtract.
   * @return void
   */
  public void subtract (int value) {
  }
  /**
   * Returns a string that contains the record of all operations 
   * performed by the Adding Machine.                         
   *
   * @param  none          
   * @return "";
   */
  public String toString () {
    return "";
  }
  /**
   * Clears the record of operations performed by the Adding Machine
   *     
   * @param  none          
   */
  public void clear() {
  }
}