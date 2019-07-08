package linkedlists;

public class App {

    public static void main(String[] args) {

        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeA.data = 3;

        Node nodeC = new Node();
        nodeA.data = 7;

        Node nodeD = new Node();
        nodeA.data = 8;             // independent nodes A,B,C,D were first created
        // they are independent variables which point to node objects

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;     //this is how we link the above node variables(referencing)

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));

    }

    public static int listLength(Node aNode){
        int length = 0;
        Node currentNode = aNode;

        while (currentNode != null){
            length++;
            currentNode = currentNode.next;
        }

        return length;
    }
}
