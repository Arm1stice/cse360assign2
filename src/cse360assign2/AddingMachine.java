/**
 * CSE360 Assignment 2
 * Wyatt Calandro
 */
package cse360assign2;

import java.util.ArrayList;

/**
 * AddingMachine is a class for adding and subtracting
 */
public class AddingMachine {

  /**
   * The current sum
   */
  private int total;

  /**
   * Keeps track of the history of the calculation.
   */
  private ArrayList<String> history = new ArrayList<String>();

  /**
   * Instantiate new class, initializing total to 0.
   */
  public AddingMachine() {
    total = 0; // not needed - included for clarity
    history.add("0");
  }

  /**
   * Get the current total
   * 
   * @return Current total
   */
  public int getTotal() {
    return total;
  }

  /**
   * Add to current total
   *
   * @param value the value to add to the current total.
   */
  public void add(int value) {
    // Add value to total and record calculation to history
    total += value;
    history.add("+");
    history.add(String.valueOf(value));
  }

  /**
   * Subtract from current total
   *
   * @param value the value to subtract from the current total.
   */
  public void subtract(int value) {
    // Subtract value from total and record calculation to history
    total -= value;
    history.add("-");
    history.add(String.valueOf(value));
  }

  /**
   * Convert calculation to string.
   * 
   * @return string representing all math operations done to get total.
   */
  public String toString() {
    return String.join(" ", history);
  }

  /**
   * Reset total to 0 and clear history.
   */
  public void clear() {
    total = 0;
    history = new ArrayList<String>();
    history.add("0");
  }
}
