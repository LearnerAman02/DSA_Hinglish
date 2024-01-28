import java.util.ArrayList;;
// Recursion ke time jo stack banta hai it is called as IMPLICIT STACK(stack created by computer itself for the program execution)
// Hum jo stack yaha bana rahe hai manually it is known as EXPLICIT STACK
// Stack data structure ko we can implement using array,ArrayList,LinkedList

// 1--> implementing stack using ArrayList
public class StackB {
  static class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    // function for checking stack is empty or not
    boolean isEmpty() {
      return list.size() == 0;
    }

    // push operation
    void push(int data) {
      list.add(data);
    }

    // pop operation
    int pop() {
      // first checking ki kahi stack empty toh nhi hai
      if (list.size() == 0) {
        return -1;
      }
      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    // peek operation
    int peek() {
      // first checking ki kahi stack empty toh nhi hai
      if (list.size() == 0) {
        return -1;
      }
      int top = list.get(list.size() - 1);
      return top;
    }
  }

  public static void main(String[] args) {
    // created obkect of the stack class
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    // now printing the element in stack and deleting the top most elements
    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }
}
