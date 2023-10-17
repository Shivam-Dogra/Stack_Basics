package DSA.Stack;

public class Stack {
    private int height;
    private Node top;

    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    //stack constructor
    public Stack(int data){
        Node newNode = new Node(data);
        top = newNode;
        height = 1;
    }


    //print stack
    public void printStack(){
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //get top 
    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    //get height
    public void getHeight(){
        System.out.println("Height: " + height);
    }

    //push -> this method will add new node in stack
    public void push(int value){
        //create new node
        Node newNode = new Node(value);
        //case 1: empty stack
        if(height == 0){
            top = newNode;
        }
        //case 2: stack is not empty
        else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }


}
