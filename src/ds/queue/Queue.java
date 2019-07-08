package ds.queue;

public class Queue {
    private int maxSize;    //initialises the set no of slots
    private long[] queueArray;  //slots to store the main data
    private int front;  // this will be the index position for the element in the front
    private int rear;   //index position for the element at the back
    private int nItems;

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[maxSize];
        front = 0;  //index position of the first slot of the array
        rear = -1;  // there was no item in the array yet to be considered as the last element
        nItems = 0; //we dont have elements in the array yet
    }

    public void insert(long j){
        if(rear ==maxSize - 1){
            rear = -1; //the next character entered after ending of the array overwrites the
                        //first item
        }
        rear++;
        queueArray[rear] = j;
        nItems++;
    }

    public long remove(){ //remove the item from the front of the queue

        long temp = queueArray[front];
        front++;
        if(front == maxSize){
            front = 0; //we can set front back to the 0th index so that we can utilize the
            //entire array again
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.println("[");
        for(int i= 0; i<queueArray.length; i++){
            System.out.println(queueArray[i] + " ");
        }
        System.out.println("]");
    }

}
