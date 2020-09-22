package baek_J;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MathRoundUse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int i , j = 0, k = 0 ,sum = 0, average, cnt = 0;
        int N =  Integer.parseInt(stringTokenizer.nextToken());
        double [] percent = new double[N];
        ArrayList<Integer> arrayList = new ArrayList<>();


        for (i = 0 ; i < N ; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int n = Integer.parseInt(stringTokenizer.nextToken());

            // for(매개변수 : 배열) 배열의 것을 차례대로 하나씩 넣겠다...

            while(stringTokenizer.hasMoreTokens()){
                arrayList.add(Integer.parseInt(stringTokenizer.nextToken()));
                sum += arrayList.get(j);
                j++;
            }

            average = sum / n;

            for ( ; k < arrayList.size() ; k++){
                if(average < arrayList.get(k)) cnt++;
            }

            percent[i] = ((double)cnt / (double)n) * 100;

           //초기화
            sum = 0;
            average = 0;
            cnt = 0;

        }
        for(i = 0; i < N ; i++)
        bufferedWriter.write(String.format("%.3f",percent[i]) + "%\n");

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
