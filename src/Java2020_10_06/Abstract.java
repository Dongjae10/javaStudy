package Java2020_10_06;

public class Abstract {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        System.out.println(myCalculator.add(2,3));
        System.out.println(myCalculator.subtract(2,3));
        System.out.println((myCalculator.average(new int[] {1, 2 ,3})));
        }
    }

abstract class Calculator {
    public int add(int a, int b){
        return a + b ;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public abstract double average(int[] a);
}

class MyCalculator extends Calculator{
    @Override
    public double average(int[] a) {
        double sum = 0;
        for(int i = 0 ; i < a.length ; i++){
            sum += a[i];
        }
        return sum / a.length;
    }
}