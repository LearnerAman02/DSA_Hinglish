public class StackLL {
  // 2--> Implementing stack using linked list
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Stack {
    public static Node head = null;

    // isEmpty
    boolean isEmpty() {
      return head == null;
    }

    // push operation
    void push(int data) {
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
    }

    // pop operation
    int pop() {
      if (isEmpty())
        return -1;
      Node temp = head;
      int data = head.data;
      head = head.next;
      temp.next = null;
      return data;
    }

    // peek operation
    int peek() {
      if (isEmpty())
        return -1;
      return head.data;
    }
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(3);
    s.push(5);
    s.push(7);

    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
    System.out.println(s.pop());
    System.out.println(s.peek());
  }
}
