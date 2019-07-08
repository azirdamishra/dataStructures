package ds.singlylinkedlist;

public class singlylinkedlist {     //engine of the list trade
    //reference to the first node (null without methods)
    private Node first;  //points to the first node
    // Node next (variable) points to the next node in the train of linked list
    // the last node in the train points to null

    // the nodes do not know about the nodes behind it as it only has the Node next instance
    // variable: it is unidirectional therefore singly linked list

    public singlylinkedlist(){

    }

    public boolean isEmpty(){
        return(first == null);
    }

    //inserts at the beginning of the linked list
    public void insertFirst(int data){    //parameter data is of the data type same as that of the
        // node class and therefore is of the type int

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;    // checkout notebook diagrams for clearer understanding
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println(" List first inserted becomes the last ");
        Node current = first;
        while (current != null){
            current.displayNode();
            current= current.next;
//            System.out.println();
        }
    }

    public void  insertLast(int data){  //not very efficient as we need to traverse the entire
        // linked list to reach the last node
        Node current = first;
        while (current.next != null){
            current = current.next;
        }
        // at the end of the loop the value of current is the last node in the linked list

        Node newNode = new Node();
        newNode.data = data;
       current.next = newNode;
    }
}



// Thus singly linked lists are a little inefficient due to the insertLast method
