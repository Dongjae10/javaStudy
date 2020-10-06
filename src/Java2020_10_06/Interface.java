package Java2020_10_06;

public class Interface {
    public static void main(String[] args) {
        SamsungPhone samsungPhone = new SamsungPhone();
        samsungPhone.sendCall();
        samsungPhone.receiveCall();
        samsungPhone.printLogo();
        samsungPhone.flash();
    }
}

interface PhoneIneterface {
    public static final int TIMEOUT = 10000;
    public abstract void sendCall();
    public abstract void receiveCall();
    public default void printLogo(){
        System.out.println("** Phone **");
    }

}
interface Allinterface {
    void recognizeSpeech();

    void synthesizeSpeech();
}

class SamsungPhone implements PhoneIneterface , Allinterface{
    @Override
    public void sendCall() {
        System.out.println("ring");
    }

    @Override
    public void receiveCall() {
        System.out.println("Hello World!!!");
    }

    @Override
    public void recognizeSpeech() {
    }

    @Override
    public void synthesizeSpeech() {

    }

    public void flash() {
        System.out.println("flash~");
    }
}