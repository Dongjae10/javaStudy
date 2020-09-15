public class Practice03 {
    public static void main(String[] args) {

        Subject subject = new Subject( "computer", 90);
        Student student = new Student( "LeeDongJae", 201813032, subject);
        student.setRetake(true);

        subject.setGrade(subject.getGrade(student));

        System.out.println("과목명 : "+subject.getSubject_name()+"\n과목 점수 : "+subject.getScore()+"\n재수강 여부 : "+student.isRetake()+"\n과목 학점 : "+subject.getGrade(student));

    }
}

class Subject {
    private String subject_name;
    private int score;
    private String grade;

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade(Student student){
        if (score >= 80)
            if(student.isRetake())
                grade = "A";
            else
                grade = "A+";
        else if (80 > score && score >=60)
            grade = "A";
        else
            grade = "B";
        return grade;
    }

    public Subject(String subject_name, int score){
        this.subject_name = subject_name;
        this.score = score;
    }

}

class Student{
    private String name;
    private int student_num;
    private Subject subject;
    private boolean retake;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudent_num() {
        return student_num;
    }

    public void setStudent_num(int student_num) {
        this.student_num = student_num;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public boolean isRetake() {
        return retake;
    }

    public void setRetake(boolean retake) {
        this.retake = retake;
    }

    public Student(String name, int student_num, Subject subject){
        this.name = name;
        this.student_num = student_num;
        this.subject = subject;
    }

}

