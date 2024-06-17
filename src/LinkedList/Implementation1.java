package LinkedList;

import java.util.Scanner;

class Operation{
    Scanner sc = new Scanner(System.in);
    Node head = null;
    Node tail = null;
    int size = 0;

    void addValueTail(){
        System.out.println("<><><><><> Add Value Last <><><><><>");
        System.out.print("Enter the value : ");
        int val = sc.nextInt();

        Node temp =new Node(val);

        if(head == null && tail == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp.next;
        }
        System.out.println("Value add !");
        size++;
    }

    void display(){
        System.out.println("<><><><><> Display List Value <><><><><>");
        Node temp = head;
        System.out.print("List Value : ");
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size(){
        System.out.println("<><><><><> Size List Value <><><><><>");
        System.out.println("Size is : "+size);
    }

    void addValueHead(){
        System.out.println("<><><><><> Add Value Head <><><><><>");
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        Node temp = new Node(val);
        if(head == null && tail == null){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
        System.out.println("Value add !");
    }

    void addValueAnyIndex(){
        System.out.println("<><><><><> add Value Any Index <><><><><>");
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        System.out.print("Enter the index value : ");
        int idx = sc.nextInt();

        Node temp = new Node(val);

        if(idx < 0 || idx > size){
            System.out.println("Invalid index !");
            return;
        }
        if(idx == 0 && size == 0){
            head = temp;
            tail = temp;
            size++;
            System.out.println("Value add !");
            return;
        }
        if(idx == 0){
            temp.next = head;
            head = temp;
            size++;
            System.out.println("Value add !");
            return;
        }
        if(idx == size){
            tail.next = temp;
            tail = tail.next;
            size++;
            System.out.println("Value add !");
            return;
        }
        Node t = head;
        for(int i=0; i<idx-1; i++){
            t = t.next;
        }
        temp.next = t.next;
        t.next = temp;
        size++;
        System.out.println("Value add !");
    }

    void getAnyValue(){
        System.out.println("<><><><><> Get Any Index Value <><><><><>");
        System.out.print("Enter the index : ");
        int idx = sc.nextInt();

        if(size == 0 || idx < 0 || idx >= size){
            System.out.println("Invalid index !");
            return;
        }
        if(idx == 0){
            System.out.println("Value is : "+head.value);
            return;
        }
        Node temp = head;
        for (int i=0; i<idx; i++){
            temp = temp.next;
        }
        System.out.println("Value is : "+temp.value);
    }

    void setAnyValue(){
        System.out.println("<><><><><> Set Any Index Value <><><><><>");
        System.out.print("Enter the new value : ");
        int val = sc.nextInt();
        System.out.print("Enter the index : ");
        int idx = sc.nextInt();

        if(size == 0 || idx < 0 || idx >= size){
            System.out.println("Invalid index !");
            return;
        }
        if(idx == 0){
            head.value = val;
            System.out.println("Value update !");
            return;
        }
        Node temp = head;
        for (int i=0; i<idx; i++){
            temp = temp.next;
        }
        temp.value = val;
        System.out.println("Value update !");
    }

    void deleteAnyValue(){
        System.out.println("<><><><><> Delete Any Index Value <><><><><>");
        System.out.println("Enter the index : ");
        int idx = sc.nextInt();

        if(size == 0 || idx < 0 || idx >= size){
            System.out.println("Invalid index !");
            return;
        }
        if(idx == 0){
            head = head.next;
            System.out.println("Value delete !");
            size--;
            return;
        }
        Node temp = head;
        if(idx == size-1){
            for(int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
            System.out.println("Value delete !");
            return;
        }
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        System.out.println("Value delete !");
    }

}

public class Implementation1 {

    public static void main(String[] args) {

        Operation operation =new Operation();

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
            n = operation.sc.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.println();
                    operation.addValueTail();
                }
                case 2 -> {
                    System.out.println();
                    operation.display();
                }
                case 3 -> {
                    System.out.println();
                    operation.size();
                }
                case 4 -> {
                    System.out.println();
                    operation.addValueHead();
                }
                case 5 -> {
                    System.out.println();
                    operation.addValueAnyIndex();
                }
                case 6 -> {
                    System.out.println();
                    operation.getAnyValue();
                }
                case 7 -> {
                    System.out.println();
                    operation.setAnyValue();
                }
                case 8 -> {
                    System.out.println();
                    operation.deleteAnyValue();
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
