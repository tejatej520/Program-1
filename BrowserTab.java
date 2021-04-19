import java.util.*;
public class BrowserTab {
    Node head; 
    class Node {
        String data;
        Node prev;
        Node next;
        Node(String d) { data = d; }
    }
 
    public void push(int new_data)
    {
        
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        new_Node.prev = null;
        if (head != null)
            head.prev = new_Node;
        head = new_Node;
    }
 
    
    public void visitURL(String new_data)
    {
 
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
 
        Node new_node = new Node(new_data);
 
       
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;
        if (new_node.next != null)
            new_node.next.prev = new_node;
    }
 
    void append(String new_data)
    {

        Node new_node = new Node(new_data);
 
        Node last = head;
        new_node.next = null;
 
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
 
        while (last.next != null)
            last = last.next;
 
        last.next = new_node;
 
        
        new_node.prev = last;
    }
 
    
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
 
    public static void main(String[] args)
    {
        
        BrowserTab dll = new BrowserTab();
        dll.append("https://websitebuilders.com");
        dll.append("https://www.facebook.com/Learn-the-Net-330002341216/");
        dll.append(" ftp://aeneas.mit.edu/");
        dll.append(" https://en.wikipedia.org/wiki/Internet#Terminology.");
        System.out.println("Enter which url you want to visit");
        Scanner s=new Scanner(System.in);//give the number of the url you want to visit
        String n=Scanner.nextLine();
        dll.visitURL("n");
        dll.printlist(dll.head);  
        
    }
}