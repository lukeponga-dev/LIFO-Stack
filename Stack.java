
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
    /* checks if stack is empty */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    /**
     * Get the length of the queue
     */
    public int getLength() {
        int counter = 0;
        Node current = head;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
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

    /**
     * Removes the node from front of list
     */
    public void pop() {
        if (!isEmpty()) {
            String value = head.value;
            head = head.next;
            System.out.println(value);
        } else {
            isEmpty();
        }
    }

    /**
     * look at the head of the list and return its value
     */
    public void peek() {
        if (!isEmpty()) {
            String value = head.value;
            System.out.println(value);
        } else {
            isEmpty();
        }
    }

    /**
     * Print the queue
     */
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println();
    }
}