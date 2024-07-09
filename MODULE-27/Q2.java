class Q2 {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // insert the node at the very end in the linked list
    public void insertAtEnd(int newData){
        // intialize the newNode with the newData entered by the user
        Node newNode = new Node(newData);

        // LinkedList is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // LinkedList is not empty
        newNode.next = null;
        // traversing the linkedlist at the end of the node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }
     // insert the node at the very beginning in the linked list
     public void InsertAtBeg(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
     }
     //insert after any node
     public void InsertAfter(Node prev,int newData){
        if (prev==null){
            System.out.println("Previous node cannot contain null value");
            return;
        }
        Node newNode=new Node(newData);
        newNode.next=prev.next;
        prev.next=newNode;
     }

    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;

        }
    }

    
    public static void main(String[] args) {
        Q2 llist= new Q2();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        llist.insertAtEnd(9);
        llist.printNodes();
        System.out.println();
        llist.InsertAfter(llist.head.next,6);
        llist.printNodes();

    }
}