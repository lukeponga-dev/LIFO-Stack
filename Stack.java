
public class Stack {
   
    // Class Variables
    private Node head;

    public Stack() {
        head = null;
    }

    // Public Methods
    /* checks if stack is empty */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    /* Adds new node to the front of the list */
    public void push(String x) {
        Node newNode = new Node(x);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "-> ");
            current = current.next;
        }
        System.out.println();
    }
}