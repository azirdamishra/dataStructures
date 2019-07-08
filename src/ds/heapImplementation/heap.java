package ds.heapImplementation;

public class heap {
    private Node[] heapArray;
    private int maxSize;    // max size of the array
    private int currentSize;    // no of nodes in the array

    public heap(int size){
        this.maxSize = size;
        currentSize = 0;
        heapArray = new Node[size]; //actually creates the array

    }

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean isEmpty(){
        return (currentSize == 0);
    }

    public boolean insert(int key){
        if(currentSize == maxSize){ //array is full
            return false;
        }

        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;

        trickleUp(currentSize);
        currentSize++;

        return true;
    }

    public void trickleUp(int index){   //takes in the index position of the newly added node
        int parentIndex = (index -1)/2;
        Node nodeToInsert = heapArray[index];

        // loop as long as we haven't reached the root node and the index of the parent is less
        // than index of the child (making a max heap)
        while (index>0 && heapArray[parentIndex].getKey() < heapArray[index].getKey()){
            heapArray[index] = heapArray[parentIndex];
            index = parentIndex;
            parentIndex = (parentIndex -1)/2;   //move up
        }
        heapArray[index] = nodeToInsert;
    }

    public Node remove(){
        Node root = heapArray[0];
        currentSize--;
        heapArray[0]  = heapArray[currentSize];

        trickleDown(0);
        return root;
    }

    public void trickleDown(int index){
        int largerChildIndex;
        Node top = heapArray[index];    //save the value into the top variable

        //will run as long as index is not in the bottom row
        while (index < currentSize/2){
            int leftChildIndex = 2*index + 1;
            int rightChildIndex = leftChildIndex + 1;

            //figure out which child is larger
            if(rightChildIndex < currentSize &&
                    heapArray[leftChildIndex].getKey()< heapArray[rightChildIndex].getKey()){
                largerChildIndex = rightChildIndex;
            }else{
                largerChildIndex = leftChildIndex;
            }

            if(top.getKey() >= heapArray[largerChildIndex].getKey()){
                //successfully made root the largest key
                break;
            }

            heapArray[index] = heapArray[largerChildIndex];
            index = largerChildIndex;// go downwards
        }

        heapArray[index] = top;


    }

}
