package ds.queue;

public class App {

    public static void main(String[] args){
        Queue myQueue = new Queue(5);
        myQueue.insert(12);
        myQueue.insert(109);
        myQueue.insert(14);
        myQueue.insert(189);
        myQueue.insert(13);
        myQueue.view();
    }
}
