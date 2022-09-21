import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Dynamic {

    public static void main(String[] args) {
        int[] simpleArray = new int[10];
        simpleArray[0] = 1;
        simpleArray[1] = 2;

        for (int i = 0; i < simpleArray.length; i++) {
            System.out.print(simpleArray[i] + " ");
        }

        System.out.println();

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.remove(1); //index

        System.out.println(myList);
        System.out.println(myList.get(1));
        System.out.println(myList.contains(20));

        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);

        System.out.println(mySet);

        ArrayDeque<String> myDeque = new ArrayDeque<>();
        myDeque.add("apple");
        myDeque.add("orange");
        myDeque.add("peer");

        System.out.println(myDeque);
        System.out.println(myDeque.poll());
        System.out.println(myDeque.poll());
        System.out.println(myDeque.poll());
        System.out.println(myDeque);

        Stack<Double> myStack = new Stack<>();
        myStack.push(0.1);
        myStack.push(0.2);
        myStack.push(0.11);

        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.empty());

        myStack.remove(0.1);
        System.out.println(myStack + "123");
    }
}
