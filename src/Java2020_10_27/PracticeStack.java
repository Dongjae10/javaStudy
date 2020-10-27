package Java2020_10_27;

import java.util.Iterator;
import java.util.Stack;

public class PracticeStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        String numbers[] = {"1", "2", "3"};

        for(String a : numbers)
            stack.add(a);

        Iterator<String> iterator = stack.iterator();
        while(iterator.hasNext())
            System.out.println(stack.pop());
    }
}
