import javax.xml.soap.Node;

public class LinkedList {
    private int numNodesSize = 0;
    private Node head;
    public LinkedList(Object data) {
        head = null;
        numNodesSize++;
    }

    private class Node{
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for(int i = 0 ; i < numNodesSize && temp.next != null ; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodesSize++;
    }
    public void addLast(Object data) {
        Node temp = head;
        for(int i = 0 ; i < numNodesSize - 1 && temp.next != null ; i++){
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodesSize++;
    }

    public Object get(int index) {
        Node temp = head;
        for(int i = 0 ; i < index && temp.next != null ; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public void printList() {
        Node temp = head;
        for(int i = 0 ; i < numNodesSize && temp.next != null ; i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}

