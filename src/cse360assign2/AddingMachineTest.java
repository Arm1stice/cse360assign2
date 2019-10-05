package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AddingMachineTest {

  @Test
  void testAdd() {
    AddingMachine addingMachine = new AddingMachine();
    assertEquals(0, addingMachine.getTotal());
    
    addingMachine.add(3);
    assertEquals(3, addingMachine.getTotal());
    
    addingMachine.add(5);
    assertEquals(8, addingMachine.getTotal());
  }

  @Test
  void testSubtract() {
    AddingMachine addingMachine = new AddingMachine();
    assertEquals(0, addingMachine.getTotal());
    
    addingMachine.subtract(3);
    assertEquals(-3, addingMachine.getTotal());
    
    addingMachine.subtract(5);
    assertEquals(-8, addingMachine.getTotal());
  }
  
  @Test
  void testAddAndSubtract() {
    AddingMachine addingMachine = new AddingMachine();
    assertEquals(0, addingMachine.getTotal());
    
    addingMachine.add(3);
    assertEquals(3, addingMachine.getTotal());
    
    addingMachine.subtract(5);
    assertEquals(-2, addingMachine.getTotal());
  }
  
  @Test
  void testClear() {
    AddingMachine addingMachine = new AddingMachine();
    assertEquals(0, addingMachine.getTotal());
    
    addingMachine.add(3);
    assertEquals(3, addingMachine.getTotal());
    
    addingMachine.clear();
    assertEquals(0, addingMachine.getTotal());
  }
  
  @Test
  void testHistory() {
    AddingMachine addingMachine = new AddingMachine();
    assertEquals(0, addingMachine.getTotal());
    assertEquals("0", addingMachine.toString());
    
    addingMachine.add(3);
    assertEquals(3, addingMachine.getTotal());
    assertEquals("0 + 3", addingMachine.toString());
    
    addingMachine.subtract(5);
    assertEquals(-2, addingMachine.getTotal());
    assertEquals("0 + 3 - 5", addingMachine.toString());
    
    addingMachine.clear();
    assertEquals("0", addingMachine.toString());
  }
}
