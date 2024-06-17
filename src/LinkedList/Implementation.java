package LinkedList;

import java.util.Scanner;

class SLL{
    protected Scanner sc = new Scanner(System.in);
    private Node head;
    private Node tail;
    private int size;

    void deleteAnyValue(){
        System.out.println("<><><><><> Delete Any Index Value <><><><><>");
        System.out.print("Enter the index value : ");
        int idx = sc.nextInt();

        Node temp = head;

        if(size == 0 || idx >= size ||  idx < 0){
            System.out.println("Invalid Index !");
            return;
        }
        if (size == 1){
            head = head.next;
            tail = tail.next;
            System.out.println("Value delete !");
            size--;
            return;
        }
        if(idx == 0){
            head = head.next;
            System.out.println("Value delete !");
            size--;
            return;
        }
        if (size == idx + 1){
            for (int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            System.out.println("Value delete !");
            size--;
            return;
        }

        for (int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        System.out.println("Value delete !");
        size--;
    }

    void setAnyValue(){
        System.out.println("<><><><><> Set Any Index Value <><><><><>");
        System.out.print("Enter the new value : ");
        int val = sc.nextInt();
        System.out.print("Enter the index value : ");
        int idx = sc.nextInt();

        if(size <= idx || size == 0 || idx < 0){
            System.out.println("Invalid Index !");
            System.out.println();
            return;
        }
        Node temp = head;
        for (int i=0; i<idx; i++){
            temp = temp.next;
        }
        temp.value = val;
        System.out.println("Value update !");
    }

    void getAnyValue(){
        System.out.println("<><><><><> Get Any Index Value <><><><><>");
        System.out.print("Enter the index value : ");
        int idx = sc.nextInt();

        if(size <= idx || size == 0 || idx < 0){
            System.out.println("Invalid Index !");
            System.out.println();
            return;
        }
        Node temp = head;
        for (int i=0; i<idx; i++){
            temp = temp.next;
        }
        System.out.println("Value is : "+temp.value);

    }

    void addValueAnyIndex(){
        System.out.println("<><><><><> Add Value Any Index <><><><><>");
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        System.out.print("Enter the index value : ");
        int idx = sc.nextInt();

        Node temp = new Node(val);

        if (idx == 0){
            if (head == null && tail == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
            return;
        }
        if (idx == size){
            if (head == null && tail == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = tail.next;
            }
            size++;
            return;
        }


        if(idx > size){
            System.out.println("Overflow Index !");
            System.out.println();
            return;
        }else{
            Node t = head;
            for(int i=0; i<idx-1; i++){
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }
        size++;
    }

    void addValueStart(){
        System.out.println("<><><><><> Add Value Start <><><><><>");
        System.out.print("Enter the value : ");
        int val = sc.nextInt();

        Node temp = new Node(val);

        if (head == null && tail == null){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void display(){
        System.out.println("<><><><><> Display List <><><><><>");
        Node temp = head;
        System.out.print("List : [");
        while(temp != null){
            System.out.print(temp.value+", ");
            temp = temp.next;
        }
        System.out.print("]");
        System.out.println();
    }

    void size(){
        System.out.println("<><><><><> Size List <><><><><>");
        System.out.println("The linked list size is : "+size);
    }

    void addValueLast(){
        System.out.println("<><><><><> Add Value Last <><><><><>");
        System.out.print("Enter the value : ");
        int val = sc.nextInt();

        Node temp = new Node(val);

        if (head == null && tail == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = tail.next;
        }
        size++;
    }
}

public class Implementation {
    public static void main(String[] args) {

        SLL sll = new SLL();

        System.out.println();
        System.out.println(" <><><><><> Linked List Implementation <><><><><>");

        int n;

        do {
            System.out.println();
            System.out.println("Press 1 into Add Value Last");
            System.out.println("Press 2 into Display List");
            System.out.println("Press 3 into Size List");
            System.out.println("Press 4 into Add Value Start");
            System.out.println("Press 5 into Add Value Any Index");
            System.out.println("Press 6 into Get Any Index Value");
            System.out.println("Press 7 into Set Any Index Value");
            System.out.println("Press 8 into Delete Value Any Index");
            System.out.println("Press 0 into Exit");
            System.out.print("Enter the choice : ");
            n = sll.sc.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.println();
                    sll.addValueLast();
                }
                case 2 -> {
                    System.out.println();
                    sll.display();
                }
                case 3 -> {
                    System.out.println();
                    sll.size();
                }
                case 4 -> {
                    System.out.println();
                    sll.addValueStart();
                }
                case 5 -> {
                    System.out.println();
                    sll.addValueAnyIndex();
                }
                case 6 -> {
                    System.out.println();
                    sll.getAnyValue();
                }
                case 7 -> {
                    System.out.println();
                    sll.setAnyValue();
                }
                case 8 -> {
                    System.out.println();
                    sll.deleteAnyValue();
                }
                case 0 -> {
                    System.out.println();
                    System.out.println("Exit successfully !");
                }
                default -> {
                    System.out.println();
                    System.out.println("Wrong choice, try again !");
                }
            }
        }while (n != 0);

    }

}

