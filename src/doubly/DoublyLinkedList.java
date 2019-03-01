package doubly;

class Node{
    int data;
    Node next;
    Node previous;
}

public class DoublyLinkedList{
    Node head;
    int size;

    public static void main(String[] args) {
        DoublyLinkedList obj=new DoublyLinkedList();
        for (int i = 0; i < 5; i++) {
            Node node=new Node();
            node.data=(i+1)*1000;
            obj.insert(node);
        }
        obj.display();

    }

    void display() {
        System.out.println("Doubly linkedlist");
        Node temp = head;
        System.out.print("null<----->");
        while (temp != null) {
            System.out.print(temp.data + "<--->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void delete(){
        if(head==null){
            System.out.println("empty list");
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next ;
            }
            System.out.println("deleting node"+ temp.data+ "from last");
            temp=temp.previous;
            temp.next=null;
        }
    }

    boolean search(Node node){
        boolean response=false;
        Node temp=head;
        while(temp!=null){
            if(temp.data==node.data){
                response=true;
                break;
            }
            temp=temp.next;
        }

        return response;
    }

    //insert
    void insert(Node node){
        System.out.println("inserting node" + node.data + "at last");
        if(head==null){
            head=node;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            node.previous=temp;
            temp.next=node;
        }
    }
}
