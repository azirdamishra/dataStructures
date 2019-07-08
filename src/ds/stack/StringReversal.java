package ds.stack;

public class StringReversal {

    private int maxSize;
    private char word[];
    private int top;

    public StringReversal(int size){

        this.maxSize =size;
        this.word= new char[maxSize];
        this.top = -1;
    }

    

    public void push(char j){
        if(isFull()){
            System.out.println(" this stack is already full");
        }else {
            top++;
            word[top] = j;
        }
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("this stack is already empty");
            return '0';
        }else {
            int oldTop = top;
            top--;
            return word[oldTop];
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public int peak(){
        return word[top];
    }

}

