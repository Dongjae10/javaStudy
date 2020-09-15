public class Practice02 {
    public static void main(String[] args) {
        int [] init = makeArray(5);
       for(int i = 0; init.length > i ; i++)
           System.out.println(init[i]);
    }
    static int [] makeArray(int a){
        int [] array = new int [a];
        for(int i = 0; i < array.length ; i++) {
            array[i] = i+1;
        }
        return array;
    }
}
