import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Practice01 {
    public static void main(String[] args) {
        // 3개의 정수값에서 최댓값 찾기
        System.out.println(max(1,3,2));

        //Math.max 라는 내장객체를 이용해서 최댓값 구하기
        int max = Math.max(Math.max(2,4),3);
        System.out.println(max);

        //배열에 담아서 최댓값 찾기
        int[] a = {0,2,4,8,6};
        System.out.println(max(a));

        ArrayList<Integer> b = new ArrayList<>();
        for(int c : a)
            b.add(c);
        System.out.println(max(b));

    }
    // 3개의 정수값에서 최댓값 찾기
    static int max (int x, int y, int z){
        int max = 0;
        max = x > y ? x : y;
        max = max > z ? max : z;
        return max;
    }

    //배열에 담아서 최댓값 찾기
    static int max (int[] array){
        int max = 0;

        for(int i = 0 ; array.length > i ; i++){
            max = max > array[i] ? max : array[i];
        }
        return max;
    }

    //ArrayList로 최댓값 구하기
    static int max (ArrayList<Integer> arrayList){

        int max = 0;

        for (int i = 0; i > arrayList.size() ; i++){
            max = max > arrayList.get(i) ? max : arrayList.get(i);
        }
        return max;
    }
}
