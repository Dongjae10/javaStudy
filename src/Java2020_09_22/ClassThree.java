package Java2020_09_22;

/* 서브클래스/ 슈퍼클래스 생성자 호출 및 실행...
        서브클래스의 객체가 생성되면 슈퍼클래스와 서브클래스 생성자중 무엇이 실행될까?
        : 서브클래스와 슈퍼클래스 모두 실행된다.

        그러면 서브클래스와 슈퍼클래스 중에 누가 먼저 실행 될까?
        :최상위 조상을 찾아가며 역순으로 객체가 호출되기 때문에 슈퍼클래스부터 실행된다.

클래스는 생성자를 여러개 만들 수 있다.
때문에 서브클래스는 슈퍼클래스의 생성자를 하나 선택 할 수 있다.
방법은 생성자에 super(Parameter) 를 사용한다 단, 무조건 서브클래스의 첫줄에 와야한다.
super(Parameter)를 명시하지 않는 다면 슈퍼클래스의 디폴트값의 생성자를 호출한다.(super() 가 생략 되어 있는 것이다.)
생성자는 오버로딩이 가능하기 때문에 개발자는 자신이 호출하고 싶은 생성자를 잘 인지하고 호출 해야 한다.
 */

public class ClassThree {
    public static void main(String[] args) {
        B b = new B(10);
        A a = b; // 업캐스팅... b라는 객체는 A의 멤버만 접근 가능 해진다.
        b = (B)a; // 다운캐스팅... 업캐스팅 된 b를 다시 다운캐스팅

        // <객체> instanceof <클래스명> : <객체>가 어떤 <클래스>타입인지 불린 값으로 리턴해준다.

    }
}

class A {
    int x;
    public A(){
        System.out.println("생성자 A");
    }
    public A(int x){
        this.x = x;
        System.out.println("매개변수 생성자 A");
    }
}

class B extends A{
    int y;
    public B() {
        System.out.println("생성자 B");
    }
    public B(int y) {
        super(y);
        this.y = y;
        System.out.println("매개변수 생성자 B");
    }
}

class C extends B{
    public C() {
        System.out.println("생성자 C");
    }
}


