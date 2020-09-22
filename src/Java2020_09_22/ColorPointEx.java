package Java2020_09_22;
/* class A 가 class B를 상속 받으면, A는 슈퍼클래스(부모) B는 서브클래스(자식)이 된다.
서브클래스는 슈퍼클래스의 필드, 메소드, 객체를 별도의 선언 없이 사용할 수 있다.
상속은 다중상속을 허용하지 않지만 무제한으로 상속이 가능하다.
상속의 최상위 조상 클래스는 java.lang.Object 클래스이다.

자바의 접근지정자에 대하여...
private: 현재 클래스 내에서만 접근 가능 상속을 하더라도 private로 선언이 되어있으면 접근 불가
default: 패키지내의 모든 클래스 접근 가능 다른 패키지일 경우 상속을 하더라도 접근할 수 없다.
protect: default와 마찬가지로 동일한 패키지 내에서는 접근이 가능하지만 상속을 한 경우 접근이 가능하다.
public: 모든 클래스 내에서 접근이 가능하다.

*/
public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(1, 2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}

class Point {
    private int x, y;
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void showPoint(){
        System.out.println("(" + x + ","+ y + ")");
    }
}

class ColorPoint extends Point {
    private String color;
    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }

}
