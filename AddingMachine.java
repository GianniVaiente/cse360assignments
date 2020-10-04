package cse360assignment02;

/**
 * 
 * @author Gianni Vaiente
 * CSE 360 
 * Assignment 2 
 */

public class AddingMachine {
	
  /**
   * total represents the current number stored in the adding machine.
   * 
   */
  private int total;

  /**
   * record holds the operations performed by the adding machine
   * can be reset by calling clear()
   * 
   */
  private String record;
  /**
   * Creates an Object of type AddingMachine, and sets the total to 0. 
   * 
   * @param  variable Description text text text. 
   * @return Description text text text.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    record = "0";
  }
  /**
   * Returns the integer store in the AddingMachine's total variable.               
   * 
   * @param none
   * @return the AddingMachine's current total value.
   */
  public int getTotal () {
    return this.total;
  }
  
  /**
   * the int value is added to the AddingMachine's total value.      
   *
   * @param  int value - the integer you want to add        
   * @return void 
   */
  public void add (int value) {
	  this.total = total + value;
	  this.record += " + " + value;
  }
  
  
  /**
   * the int value is subtracted from the AddingMachine's total value.               
   * 
   * @param int value - the integer you want to subtract.
   * @return void
   */
  public void subtract (int value) {
	  this.total = total - value;
	  this.record += " - " + value;
  }
  /**
   * Returns a string that contains the record of all operations 
   * performed by the Adding Machine.                         
   *
   * @param  none          
   * @return this.record the list of operations performed by the adding machine.;
   */
  public String toString () {
    return this.record;
  }
  /**
   * Clears the history record of operations performed by the AddingMachine
   * Resets the total to 0;
   *     
   * @param  none          
   */
  public void clear() {
	  this.record = "0";
	  this.total = 0;
  }
}