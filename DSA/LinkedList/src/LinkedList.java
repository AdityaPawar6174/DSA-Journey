public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Node temp = head;
        while (temp != null){
            sb.append(temp.value);
            if (temp.next != null){
                sb.append(" , ");
            }
            temp = temp.next;
        }
        sb.append("}");
        System.out.println(sb.toString());
    }

    public void getHead(){
        System.out.println("Head: "+head.value);
    }
    public void getTail(){
        System.out.println("Tail: "+tail.value);
    }
    public void getLength(){
        System.out.println("Length: "+length);
    }

    // Appending New Node at the End of the Linked List
    public void append(int value){
        Node newNode = new Node(value);

        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    // Removing the Last Node of the Linked List
    public Node removeLast() {
        if (length == 0) {
            return  null;
        }

        // concept of temp and pre
        Node temp = head;
        Node pre = head;

        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        if (length == 0){
            head = null;
            tail = null;
        }

        return temp;
    }

    // prepending the newNode at the begining of the Lined list
    public void prepend(int value){
        Node newNode = new Node(value);

        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    // Removing First node from the Linked List
    public Node removeFirst(){
        if (length == 0){
            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            tail = null;
        }

        return temp;
    }

    // Getting the Node at a specific index
    public Node getNode(int index){
        if (index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for (int i=0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    // Setting the Node value at a specific index
    public boolean setNode(int index, int value){
        Node temp = getNode(index);

        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    // Inserting a new Node at a specific index
    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        }

        if(index == 0){
            prepend(value);
            return true;
        }

        if(index == length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = getNode(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;

        length++;
        return true;
    }

    // Removing a Node at a specific index
    public Node remove(int index){
        if(index < 0 || index > length) return null;

        if(index == 0) removeFirst();

        if(index == length - 1) removeLast();

        Node pre = getNode(index - 1);
        Node temp = getNode(index);

        pre.next = temp.next;
        temp.next = null;

        length--;
        return temp;
    }

    // Reversing the Linked List
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = head;

        Node after = temp.next;
        Node before = null;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

}
