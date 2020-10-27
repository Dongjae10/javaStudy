package Java2020_10_27;

import java.util.Iterator;
import java.util.TreeSet;

public class PracticeTreeSet {
    public static void main(String[] args) {

        String numbers[] = {"1번", "2번", "3번", "1번", "2번"};

        TreeSet<String> treeSet = new TreeSet<>();

        for(String a : numbers)
            treeSet.add(a);

        Iterator<String> iterator = treeSet.iterator();

        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

    }
}
