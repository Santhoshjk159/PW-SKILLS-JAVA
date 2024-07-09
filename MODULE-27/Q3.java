class Q3 {
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
    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    //delete duplicates
    public void Duplicate(){
        Node curr=head;
        while(curr!=null&&curr.next!=null){
            if (curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else{
            curr=curr.next;
               }
        }  
    } 

    
    public static void main(String[] args) {
        Q3 llist= new Q3();
        llist.insertAtEnd(2);
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(4);
        llist.insertAtEnd(12);
        llist.insertAtEnd(12);
        llist.printNodes();
        System.out.println();
        llist.Duplicate();
        llist.printNodes();


    }
}