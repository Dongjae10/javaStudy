package Java2020_11_24;

public class PracticeMultiThread03 {
    public static void main(String[] args) {
        SharedBoard board = new SharedBoard();
        StudentThread thread = new StudentThread("KYW",board);
        StudentThread thread2 = new StudentThread("LWG",board);
        thread.start();
        thread2.start();
    }
}

class SharedBoard {
    private int sum = 0;
    int n = 0;
    public synchronized void add(){
        n = sum ;
        n += 10;
        sum = n;
        System.out.println(Thread.currentThread().getId()+ " , "+ Thread.currentThread().getName() + " , " + sum);
    }
}

class StudentThread extends Thread {
    private SharedBoard board;
    public StudentThread (String name, SharedBoard board) {
        super(name);
        this.board = board;
    }

    public void run(){
        for (int i = 0; i < 10; i++){
            try{
                board.add();
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
