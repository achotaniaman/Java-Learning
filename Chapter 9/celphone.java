// Logic class
class Telephone {

    public void ringing() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void call() {
        System.out.println("Call frnd...");
    }
}

// Main driver class (matches celphone.java)
public class celphone {
    public static void main(String[] args) {
        Telephone myPhone = new Telephone();

        myPhone.call();
        myPhone.ringing();
        myPhone.vibrate();
    }
}