package LinkedList.FullImplementation;

public class Controllor {
    private static Node head = null;
    private static Node tail = null;
    private static int size = 0;

    public static Node getHead(){
        return head;
    }

    public static Node getTail(){
        return tail;
    }

    public static int getSize(){
        return size;
    }

    public static void setHead(Node head){
        Controllor.head = head;
    }

    public static void setTail(Node tail){
        Controllor.tail = tail;
    }

    public static void setSize(int size){
        Controllor.size = size;
    }
}
