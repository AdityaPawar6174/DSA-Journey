package HashTable;

public class HashTable {
    int size = 7;
    Node[] dataMap;

    // Node in HashTable
    public class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public HashTable(){
        dataMap = new Node[size];
    }

    // HashMethod Table
    public int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i=0; i<keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    // SET Method
    public void set(String key, int value){
         int index = hash(key);
         Node newNode = new Node(key, value);

         if (dataMap[index] == null){
             dataMap[index] = newNode;
         } else {
             Node temp = dataMap[index];
             while (temp.next != null){
                 temp = temp.next;
             }
             temp.next = newNode;
         }
    }

    // PrintTable()
    public void printTable(){
        for (int i=0; i<dataMap.length; i++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null){
                System.out.println("   {" + temp.key + ":" + temp.value + "}");
                temp = temp.next;
            }
        }
    }

}
