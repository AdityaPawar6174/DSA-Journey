package Trees;

public class BinarySearchTree {

    Node root;

    // We will not use this constructor for Trees
//    public BinarySearchTree(int value){
//        Node newNode = new Node(value);
//        root = newNode;
//    }

    public class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }


    // INSERT Method
    public boolean insert(int value){
        // Steps:
        // 1. Create Node
        Node newNode = new Node(value);

        // 2. If Root == null,... then Root == newNode
        if (root == null){
            root = newNode;
            return true;
        }

        // 3. create temp
        Node temp = root;

        // 4. While Loop
        while (true){
            // 5. if newNode == temp —> return false
            if (newNode.value == temp.value) return false;

            // 6. if ( value << newNode value) then insert ← left || if (value >> newNode value) then insert → right
            if (newNode.value < temp.value){

                // 7. If null ... insert newNode ... else move next
                if (temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // CONTAINS Method
    public boolean contains(int value){
        // STEPS
        // 1. IF Root == null (ie. tree is empty) --> return false
        // if(root == null) return false;
        // 2. creating new variable Temp  --> not needed as it will eventually return false
        Node temp = root;

        // 3. while temp != null (ie. if Tree is not empty)
        while (temp != null){
            // 4. condition 1 : IF value << than Temp.Value —> move temp to left
            if (value < temp.value){
                temp = temp.left;
            // 5. condition 2 : IF value >> than temp —> move temp to right
            } else if (temp.value > value){
                temp = temp.right;
            // 6.condition 3 : Else return true —> we got the value
            } else {
                return true;
            }
        }
        // 7. Else false —> couldn’t find the node with the Value
        return false;
    }


    // Printing BST
    public void traverseTree(){
        System.out.println("\nBinary Search Tree");
        // printBST(root);
        printBST(root, "", true);
        // System.out.println();
    }

    public void printBST(Node node, String prefix, boolean isLeft){
    // public void printBST(Node node)
        if (node != null){
            // printBST(node.left);
            // System.out.println(node.value + " ");
            // printBST(node.right);
            printBST(node.right, prefix+(isLeft? "|   " : "    "), false);
            System.out.println(prefix + (isLeft ? ":-- " : ";-- ") + node.value);
            printBST(node.left, prefix + (isLeft ? "    " : "|   "), true);
        }
    }


}
