package LinkedList.FullImplementation;

public class Display {
    public Display(Node head){
        System.out.println("<><><> Display Value List <><><>");
        System.out.println();
        if(Controllor.getSize() == 0){
            System.out.println("Empty List !");
            return;
        }
        Node temp = head;
        System.out.print("List --> [");
        while(temp != null){
            if(temp.next == null){
                System.out.print(temp.value+"]");
                break;
            }else{
                System.out.print(temp.value+", ");
                temp = temp.next;
            }
        }

        System.out.println();
    }
}
