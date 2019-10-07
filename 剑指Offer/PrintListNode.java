import java.util.*;

class Node {
    private int value;
    
    private Node next;

    public Node (int value) {
        this.value = value;
    }

    public void setValue (int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }
}

public class PrintListNode {
    public static void printListNode(Node head) {
        if (head == null) {
            System.out.println("");
        }
        Stack<Node> nodes = new Stack<Node>();
        Node cur = head;
        while (cur != null) {
            nodes.push(cur);
            cur = cur.getNext();
        }

        while (!nodes.isEmpty()) {
            Node now = nodes.pop();
            if (nodes.isEmpty()) {
                System.out.print(now.getValue());
            } else {
                System.out.print(now.getValue() + "->");
            }
        }
    }

    public static void printListNodeRecur(Node head) {
        if (head != null) {
            if (head.getNext() != null) {
                printListNodeRecur(head.getNext());
            }
            System.out.print(head.getValue());
        }

    }

    public Node FindKthToTail(Node head,int k) {
        if (head == null || k < 1){
            return null;
        }
        Node fast = head;
        Node slow = head;
        
        while (k > 0 && fast != null) {
            fast = fast.getNext();
            k--;
            if (fast == null) {
                return null;
            }
        }
        while (fast != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return slow;
    }

    public static void main(String[] args) {
        Node last = new Node(3);
        last.setNext(null);;
        Node two = new Node(5);
        two.setNext(last);
        Node one = new Node(1);
        one.setNext(two);

        printListNodeRecur(one);
    }
}