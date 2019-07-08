package ds.ds.doublyLinkedList;

public class Node {
    public int data;
    public Node next;
    public Node previous; //every node knows about the node proceeding it as well as
    // the node following it


    public void displayNode(){
        System.out.print(" {" + data + "} ");
    }



}
