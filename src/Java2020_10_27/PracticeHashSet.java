package Java2020_10_27;

import java.util.HashSet;
import java.util.Iterator;

public class PracticeHashSet {
    public static void main(String[] args) {
        HashSet<String>hashSet = new HashSet<>();
        String names[] = {"1번", "2번", "3번", "1번", "2번"};

        for(String a : names)
            hashSet.add(a);

        Iterator<String> it = hashSet.iterator();
        while(it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
    }
}
