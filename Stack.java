public class Stack {

  // Class Variables
  private Node head;

  /**
   * Constructor
   */
  public Stack() {
    head = null;
  }

  // Public Methods

  /**
   * adds item to the front of the list
   */
  public void push(String x) {
    Node newNode = new Node(x);
    if (isEmpty()) {
      head = newNode;

    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  /**
   * Removes the top item from the stack
   */
  public void pop() {
    if (isEmpty()) {
      System.out.print("\nStack Underflow\n");
    } else {
      head = (head).next;

    }

    // if (!isEmpty()) {
    // String value = head.value;
    // head = head.next;
    // System.out.print("Pop Head: " + value);
    // } else {
    // isEmpty();
    // }
  }

  /**
   * return true if stack is empty otherwise false
   */
  public boolean isEmpty() {
    if (head == null) {
      return true;
    }
    return false;
  }

  /**
   * Get the length of the queue
   */
  public int length() {
    int counter = 0;
    Node current = head;
    while (current != null) {
      counter++;
      current = current.next;
    }
    return counter;
  }

  /**
   * Method to return the top item in a stack
   */
  public void peek() {
    if (!isEmpty()) {
      String value = head.value;
      System.out.print(value);
    } else {
      isEmpty();
      return;
    }
  }

  /**
   * Print the queue
   */
//   public void dump() {
//     Node current = head;
//     while (current != null) {
//       System.out.print("\n" + current.value);
//       current = current.next;
//     }
//     System.out.println();
//   }
// }
public void dump(){
  Node temp = head;
  while (temp != null){
    System.out.println("\n" + temp.value);
    temp = temp.next;
  }
}
}

