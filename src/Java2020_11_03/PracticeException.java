package Java2020_11_03;

class Person {
    String name;
    int age;
    String currentLocation;

    Person(String name) {
        this.name = name;
    }

    void setAge(int age) throws Exception {
        if (age < 0) { //음수 나이에 대한 예외 상황 발생
            Exception ex = new Exception("나이에 대한 잘못된 변경");
            throw ex;
        }
        this.age = age; // 정상적 나이 변경 수행
    }
}
public class PracticeException {
    public static void main(String[] args) {
        Person hong = new Person("홍길동");

        try{
            hong.setAge(-24);
        }catch (Exception e) {
            System.out.println("\n ???오류 : " + e.getMessage());
        }
        System.out.println(hong.age);
    }
}

