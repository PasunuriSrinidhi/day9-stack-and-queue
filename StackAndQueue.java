class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}

class Stack {
    LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }

    public void push(int data) {
        linkedList.add(data);
    }

    public void display() {
        Node current = linkedList.head;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class StackAndQueue {
    public static void main(String[] args) {
        // Create a stack and push elements
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);


        // Display the stack
        stack.display();
    }
}