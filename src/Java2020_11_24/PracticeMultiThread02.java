package Java2020_11_24;

public class PracticeMultiThread02 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        Thread thread = new Thread(new TimerRunnable());
        thread.start();
        /*try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            return;
        }*/
        //thread.interrupt();

    }
}

class TimerRunnable implements Runnable {
    int n = 0;
    private boolean flag = false;
    public void finish(){flag = true;}

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        while (true) {
            System.out.println(n);
            n++;
            try{
                Thread.sleep(1000);
                if(flag == true)
                    return;
            }catch(InterruptedException e){return;}
        }
    }
}
