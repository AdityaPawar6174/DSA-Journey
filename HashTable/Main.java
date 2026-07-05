package HashTable;

public class Main {

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.printTable();

        System.out.println("Setting key-values in Hash Table...");

        myHashTable.set("nails", 100);
        myHashTable.set("title", 50);
        myHashTable.set("lumber", 80);

        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();
    }
}
