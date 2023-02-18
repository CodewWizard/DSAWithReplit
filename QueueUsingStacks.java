import java.util.*;

public class QueueUsingStacks {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    System.out.println(stack.pop());
  }

  class Main {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public Main() {
      first = new Stack<>();
      second = new Stack<>();
    }

    public void add(int item) {
      first.push(item);
    }

    public int remove() throws Exception {
      while (!first.isEmpty()) {
        second.push(first.pop());
      }
      int removed = second.pop();

      while (!second.isEmpty()) {
        first.push(second.pop());
      }
      return removed;
    }

    public boolean isEmpty() {
      return first.isEmpty();
    }

    public int peek() throws Exception {
      while (!first.isEmpty()) {
        second.push(first.pop());
      }
      int peek_val = second.peek();

      while (!second.isEmpty()) {
        first.push(second.pop());
      }
      return peek_val;
    }

  }

}