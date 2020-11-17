package Java2020_11_03;



class Student{
    int grade;

    void setGrade(int grade) throws Exception{
        if(grade < 1 || grade > 6){
            Exception ex = new Exception("학년 에러");
            throw ex;
        }
        this.grade = grade;
    }
}
public class PracticeExceptionV2 {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setGrade(0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}
