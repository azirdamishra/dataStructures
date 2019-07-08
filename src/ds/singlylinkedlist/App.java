package ds.singlylinkedlist;

public class App {
    public static void main(String[] args){
        singlylinkedlist myNewList = new singlylinkedlist();
        myNewList.insertFirst(100);
        myNewList.insertFirst(50);
        myNewList.insertFirst(10);
        myNewList.insertFirst(88);
        myNewList.insertLast(6);

        myNewList.displayList();
    }
}
