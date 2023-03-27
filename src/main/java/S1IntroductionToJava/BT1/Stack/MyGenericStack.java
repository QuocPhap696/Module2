package S1IntroductionToJava.BT1.Stack;


import javax.crypto.spec.PSource;
import java.util.*;

public class MyGenericStack<T> {
   private LinkedList<T> stack;
   public MyGenericStack() {
      stack = new LinkedList();
   }
   //cd phương thức push()
   public void push(T element) {
      stack.addFirst(element);
   }
   //cd phương thức pop
   public T pop() {
      if (isEmpty()) {
         throw new EmptyStackException();
      }
      return stack.removeFirst();
   }

   //cd phương thức size()
   public int size() {
      return stack.size();
   }
   //cd phương thức isEmpty()
   public boolean isEmpty() {
      if (stack.size() == 0) {
         return true;
      } return false;
   }
   //cd lớp GenericStackClinet chứa 2 phương thức stackOfString() và stackOfIntegers
   private static void stackOfIsStrings() {
      MyGenericStack<String> stack = new MyGenericStack();
      stack.push("Five");
      stack.push("Four");
      stack.push("Three");
      stack.push("Two");
      stack.push("One");
      System.out.println("1.1 Size of stack after push operations :" + stack.size());
      System.out.printf("1.2. Pop elements from stack : ");
      while (!stack.isEmpty()) {
         System.out.printf("%s", stack.pop());
      }
      System.out.println("\n1.3. Size of stack after pop operations :" + stack.size());
   }
   private static void stackOfIntegers() {
      MyGenericStack<Integer> stack = new MyGenericStack();
      stack.push(5);
      stack.push(4);
      stack.push(3);
      stack.push(2);
      stack.push(1);
      System.out.println("2.1. Size of stack after push operations :"+ stack.size());
      System.out.println("2.2. Size of stack after push operations :"+ stack.size());
      while (!stack.isEmpty()) {
         System.out.printf("%d", stack.pop());
      }
      System.out.println("\n3.3 Size of stack after pop operations :" + stack.size());
   }
   //cd pthuc main
   public class GenericStackClient {
      public static void main(String[] args) {
         System.out.println("1. Stack of intergers");
         stackOfIntegers();
         System.out.println("\n2. Stack of String");
         stackOfIsStrings();
      }
   }
}

