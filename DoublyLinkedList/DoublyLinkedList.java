package DoublyLinkedList;

public class DoublyLinkedList {

    //------------------ Node Class -------------------------
    public class Node {
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int length;

    //----------------- constructor -----------------------
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //------------------- METHODS -------------------------

    // getHEAD()
    public void getHEAD(){
        System.out.println("Head: " + head.value);
    }
    // getTAIL()
    public void getTAIL(){
        System.out.println("Tail: " + tail.value);
    }
    // getLENGTH()\
    public void getLENGTH(){
        System.out.println("Length: " + length);
    }

    // printList()
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // APPEND Method
    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // REMOVE LAST Method
    public Node removeLast(){
        if (length == 0)
            return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    // PREPEND Method
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else  {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    // REMOVE FIRST
    public Node removeFirst(){
        Node temp = head;
        if (length == 0){
            return null;
        }
        if (length == 1){
            head = null;
            tail = null;
        }
        else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
    
    // GET Method
    // getting a node at a particular index
    public Node get(int index){
          if(index < 0 || index >= length){
              return null;
          }
          Node temp = head;

          if (index < length/2) {
              for (int i = 0; i < index; i++) {
                  temp = temp.next;
              }
          } else {
              temp = tail;
              for(int i=length-1; i > index; i--){
                  temp = temp.prev;
              }
          }
          return temp;
    }

    // SET Method
    // setting the value at a particular index
    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    // INSERT Method
    // inserting node at a particular
    public boolean insert(int index, int value){
        if (index < 0 || index > length){
            return false;
        }
        if (index==0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;

        length++;

        return true;
    }

    // REMOVE Method
    // Removing Node from a particular index
    public Node remove(int index){
        if (index < 0 || index >= length){
            return null;
        }
        if (index == 0){
            return removeFirst();
        }
        if (index == length - 1){
            return removeLast();
        }

        Node temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;

        return temp;
    }



    // MAIN Method
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.getHEAD();
        myDLL.getTAIL();
        myDLL.getLENGTH();
        myDLL.printList();

        System.out.println("Appending...");

        myDLL.append(2);
        myDLL.printList();

        System.out.println("Removing last element...");

        myDLL.removeLast();
        myDLL.printList();

        System.out.println("Prepending...");
        myDLL.prepend(2);
        myDLL.printList();

        System.out.println("Removing First Item...");
        myDLL.removeFirst();
        myDLL.printList();

        System.out.println("Getting node at the index 0");
        System.out.println(myDLL.get(0).value);

        System.out.println("Setting value of element at index 0 --> 5");
        myDLL.set(0, 5);
        myDLL.printList();

        System.out.println("Inserting a node 3 at index 0");
        myDLL.insert(0, 3);
        myDLL.printList();
        System.out.println("Inserting a node 4 at index 1");
        myDLL.insert(1, 4);
        myDLL.printList();

        System.out.println("Removing a node at index 1");
        myDLL.remove(1);
        myDLL.printList();

    }
}
