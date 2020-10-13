package Java2020_10_13;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 100;
        float b = 100;
        double c = 100;
        boolean d = true;

        printString(String.valueOf(a));
        printString(Float.valueOf(b).toString());
        printString(Double.toString(c));

        String[] allNames = {"경연웅", "김민우", "김현명", "김우진"};
        printString(checkAttendance(allNames));
        printString(removeStudent(checkAttendance(allNames), "김현명"));

        String[] array =  makeEach(checkAttendance(allNames));

        for(int i = 0; i < array.length ; i++)
        printString(array[i]);


    }

    static void printString(String s) {
        System.out.println(s);
    }

    static int numberS(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 's')
                cnt++;
        }
        return cnt;
    }

    static String checkAttendance(String[] name){
        String result = name[0];
        for(int i = 1 ; i < name.length - 1 ; i++){
            result = result.concat("-" + name[i]);
        }
        return result;
    }

    static String removeStudent(String all, String name){
        return all.replace("-"+name,"");
    }

    static String[] makeEach(String attendance){
        return attendance.split("-");
    }
}







