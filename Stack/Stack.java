package Stack;

public class Stack {

    public Node top; // top --> Head
    // private Node bottom; // bottom --> Tail  // <-- Not needed in Stack
    public int height; // height --> length

    public class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    // constructor
    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    // print method
    public void printStack(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // getTop()
    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    // getHeight()
    public void getHeight(){
        System.out.println("Height: " + height);
    }

    // PUSH Method
    // (Similar to prepending in LinkedList)
    public void push(int value){
        Node newNode = new Node(value);

        if (height == 0){
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    // POP Method
    // (similar to RemoveFirst() of LinkedList
    public Node pop(){
        Node temp = top;
        if (height == 0){
            return null;
        }

        top = top.next;
        temp.next = null;

        height--;
        return temp;
    }

    public static void main(String[] arguments){

        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        myStack.printStack();


        System.out.println("Pushing Node onto Stack");
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        myStack.printStack();

        System.out.println("Popping Node from Stack");
        myStack.pop();
        myStack.printStack();
    }
}
