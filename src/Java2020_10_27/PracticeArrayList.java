package Java2020_10_27;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeArrayList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        String animalsName[] = {"dog", "horse", "cat"};

        String longest = "";
        String longest2 = "";

        int i = 0;

        for(String a : animalsName) {
            animals.add(a);
            longest = longest.length() > animals.get(i).length() ? longest : animals.get(i);
            i++;
        }

        System.out.println(longest);

        Iterator<String> it = animals.iterator();
        while(it.hasNext()){
            String value = it.next();
            longest2 = longest2.length() > value.length() ? longest2 : value;
        }

        System.out.println(longest2);

    }
}
