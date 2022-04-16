public class Stack{
    // Class Variables
        private Node head;

    // Public Methods

    /**
     * 1. Stack: define a class called Stack in a file called Stack.java. This class is to
     * implement a dynamic linked list as a stack that supports the following public methods
     * using recursion where applicable.
     * ● push(String x) - add item x to the front of the list.
     * ● pop() - remove an item from the front of the list.
     * ● peek() - look at the first item of the list and return its value.
     * ● isEmpty() - returns boolean true if head node is null; false otherwise.
     * ● length(): returns as an int the number of commands in the queue.
     * ● dump(): prints the contents of the stack to standard output.
    */
/* this method will add new node to the front of the list  */
    public void push(String x){
        Node newNode = new Node(x);
        newNode.value = x;
        newNode.next = head;
        head = newNode;
        return;
    }
}