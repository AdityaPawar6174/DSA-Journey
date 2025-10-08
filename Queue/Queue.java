package Queue;

public class Queue {

    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    Node first; // first ---> Head
    Node last;  // Last --> Tail
    int length;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    // getFirst()
    public void getFirst(){
        System.out.println("First: " + first.value);
    }

    // getLast()
    public void getLast(){
        System.out.println("Last: " + last.value);
    }

    // getLength()
    public void getLength(){
        System.out.println("Length: " + length);
    }

    // PrintQueue()
    public void printQueue(){
        Node temp = first;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // ENQUEUE Method
    public void enqueue(int value){
        Node newNode = new Node(value);
        if (length == 0){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length ++;
    }

    // DEQUEUE Method
    public Node dequeue() {
        if (length == 0) {
            return null;
        }
        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
            System.out.println("Queue is now Empty");
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(1);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();

        System.out.println("Enqueue Operation...");
        myQueue.enqueue(2);
        myQueue.printQueue();

        System.out.println("Dequeue Operation...");
        myQueue.dequeue();
        myQueue.printQueue();

        myQueue.dequeue();

    }
}
