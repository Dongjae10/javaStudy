public class Practice04 {
    public static void main(String[] args) {

        // substring을 활용해서 int a 번째 위치부터 출력하기
        String str = "hanshin";

        System.out.println(str.substring(2));

        // substring을 활용해서 int a 번째 위치부터 int b 까지 출력하기
        System.out.println(str.substring(2,4));

        //특정 문자 앞의 문자열 제거
        String str2 = "hanshin/university";
        String result = str2.substring(str2.lastIndexOf("/")+1);
        System.out.println(result);

        //특정 단어 자르기

        String str3 = "한신 : 대학교 : 컴퓨터 : 공학부";
        int target = str3.indexOf("컴퓨터");
        String result2 = str3.substring(target,str3.substring(target).indexOf(" ") + target);
        System.out.println(result2);

        // split을 활용해서 특정 문자 자르기
        String str4 = "010-1234-5678";

        String[] array = str4.split("-");
        for (int i = 0; array.length > i ; i++)
            System.out.print(array[i]);
    }

}
