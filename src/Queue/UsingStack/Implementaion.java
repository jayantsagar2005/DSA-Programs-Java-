package Queue.UsingStack;

import java.util.Scanner;
import java.util.Stack;

class Queue{
    Scanner sc = new Scanner(System.in);
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    int size = 0;

    void add(){
        System.out.println();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        if(st1.isEmpty()){
            st1.push(val);
        }else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st1.push(val);
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        size++;
        System.out.println("Value added");
        System.out.println();
    }
    void remove(){
        if(st1.isEmpty()){
            System.out.println("Underflow !!");
            System.out.println();
            return;
        }
        int val = st1.pop();
        size--;
        System.out.println("Remove value --> "+val);
        System.out.println();
    }
    void peek(){
        if(st1.isEmpty()){
            System.out.println("Underflow !!");
            System.out.println();
            return;
        }
        int val = st1.peek();
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
        while(!st1.isEmpty()){
            int val = st1.pop();
            System.out.print(val+" ");
            st2.push(val);
        }
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        System.out.println("\n");
    }
    void size(){
        System.out.println("Size --> "+size);
        System.out.println();
    }
    void isEmpty(){
        if(st1.isEmpty()){
            System.out.println("Queue is empty !!");
        }else{
            System.out.println("Queue is not empty !!");
        }
        System.out.println();
    }


}

public class Implementaion {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println();
        System.out.println("Queue Implementation Using Array");
        System.out.println();
        int n;

        do{
            System.out.println("Press 1 into Add Value");
            System.out.println("Press 2 into Remove Value");
            System.out.println("Press 3 into Get Front Value");
            System.out.println("Press 4 into Display Queue");
            System.out.println("Press 5 into Size of Queue");
            System.out.println("Press 6 into Queue is Empty");
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
                case 0 -> {
                    System.out.println("Exit successfully...");
                }
                default -> {
                    System.out.println("Wrong choice, try again..");
                    System.out.println();
                }
            }
        }while(n != 0);
    }
}
