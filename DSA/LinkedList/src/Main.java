import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("Welcome to the Linked List Program!");
        System.out.println("***********************************");
        System.out.print("\nInitializing the Linked List...\nProvide value for the First Node\n--> ");
        LinkedList linkedList = new LinkedList(sc.nextInt());
        sc.nextLine();

        int choice = 0;

        while (choice != 7){
            System.out.println();
            System.out.println("***********************************");
            System.out.println("1. Append nodes to the Linked List");
            System.out.println("2. Print the Linked List");
            System.out.println("3. Get the Details of th Linked List");
            System.out.println("4. Insert Operations");
            System.out.println("5. Remove Operations");
            System.out.println("6. Reverse Operation of the Linked List");
            System.out.println("7: Exit the program");
            System.out.println("***********************************");

            System.out.println("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    int n;
                    System.out.println("Enter the number of nodes to append: ");
                    n = sc.nextInt();
                    sc.nextLine();

                    if (n <= 0) {
                        System.out.println("Please enter a valid number of nodes.");
                        break;
                    }

                    System.out.println("Enter the values for the nodes: ");
                    for (int i = 0; i < n; i++) {
                        linkedList.append(sc.nextInt());
                    }
                    sc.nextLine();
                    System.out.println("Linked List created...!!!");
                    break;

                case 2:
                    linkedList.printList();
                    break;

                case 3:
                    int choice2 = 0;
                    while (choice2 != 4) {
                        System.out.println("1. Get Head of the Linked List");
                        System.out.println("2. Get Tail of the Linked List");
                        System.out.println("3. Get Length of the Linked List");
                        System.out.println("4. Exit Linked List Details Section");

                        System.out.println("Enter the Choice: ");
                        choice2 = sc.nextInt();
                        sc.nextLine();

                        switch (choice2) {
                            case 1:
                                linkedList.getHead();
                                break;
                            case 2:
                                linkedList.getTail();
                                break;
                            case 3:
                                linkedList.getLength();
                                break;
                            default:
                                System.out.println("Enter valid choice...");
                                break;
                        }
                    }
                    break;

                case 4:
                    int choice3 = 0;
                    while (choice3 != 4) {
                        System.out.println("1. Insert Node at start position of the Linked List");
                        System.out.println("2. Insert Node at Last position of the Linked List");
                        System.out.println("3. Insert Node at any index of the Linked List");
                        System.out.println("4. Exit");

                        choice3 = sc.nextInt();
                        sc.nextLine();

                        switch (choice3){
                            case 1:
                                System.out.println("Enter value");
                                int value3 = sc.nextInt();
                                sc.nextLine();
                                linkedList.prepend(value3);
                                System.out.println("Inserted value at the begining...!");
                                break;
                            case 2:
                                System.out.println("Enter value");
                                int value4 = sc.nextInt();
                                sc.nextLine();
                                linkedList.append(value4);
                                System.out.println("Inserted value at the End...!");
                                break;
                            case 3:
                                System.out.println("Enter the index...where value to be inserted: ");
                                int index2 = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter the Value: ");
                                int value2 = sc.nextInt();
                                sc.nextLine();
                                linkedList.insert(index2, value2);
                                System.out.println("Inserted Successfully...!!!");
                                break;
                            case 4:
                                System.out.println("Exiting the Insert Operations Section...!");
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                    }
                    break;

                case 5:
                    int choice4 = 0;
                    while (choice4 != 4) {
                        System.out.println("1. Remove First Node from the Linked List");
                        System.out.println("2. Remove Last Node from the Linked List");
                        System.out.println("3. Remove Node at any index of the Linked List");
                        System.out.println("4. Exit");

                        choice4 = sc.nextInt();
                        sc.nextLine();

                        switch (choice4){
                            case 1:
                                linkedList.removeFirst();
                                linkedList.printList();
                                System.out.println("Removed First Node...");
                                break;
                            case 2:
                                linkedList.removeLast();
                                linkedList.printList();
                                System.out.println("Removed Last Node...");
                            case 3:
                                System.out.println("Enter the Index of Node to be Deleted: ");
                                int index3 = sc.nextInt();
                                sc.nextLine();
                                LinkedList.Node delete = linkedList.remove(index3);
                                System.out.println("Node of value " + delete.value + " Deleted Successfully...!!!");
                                break;
                            case 4:
                                System.out.println("Exiting the Remove Operations Section...!");
                                break;
                            default:
                                System.out.println("Enter valid input");
                                break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Reversing the Linked List...");
                    linkedList.reverse();
                    linkedList.printList();
                    System.out.println("Linked List reversed Successfully...!!!");
                    break;

                case 7:
                    System.out.println("Exiting Program. Goodbye!!!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;

            }
        }

    }

}