package Java2020_11_10;

public class PracticeException3 {
    public static void main(String[] args) {
        try {
            try {
                makePerson();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                int a = Integer.parseInt("10asd");
                System.out.println(a);
            } catch (NumberFormatException e) {
                System.out.println("사용자가 잘못 입력함 - 사용자한테 다시 요청");
            }
        }catch (OutOfMemoryError e){
            System.out.println("Out of Memory Error");
        }

    }
    static void makePerson() throws Exception {
        PersonE p = new PersonE();
        p.setGrade(7);
    }
}

class PersonE {
    int age;
    int grade;
    void setGrade(int grade) throws Exception{
        if(grade < 1 || grade > 6){
            Exception e = new Exception ("학년 에러");
            throw e;
        }
        this.grade = grade;
        }
        }