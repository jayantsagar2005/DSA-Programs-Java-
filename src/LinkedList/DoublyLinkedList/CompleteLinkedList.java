package LinkedList.DoublyLinkedList;

import java.util.Scanner;

public class CompleteLinkedList {

    private final static Scanner sc = new Scanner(System.in);
    static Node head = null;
    static Node tail = null;
    static int size = 0;

    public static void setAnyValue() {
        System.out.println("<><><> SET ANY VALUE <><><>");
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        System.out.print("Enter the index : ");
        int idx = sc.nextInt();
        if (idx < 0 && idx >= size){
            System.out.println("Invalid index !");
            System.out.println();
            return;
        }
        if (size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        if(idx == 0){
            head.val = val;
        }else if (idx == size-1){
            tail.val = val;
        }else {
            int n = size - idx;
            if(n>=size/2){
                Node temp = head;
                for (int i=0; i<idx; i++){
                    temp = temp.next;
                }
                temp.val = val;
            }else{
                Node temp = tail;
                for (int i=size-1; i>idx; i--){
                    temp = temp.pre;
                }
                temp.val = val;
            }
        }
        System.out.println("Value update !");
        System.out.println();

    }
    public static void getAnyValue() {
        System.out.println("<><><> GET ANY VALUE <><><>");
        System.out.println();
        System.out.print("Enter the index : ");
        int idx = sc.nextInt();
        if (idx < 0 && idx >= size){
            System.out.println("Invalid index !");
            System.out.println();
            return;
        }
        if (size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        if(idx == 0){
            System.out.println("Value -->: "+head.val);
        }else if (idx == size-1){
            System.out.println("Value -->: "+tail.val);
        }else {
            int n = size - idx;
            if(n>=size/2){
                Node temp = head;
                for (int i=0; i<idx; i++){
                    temp = temp.next;
                }
                System.out.println("Value -->: "+temp.val);
            }else{
                Node temp = tail;
                for (int i=size-1; i>idx; i--){
                    temp = temp.pre;
                }
                System.out.println("Value -->: "+temp.val);
            }
        }
            System.out.println();
    }
    public static void sizeOfList() {
        System.out.println("<><><> SIZE OF LIST <><><>");
        System.out.println();
        System.out.println("Size of List -->: "+size);
        System.out.println();
    }
    public static void reverseDisplay() {
        System.out.println("<><><> REVERSE FULL LIST <><><>");
        System.out.println();
        if(size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        System.out.print("Reverse List -->: [");
        Node temp = tail;
        while(temp.pre != null){
            System.out.print(temp.val+", ");
            temp = temp.pre;
        }
        System.out.println(temp.val+"]");
        System.out.println();
    }

    public static void display() {
        System.out.println("<><><> FULL LIST <><><>");
        System.out.println();
        if(size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        System.out.print("List -->: [");
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.val+", ");
            temp = temp.next;
        }
        System.out.println(temp.val+"]");
        System.out.println();
    }
    public static void removeValueAnyIndex() {
        System.out.println("<><><> REMOVE VALUE ANY INDEX <><><>");
        System.out.println();
        System.out.print("Enter the index : ");
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
        if(idx == 0 && size == 1){
            val = head.val;
            head = null;
            tail = null;
        }else if(idx == 0){
            val = head.val;
            head = head.next;
            head.pre = null;
        } else if (idx == size-1) {
            val = tail.val;
            tail = tail.pre;
            tail.next = null;
        }else{
            Node temp = head;
            for (int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            val = temp.next.val;
            temp.next = temp.next.next;
            temp = temp.next;
            temp.pre = temp.pre.pre;
        }
        size--;
        System.out.println("Value remove --> "+val);
        System.out.println();
    }
    public static void removeValueTail() {
        System.out.println("<><><> REMOVE VALUE HEAD <><><>");
        System.out.println();
        if(size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        int val = tail.val;
        if (size == 1) {
            head = null;
            tail = null;
        } else{
            tail = tail.pre;
            tail.next = null;
        }
        size--;
        System.out.println("Value remove --> "+val);
        System.out.println();
    }
    public static void removeValueHead() {
        System.out.println("<><><> REMOVE VALUE HEAD <><><>");
        System.out.println();
        if(size == 0){
            System.out.println("Empty list !");
            System.out.println();
            return;
        }
        int val = head.val;
        if (size == 1) {
            head = null;
            tail = null;
        } else{
            head = head.next;
            head.pre = null;
        }
        size--;
        System.out.println("Value remove --> "+val);
        System.out.println();

    }
    public static void addValueAnyIndex() {
        System.out.println("<><><> ADD VALUE ANY INDEX <><><>");
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        System.out.print("Enter the index : ");
        int idx = sc.nextInt();
        if(idx < 0 || idx > size){
            System.out.println("Invalid index !");
            System.out.println();
            return;
        }

        Node temp = new Node(val);
        if(idx == 0 && size == 0){
            head = temp;
            tail = temp;
        } else if (idx == 0) {
            head.pre = temp;
            temp.next = head;
            head = temp;
        } else if (idx == size) {
            tail.next = temp;
            temp.pre = tail;
            tail = temp;
        }else{
            Node temp1 = head;
            for (int i=0; i<idx-1; i++){
                temp1 = temp1.next;
            }
            temp.next = temp1.next;
            temp1.next.pre = temp;
            temp1.next = temp;
            temp.pre = temp1;
        }
        size++;
        System.out.println("Value added !");
        System.out.println();
    }
    public static void addValueTail() {
        System.out.println("<><><> ADD VALUE TAIL <><><>");
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        Node temp = new Node(val);
        if(head == null && tail == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            temp.pre = tail;
            tail = temp;
        }
        size++;
        System.out.println("Value added !");
        System.out.println();
    }
    public static void addValueHead() {
        System.out.println("<><><> ADD VALUE HEAD <><><>");
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        Node temp = new Node(val);
        if(head == null && tail == null){
            head = temp;
            tail = temp;
        }else{
            assert head != null;
            head.pre = temp;
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
                reverseDisplay();
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
        System.out.println("<><><><><> Doubly LinkedList Implementation <><><><><>");
        System.out.println();
        menu();
    }
}
