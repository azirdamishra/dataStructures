package adt;

import ds.stack.Stack;
import ds.stack.StringReversal;

//import java.util.LinkedList;

public class App {

    public static void main(String[] args){
//        Counter myCounter = new Counter("myCounter");
//
//        myCounter.increment();
//        myCounter.increment();
//        myCounter.increment();
//        System.out.println(myCounter.getCurrentValue());
//
//        LinkedList myList = new LinkedList();

//      Stack theStack = new Stack(3);
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//
//        while(!theStack.isEmpty()){
//            long value = theStack.pop();
//            System.out.println(value);
//        }
//
//        //the numbers are printed in reverse order of input due to LIFO

        System.out.println(reverseString("HELLO"));

    }

    public static String reverseString(String str){
        int stackSize = str.length(); // set max stack size
        StringReversal newStack = new StringReversal(stackSize);
        for(int j = 0; j<str.length(); j++){
            char ch = str.charAt(j); //used to get a char from the input string
            newStack.push(ch);
        }

        String result = " ";
        while (!newStack.isEmpty()){
            char ch = newStack.pop();
            result += ch;
        }

        return result;
    }
}
