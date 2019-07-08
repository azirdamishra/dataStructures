package ds.stack;
//STACK DATA STRUCTURE
public class Stack {

    private int maxSize;
    private long[] stackArray; //stores list of items
    private int top; // represents the index position of the last item placed on the stack

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1; // since the first element of the array on the stack starts with index 0
    }

    public void push(long j) {
        if (isFull()) {
            System.out.println("this stack is already full");
        } else {
            top++;
            stackArray[top] = j;
        }
    }

    public long pop(){
        if(isEmpty()){
            System.out.println("the stack is already empty");
            return -1;
        }else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }

    }

    /* in reality we are not moving things from the array but are using an variable like top
    to point to different index values in the array
    in reality the cells of the array are being overwritten
    pop reduces top by 1
    push inc top by 2
     */

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }



}
