package ds.ds.circularLinkedList;

public class circularLinkedList {

    private Node first;
    private Node last;
    // both of them have been assigned null by default
    public boolean isEmpty(){
        return(first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;   //new node becomes old first
        first = newNode;    //first place
    }

    public void insertLast(int data){

        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first= newNode;
        }else{
            last.next = newNode; // the next of the last node points to the newNode
            last = newNode; //the value of last becomes the new node that we have added
        }
    }

    public int deleteFirst(){
        int temp = first.data;
        if(first.next == null){
            last = null;
        }
        first = first.next;// first will point to the old's next value
        return temp;
    }

    public void displayList(){
        System.out.println(" List first inserted becomes the last ");
        Node current = first;
        while (current != null){
            current.displayNode();
            current= current.next;
        }
    }


}
