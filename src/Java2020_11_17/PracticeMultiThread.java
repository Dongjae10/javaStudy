package Java2020_11_17;

import java.lang.management.ManagementFactory;
import java.sql.Time;

public class PracticeMultiThread {

    public static void main(String[] args) {
        final String jvmName = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(jvmName);
        final int index = jvmName.indexOf('@');
        System.out.println(Long.toString(Long.parseLong(jvmName.substring(0,index))));

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        TimerThread thread = new TimerThread();
        thread.start();
        TimerThread2 thread2 = new TimerThread2();
        thread2.start();


    }
}

class TimerThread extends Thread {
    int n = '0';

    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        while(true){
            System.out.println(n);
            n++;
            try {
                sleep((1000));
            }catch(InterruptedException e){return;}

        }
    }
}

class TimerThread2 extends Thread {
    char m = 'A';

    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        while(true){
            System.out.println(m);
            m++;
            try {
                sleep((1000));
            }catch(InterruptedException e){return;}

        }
    }
}

