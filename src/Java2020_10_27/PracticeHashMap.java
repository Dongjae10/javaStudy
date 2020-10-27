package Java2020_10_27;

import java.util.HashMap;
import java.util.Iterator;

public class PracticeHashMap {
    public static void main(String[] args) {
        String namesAndScore [][] = {{"이재문", "70"}, {"한원선", "99"}, {"김남윤", "98"}, {"김성동", "97"}, {"황기태", "88"}};

        HashMap<String,String> hashMap = new HashMap<>();

        for(int i = 0 ; i < namesAndScore.length ; i++)
            for(int j = 0 ; j < 1 ; j++)
            hashMap.put((namesAndScore[i][j]),namesAndScore[i][j+1]);

        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " : " + hashMap.get(key));
        }

        System.out.println();

        if(hashMap.containsKey(namesAndScore[0][0]))
            hashMap.put(namesAndScore[0][0],"80");

        iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " : " + hashMap.get(key));
        }
    }
}
