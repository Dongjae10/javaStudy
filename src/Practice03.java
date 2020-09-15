public class Practice03 {
    public static void main(String[] args) {

    }
}

class Subject {
    String subject_name;
    int score;
    String grade;

     Subject(String subject_name, int score){
        this.subject_name = subject_name;
        this.score = score;
    }

    void setGrade(String grade){
         this.grade = grade;
    }
}

class Student{
    String name;
    int student_num;
    Subject subject;
    boolean retake;

    Student(String name, int student_num, Subject subject){
        this.name = name;
        this.student_num = student_num;
        this.subject = subject;
    }
    String getGrade(){
        if (subject.score >= 80)
            subject.grade = "A+";
        else if (80 > subject.score && subject.score >=60)
            subject.grade = "A";
        else
            subject.grade = "B+";
        return  subject.grade;
    }
}

