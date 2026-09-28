class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    //insert at Beginning
    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    //insert at End
    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;    
    }

    //insert at Pos
    void insertAtPos(int index,int data){
        Node newNode = new Node(data);

        if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }

        newNode = temp.next;
        temp.next = newNode;
    }

    //delete at beginning
    void deleteAtBeginning (){
        if(head == null){
            return;
        }

        head = head.next;
    }

    void deleteAtEnd() {
        if(head == null){
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteByValue(int value) {

        if(head == null){
            return;
        }

        if(head.data == value){
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null){

            if(temp.next.data == value){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;

        }
    }

    void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void add(int v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}

public class SLL {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display();

        list.insertAtPos(2, 25);

        list.display();

        list.deleteAtBeginning();

        list.display();

        list.deleteAtEnd();

        list.display();

        list.deleteByValue(25);

        list.display();
    }
}