package Queue.CircularQueue;

import java.util.Scanner;

class Queue{
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int front = -1;
    int rear = -1;
    int size = 0;

    void add(){
        System.out.println();
        if(size == arr.length){
            System.out.println("Queue is full !!");
            System.out.println();
            return;
        }
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        if(rear == arr.length-1 && size < arr.length){
            rear = -1;
        }
        if(front == -1 && rear == -1){
            arr[0] = val;
            front = 0;
            rear = 0;
        }else{
            rear++;
            arr[rear] = val;
        }
        size++;
        System.out.println("Value added");
        System.out.println();

    }
    void remove(){
        if (size == 0){
            System.out.println("Queue is empty !!");
            System.out.println();
            return;
        }
        int val = arr[front];
        if(front == arr.length-1 && size > 0){
            front = -1;
        }
        front++;


        size--;
        System.out.println("Remove Value --> "+val);
        System.out.println();
    }
    void peek(){
        if(size == 0){
            System.out.println("Queue is empty !!");
            System.out.println();
            return;
        }
        int val = arr[front];
        System.out.println("Front value --> "+val);
        System.out.println();
    }
    void display(){
        if (size == 0){
            System.out.println("Queue is empty !!");
            System.out.println();
            return;
        }
        System.out.print("Value --> ");
        if (front < rear){
            for (int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
        } else if (front > rear) {
            for (int i=front; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            for (int i=0; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
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
    void isFull(){
        if(size == arr.length){
            System.out.println("Queue is full !!");
        }else{
            System.out.println("Queue is not full !!");
        }
        System.out.println();
    }

}
public class ArrayImp {
    public static void main(String[] args) {
        Queue q = new Queue();
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
