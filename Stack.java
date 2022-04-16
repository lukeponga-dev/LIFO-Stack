public class Stack{
    // Class Variables
        private Node head;

    // Public Methods

   
/* this method will add new node to the front of the list  */
    public void push(String x){
        Node newNode = new Node(x);
        newNode.value = x;
        newNode.next = head;
        head = newNode;
        return;
    }
}