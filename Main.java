//Author : Pranitha Bojja - PXB210063

//Defining class Node

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//Defining class Linked list and its functions
class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public void traverselist() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    //Bubble sort function with linking and de linking nodes

    public void bubbleSort() {
        boolean swap;
        do {
            swap = false;
            Node curr = head;
            Node prev = null;
            while (curr != null && curr.next != null) {
                if (curr.data > curr.next.data) {
                    Node next = curr.next;
                    curr.next = next.next;
                    next.next = curr;
                    if (prev == null) {
                        head = next;
                    } else {
                        prev.next = next;
                    }
                    prev = next;
                    swap = true;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
        } while (swap);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList LL_Num = new LinkedList();
        LL_Num.add(10);
        LL_Num.add(3);
        LL_Num.add(8);
        LL_Num.add(140);
        LL_Num.add(7);
        LL_Num.add(1);
        LL_Num.add(11);
        LL_Num.add(-2);
        LL_Num.add(9);
        LL_Num.add(2);
        LL_Num.add(12);
        LL_Num.add(15);
        LL_Num.add(4000);
        LL_Num.add(6);
        LL_Num.add(13);

        System.out.println("Linked list before sorting:");
        LL_Num.traverselist();

        LL_Num.bubbleSort();

        System.out.println("Linked list after sorting:");
        LL_Num.traverselist();
    }
}
