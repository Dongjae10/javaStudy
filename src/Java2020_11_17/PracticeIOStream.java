package Java2020_11_17;

import java.io.*;

public class PracticeIOStream {
    public static void main(String[] args){
        //PracticeFileReader practiceFileReader = new PracticeFileReader();
        //PracticeFileclass practiceFileclass = new PracticeFileclass();
        PracticeFileWriter practiceFileWriter = new PracticeFileWriter();
    }
}

class PracticeFileReader {
    public PracticeFileReader() {
        try {
            FileReader fileReader = new FileReader("/Users/idongjae/Documents/temp/test.txt");

            System.out.println("인코딩 방법 : " + fileReader.getEncoding());
            int a;

            while((a = fileReader.read()) != -1 ){
                System.out.print((char)a);
            }

            fileReader.close();

            FileInputStream fileInputStreamV2 = new FileInputStream("/Users/idongjae/Documents/temp/test.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStreamV2,"UTF-8");
            System.out.println("인코딩 방법 : " + inputStreamReader.getEncoding());
            while((a = inputStreamReader.read()) != -1 ){
                System.out.print((char)a);
            }
            inputStreamReader.close();
            fileInputStreamV2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class PracticeFileWriter {
    public PracticeFileWriter() {
        File file = new File("~/Documents/temp/test3.txt");

        String filename = file.getName();
        String path = file.getPath();
        String parents = file.getParent();
    }
}

class PracticeFileclass {
    public PracticeFileclass() {

        try {

            File src = new File("/Users/idongjae/Documents/temp/test.txt");
            File dest = new File("/Users/idongjae/Documents/temp/test2.txt");
            int a;
            FileReader fileReader = new FileReader(src);
            FileWriter fileWriter = new FileWriter(dest);

            while ((a = fileReader.read()) != -1) {
                fileWriter.write((char)a);
            }

            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
