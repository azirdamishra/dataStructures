package ds.ds.doublyLinkedList;

public class doublyLinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }else{
            first.previous = newNode;   //the place where the first points, its previous
                                        //node value points there
        }

        newNode.next = first;   // the new node's next field will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        }else{
            last.next = newNode;//assigning old last to new node
            newNode.previous = last;// the old last will be the newNode's previous
        }
        last = newNode;// the linked list's last field should point to the newNode
    }

    //assume non empty list
    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){ // there is only one item in the list
            last = null;
        }else{
            first.next.previous = null;// the list's first node will point to null
        }

        first = first.next; //we are assigning the reference of the node following the old
        // first node to the first field in the linked list object
        return temp;// return the old first deleted node
    }

    //assume a non empty list
    public Node deleteLast(){
        Node temp = last;
        if(first.next == null){
            first = null;// we have deleted the only node present
        }else{
            last.previous.next = null; //the last node's previous node's next field will point to null
        }
        last= last.previous;
        return temp;
    }

    //assume non empty list
    public boolean insertAfter(int key, int data){
        // key is the data in the particular node after which we want to insert a new node
        // data is the new info we want to put in the newNode
        Node current = first; //we start from the beginning of the list
        while (current.data != key){// as long as we have not found a particular key in the node
           current= current.next;
           if(current == null){ //we have reached the end of the list and have not found our key
               return false;
           }
        }

        Node newNode = new Node();
        newNode.data = data;

        if(current == last){
            current.next = null;
            last = newNode; //apparently everything gets done here :/
            // should'nt it be the same as insertLast tho??
        }else{
            newNode.next = current.next;// newNode's next field should point to the node ahead
                                        // of the current node
            current.next.previous = newNode;// the node ahead of current, its previous field
            // should point to the newNode
        }

        newNode.previous = current ;
        current.next = newNode;

        return true;
    }

    //assume non empty list
    public Node deleteKey(int key){
        Node current = first; // start from the beginning
        while (current.data != key){
            current = current.next;
            if(current == null){
                return null;
            }
        }

        if(current == first){
            first = current.next;// make the first field point to the node following
            // current since current will be deleted
        }else{
            current.previous.next = current.next;
        }

        if(current == last){
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }

        return current;
    }

    public void displayForward(){
        System.out.println(" List first inserted becomes the last ");
        System.out.println("Lists from the front");
        Node current = first;
        while (current != null){
            current.displayNode();
            current= current.next;
        }
    }

    public void displayBackwark(){
        System.out.println(" lists from the back ");
        Node current = last;
        while (current != null){
            current.displayNode();
            current= current.previous;
        }
        System.out.println();
    }


}
