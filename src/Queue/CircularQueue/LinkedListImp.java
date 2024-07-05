package Queue.CircularQueue;

import java.util.Scanner;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class QueueLinkedList{
    Scanner sc = new Scanner(System.in);
    Node head = null;
    Node tail = null;
    int size = 0;

    void add(){
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        Node temp = new Node(val);

        if(head == null){
            head = temp;
            tail = temp;
            tail.next = head;
        }else{
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
        size++;
        System.out.println("Value added");
        System.out.println();
    }
    void remove(){
        if(size == 0){
            System.out.println("Underflow !!");
            System.out.println();
            return;
        }
        int val = head.val;
        head = head.next;
        tail.next = head;
        size--;
        System.out.println("Remove value --> "+val);
        System.out.println();
    }
    void peek(){
        if(size == 0){
            System.out.println("Underflow !!");
            System.out.println();
            return;
        }
        int val = head.val;
        System.out.println("Front value --> "+val);
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
        while(temp != tail){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.print(tail.val+" ");
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
    void isFull(){
        System.out.println("Queue is not full !!");
        System.out.println();
    }

}

public class LinkedListImp {
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        System.out.println();
        System.out.println("<><><><><> Circular Queue Implementation Using LinkedList <><><><><>");
        System.out.println();
        int n;

        do{
            System.out.println("Press 1 into Add Value");
            System.out.println("Press 2 into Remove Value");
            System.out.println("Press 3 into Get Front Value");
            System.out.println("Press 4 into Display Queue");
            System.out.println("Press 5 into Size of Queue");
            System.out.println("Press 6 into Queue is Empty");
            System.out.println("Press 7 into Queue is Full");
            System.out.println("Press 0 into Exit");
            System.out.println();
            System.out.print("Enter your choice : ");
            n = q.sc.nextInt();

            switch (n) {
                case 1 -> {
                    q.add();
                }
                case 2 -> {
                    q.remove();
                }
                case 3 -> {
                    q.peek();
                }
                case 4 -> {
                    q.display();
                }
                case 5 -> {
                    q.size();
                }
                case 6 -> {
                    q.isEmpty();
                }
                case 7 -> {
                    q.isFull();
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
