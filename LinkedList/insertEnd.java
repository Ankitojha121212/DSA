class insertEnd {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        // check if the node is empty or not
        if (head == null) {
            head = new Node(newData);
            return;
        }

        // linkedlist is not empty
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // implementation of linkedlist
    public void showll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->>");
            temp = temp.next;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode1 = new Node(data);
        newNode1.next = head;
        head = newNode1;
    }

    public static void main(String[] args) {

        insertEnd in = new insertEnd();
        in.insertAtEnd(10);
        in.insertAtEnd(20);
        in.insertAtEnd(30);
        in.insertAtEnd(40);
        in.insertAtEnd(50);
        in.insertAtEnd(60);

        System.out.println("Before insertion.");
        in.showll();
        System.out.println();

        // inserting new node At end
        in.insertAtEnd(100);
        System.out.println("After insertion");
        in.showll();
        System.out.println("Insertion At beginning\n");

        in.insertAtBeginning(5);
        in.showll();

    }
}