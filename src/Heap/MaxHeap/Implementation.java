package Heap.MaxHeap;

import java.util.Scanner;

class MaxHeap{
    Scanner sc = new Scanner(System.in);
    private int[] arr;
    private int size;
    MaxHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }

    // swapping function
    public void swapping(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    // add value function
    public void add() {
        System.out.println();
        if(size == arr.length){
            System.out.println("Heap capacity is full.");
            return;
        }
        System.out.print("Enter the value : ");
        int val = sc.nextInt();

        arr[size++] = val;
        upHeapify(size-1);
    }
    public void upHeapify(int n) {
        if (n == 0) return;
        int p = (n-1)/2;
        if(arr[p] < arr[n]){
            swapping(p, n);
            upHeapify(p);
        }
    }

    // remove value function
    public void remove(){
        System.out.println();
        if(size == 0){
            System.out.println("Heap is empty.");
            return;
        }
        int val = arr[0];
        swapping(0, size-1);
        size--;
        downHeapify(0);
        System.out.println("Remove value ----> "+val);
    }
    public void downHeapify(int n){
        if(n >= size-1) return;
        int l = (2*n+1);
        int r = (2*n+2);
        int mid = n;
        if(l < size && arr[l] > arr[mid]) mid = l;
        if(r < size && arr[r] > arr[mid]) mid = r;
        if(n == mid) return;
        swapping(n, mid);
        downHeapify(mid);
    }

    // get size function
    public void size(){
        System.out.println();
        System.out.println("The size of Heap ---> "+size);
    }

    // get top value heap
    public void peek(){
        System.out.println();
        if(size == 0){
            System.out.println("Heap is empty..");
            return;
        }
        System.out.println("Top value ---> "+arr[0]);
    }

    // heap is full or not
    public void isFull(){
        System.out.println();
        if(size == arr.length){
            System.out.println("Heap capacity is full.");
        }else {
            System.out.println("Heap is not full.");
        }
    }

    // heap is empty or not
    public void isEmpty(){
        System.out.println();
        if(size == 0){
            System.out.println("Heap is empty.");
        }else {
            System.out.println("Heap is not empty.");
        }
    }
}
public class Implementation {
    public static void main(String[] args) {
        MaxHeap max = new MaxHeap(10);

        int n;

        do {
            System.out.println();
            System.out.println("<><><><><> MIN HEAP IMPLEMENTATION <><><><><>");
            System.out.println();
            System.out.println("Press 1 into ADD VALUE");
            System.out.println("Press 2 into REMOVE VALUE");
            System.out.println("Press 3 into GET TOP VALUE");
            System.out.println("Press 4 into GET SIZE");
            System.out.println("Press 5 into HEAP FULL");
            System.out.println("Press 6 into HEAP EMPTY");
            System.out.println("Press 0 into EXIT");
            System.out.println();
            System.out.print("Enter your choice : ");
            n = max.sc.nextInt();

            if(n==1){
                max.add();
            } else if (n == 2) {
                max.remove();
            }else if (n == 3) {
                max.peek();
            }else if (n == 4) {
                max.size();
            }else if (n == 5) {
                max.isFull();
            }else if (n == 6) {
                max.isEmpty();
            }else if (n == 0) {
                System.out.println();
                System.out.println("Program successfully exit");
            }else{
                System.out.println();
                System.out.println("Wrong choice, try again.");
            }
        }while (n != 0);

    }
}
