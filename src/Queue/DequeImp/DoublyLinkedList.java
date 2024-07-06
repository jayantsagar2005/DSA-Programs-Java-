package Queue.DequeImp;

import java.util.Scanner;

class Node {
    Node next;
    Node pre;
    int val;
    Node(int val){
        this. val = val;
    }
}
class Queue{
    Scanner sc = new Scanner(System.in);
    Node head= null;
    Node tail= null;
    int size;

    void addFront(){
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        Node temp = new Node(val);

        if(head == null){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            head.pre = temp;
            head = temp;
        }
        size++;
        System.out.println("Value added");
        System.out.println();
    }

    void addLast(){
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        Node temp = new Node(val);

        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            temp.pre = tail;
            tail = temp;
        }
        size++;
        System.out.println("Value added");
        System.out.println();
    }
    void removeFront(){
        if(size == 0){
            System.out.println("Underflow !!");
            System.out.println();
            return;
        }
        int val = head.val;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.pre = null;
        }
        size--;
        System.out.println("Remove value --> "+val);
        System.out.println();
    }

    void removeLast(){
        if(size == 0){
            System.out.println("Underflow !!");
            System.out.println();
            return;
        }
        int val = tail.val;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.pre;
            tail.next = null;
        }
        size--;
        System.out.println("Remove value --> "+val);
        System.out.println();
    }

    void peekFront(){
        if(size == 0){
            System.out.println("Underflow !!");
            System.out.println();
            return;
        }
        int val = head.val;
        System.out.println("Front value --> "+val);
        System.out.println();
    }

    void peekLast(){
        if(size == 0){
            System.out.println("Underflow !!");
            System.out.println();
            return;
        }
        int val = tail.val;
        System.out.println("Last value --> "+val);
        System.out.println();
    }

    void display(){
        if(size == 0){
            System.out.println("Underflow !!");
            System.out.println();
            return;
        }
        System.out.print("Values --> ");

        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    void size(){
        System.out.println("Size --> "+size);
        System.out.println();
    }

    void isEmpty(){
        if(size == 0){
            System.out.println("Queue is empty !!");
        }else{
            System.out.println("Queue is not empty !!");
        }
        System.out.println();
    }

}
public class DoublyLinkedList {


    public static void main(String[] args) {

        Queue q  = new Queue();

        System.out.println();
        System.out.println("<><><><><> Circular Queue Implementation Using LinkedList <><><><><>");
        System.out.println();
        int n;

        do{
            System.out.println("Press 1 into Add Value to Front");
            System.out.println("Press 2 into Add Value to Last");
            System.out.println("Press 3 into Remove Value to Front");
            System.out.println("Press 4 into Remove Value to Last");
            System.out.println("Press 5 into Get Front Value");
            System.out.println("Press 6 into Get Last Value");
            System.out.println("Press 7 into Display Queue");
            System.out.println("Press 8 into Size of Queue");
            System.out.println("Press 9 into Queue is Empty");
            System.out.println("Press 0 into Exit");
            System.out.println();
            System.out.print("Enter your choice : ");
            n = q.sc.nextInt();

            switch (n) {
                case 1 -> {
                    q.addFront();
                }
                case 2 -> {
                    q.addLast();
                }
                case 3 -> {
                    q.removeFront();
                }
                case 4 -> {
                    q.removeLast();
                }
                case 5 -> {
                    q.peekFront();
                }
                case 6 -> {
                    q.peekLast();
                }
                case 7 -> {
                    q.display();
                }
                case 8 -> {
                    q.size();
                }
                case 9 -> {
                    q.isEmpty();
                }
                case 0 -> {
                    System.out.println("Exit successfully...");
                }
                default -> {
                    System.out.println("Wrong choice, try again..");
                }
            }
        }while(n != 0);
    }
}
