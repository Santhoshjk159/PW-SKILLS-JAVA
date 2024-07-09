class Q4 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insert the node at the very end in the linked list
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        // LinkedList is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // LinkedList is not empty
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display all the nodes after the insertion
    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Reverse the linked list
    public Node reverseLL() {
        Node curr = head;
        Node prev = null;
        Node nextItr;
        while (curr != null) {
            nextItr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextItr;
        }
        return prev;
    }

    // Check if the linked list is a palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Reverse the linked list
        Node reversedHead = reverseLL();

        // Compare the original linked list with the reversed linked list
        Node original = head;
        Node reversed = reversedHead;
        while (original != null && reversed != null) {
            if (original.data != reversed.data) {
                return false;
            }
            original = original.next;
            reversed = reversed.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Q4 llist = new Q4();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);

        llist.printNodes();

        if (llist.isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
