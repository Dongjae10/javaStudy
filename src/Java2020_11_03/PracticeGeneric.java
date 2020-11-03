package Java2020_11_03;

class StoreAtMost<T> {
    String title;
    T first, second;
    StoreAtMost(String title) {
        this.title = title;
    }

    void add(T o) {
        if (first == null)
            first = o;
        else if (second == null)
            second = o;
        else {
            first = second;
            second = o;
        }
    }
}

public class PracticeGeneric {
    public static void main(String[] args) {
        StoreAtMost<String> stringStoreAtMost = new StoreAtMost<>("NAME");
        stringStoreAtMost.add("새로이");
        stringStoreAtMost.add(("장근원"));
        StoreAtMost<Integer> integerStoreAtMost = new StoreAtMost<>("AGE");
        integerStoreAtMost.add(20);
        integerStoreAtMost.add(21);

        System.out.println(stringStoreAtMost.first);
        System.out.println(stringStoreAtMost.second);
        System.out.println(integerStoreAtMost.first);
        System.out.println(integerStoreAtMost.second);

    }
}

