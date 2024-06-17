package LinkedList.SinglyCircularLL;

import java.util.Scanner;

class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}

public class Implementation {
    public static Scanner sc = new Scanner(System.in);
    static Node head = null;
    static Node tail = null;
    static int size = 0;

    public static void reverseDisplay(Node temp) {
        if (temp == tail){
            System.out.println();
            System.out.println("<><><> REVERSE DISPLAY LIST VALUE <><><>");
            System.out.println();
            System.out.print("Reverse List --> [");
            System.out.print(temp.val+", ");
            return;
        }
        reverseDisplay(temp.next);
        System.out.print(temp.val+", ");
    }
    public static void display() {
        System.out.println();
        System.out.println("<><><> DISPLAY LIST VALUE <><><>");
        System.out.println();
        if(size == 0){
            System.out.println("Empty List !");
            System.out.println();
            return;
        }
        System.out.print("List --> [");
        Node temp = head;
        while(temp != tail){
            System.out.print(temp.val+", ");
            temp = temp.next;
        }
        System.out.println(tail.val+"]");
        System.out.println();
    }
    public static void setAnyValue() {
        System.out.println();
        System.out.println("<><><> SET ANY VALUE <><><>");
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        System.out.print("Enter the index : ");
        int idx = sc.nextInt();
        if (size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        if(idx < 0 && idx >= size){
            System.out.println("Invalid index !");
            System.out.println();
            return;
        }
        if (idx == 0){
            head.val = val;
        } else if (idx == size-1) {
            tail.val = val;
        }else{
            Node t = head;
            for (int i=0; i<idx; i++){
                t = t.next;
            }
            t.val = val;
        }
        System.out.println("Value updated !");
        System.out.println();
    }
    public static void getAnyValue() {
        System.out.println();
        System.out.println("<><><> GET ANY VALUE <><><>");
        System.out.println();
        System.out.print("Enter the index : ");
        int idx = sc.nextInt();
        if (size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        if(idx < 0 && idx >= size){
            System.out.println("Invalid index !");
            System.out.println();
            return;
        }
        if (idx == 0){
            System.out.println("Value -->: "+head.val);
        } else if (idx == size-1) {
            System.out.println("Value -->: "+tail.val);
        }else{
            Node t = head;
            for (int i=0; i<idx; i++){
                t = t.next;
            }
            System.out.println("Value -->: "+t.val);
        }
        System.out.println();
    }
    public static void sizeOfList() {
        System.out.println();
        System.out.println("<><><> Display Value List <><><>");
        System.out.println();
        System.out.println("List Size --> "+size);
        System.out.println();
    }
    public static void removeValueAnyIndex() {
        System.out.println();
        System.out.println("<><><> REMOVE VALUE ANY INDEX <><><>");
        System.out.println();
        System.out.print("Enter the index :");
        int idx = sc.nextInt();
        if(size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        if(idx < 0 || idx >= size){
            System.out.println("Invalid index !");
            System.out.println();
            return;
        }
        int val = 0;
        if (idx == 0 && size == 1){
            val = head.val;
            head = null;
            tail = null;
        } else if (idx == 0) {
            val = head.val;
            tail.next = head.next;
            head.next = null;
            head = tail.next;
        } else if (idx == size-1) {
            val = tail.val;
            Node t = head;
            while (t.next != tail){
                t = t.next;
            }
            tail.next = null;
            t.next = head;
            tail = t;
        }else{
            Node t = head;
            for (int i=0; i<idx-1; i++){
                t = t.next;
            }
            val = t.next.val;
            t.next = t.next.next;
        }
        size--;
        System.out.println("Value removed : "+val);
        System.out.println();
    }
    public static void removeValueTail() {
        System.out.println();
        System.out.println("<><><> REMOVE VALUE TAIL <><><>");
        System.out.println();

        if(size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        int val = tail.val;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            Node t = head;
            while (t.next != tail){
                t = t.next;
            }
            tail.next = null;
            t.next = head;
            tail = t;
        }
        size--;
        System.out.println("Value removed : "+val);
        System.out.println();
    }
    public static void removeValueHead() {
        System.out.println();
        System.out.println("<><><> REMOVE VALUE HEAD <><><>");
        System.out.println();

        if(size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        int val = head.val;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            tail.next = head.next;
            head.next = null;
            head = tail.next;
        }
        size--;
        System.out.println("Value removed : "+val);
        System.out.println();
    }
    public static void addValueAnyIndex() {
        System.out.println();
        System.out.println("<><><> ADD VALUE ANY INDEX <><><>");
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        System.out.print("Enter the index :");
        int idx = sc.nextInt();
        Node temp = new Node(val);
        if(idx < 0 || idx > size){
            System.out.println("Invalid index !");
            System.out.println();
            return;
        }
        if(idx == 0 && size == 0){
            head = temp;
            tail = temp;
            tail.next = head;
        } else if (idx == 0) {
            tail.next = temp;
            temp.next = head;
            head = temp;
        }else if (idx == size){
            tail.next = temp;
            temp.next = head;
            tail = temp;
        }else{
            Node t = head;
            for (int i=0; i<idx-1; i++){
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }
        size++;
        System.out.println("Value added !");
        System.out.println();
    }
    public static void addValueTail() {
        System.out.println();
        System.out.println("<><><> ADD VALUE TAIL <><><>");
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        Node temp = new Node(val);
        if(size == 0){
            head = temp;
            tail = temp;
            tail.next = head;
        }else{
            tail.next = temp;
            temp.next = head;
            tail = temp;
        }
        size++;
        System.out.println("Value added !");
        System.out.println();
    }
    public static void addValueHead() {
        System.out.println();
        System.out.println("<><><> ADD VALUE HEAD <><><>");
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        Node temp = new Node(val);
        if(size == 0){
            head = temp;
            tail = temp;
            tail.next = head;
        }else{
            tail.next = temp;
            temp.next = head;
            head = temp;
        }
        size++;
        System.out.println("Value added !");
        System.out.println();
    }
    public static void menu() {
        int n;
        do {
            System.out.println("<><><> MENU LINKED LIST <><><>");
            System.out.println();
            System.out.println("Press 1 into Add Value Head");
            System.out.println("Press 2 into Add Value Tail");
            System.out.println("Press 3 into Add Value Any Index");
            System.out.println("Press 4 into Remove Value Head");
            System.out.println("Press 5 into Remove Value Tail");
            System.out.println("Press 6 into Remove Value Any Index");
            System.out.println("Press 7 into Display List");
            System.out.println("Press 8 into Reverse Display List");
            System.out.println("Press 9 into Size Of List");
            System.out.println("Press 10 into Get Of Any Value");
            System.out.println("Press 11 into Set Of Any Value");
            System.out.println("Press 0 into Exit");
            System.out.println();
            System.out.print("Enter your choice : ");
            n = sc.nextInt();
            System.out.println();
            if(n == 1){
                addValueHead();
            }else if (n == 2){
                addValueTail();
            }else if(n == 3){
                addValueAnyIndex();
            } else if (n == 4) {
                removeValueHead();
            } else if (n == 5) {
                removeValueTail();
            } else if (n == 6) {
                removeValueAnyIndex();
            } else if (n == 7) {
                display();
            } else if (n == 8) {
                reverseDisplay(head.next);
                System.out.print(head.val+"]\n");
                System.out.println();
            } else if (n == 9) {
                sizeOfList();
            }else if (n == 10){
                getAnyValue();
            } else if (n == 11) {
                setAnyValue();
            } else if(n == 0){
                System.out.println("Successfully exit.. !");
                System.out.println();
            }else{
                System.out.println("Invalid choice, try again !");
                System.out.println();
            }

        }while (n != 0);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("<><><><><> Singly Circular LinkedList <><><><><>");
        System.out.println();
        menu();
    }
}
