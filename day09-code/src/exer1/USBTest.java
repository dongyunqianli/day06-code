package exer1;

public class USBTest {

    public static void main(String[] args) {
        Computer com = new Computer();
        Flash flash = new Flash();
        com.transferDate(flash);

        USB phone=new USB() {
            @Override
            public void start() {
                System.out.println("phone start work");
            }

            @Override
            public void stop() {
                System.out.println("phone ends work");
            }
        };
        com.transferDate(phone);

        com.transferDate(new USB() {
            @Override
            public void start() {
                System.out.println("well, start anonymous class with anonymous object");
            }

            @Override
            public void stop() {
                System.out.println("ok, stop the anonymous class with anonymous object");
            }
        });

    }
}

class Computer{
    public void transferDate(USB usb){
        usb.start();
        System.out.println("details of transformation.");
        usb.stop();

    }
}

interface USB{
    void start();
    void stop();
}
class Flash implements USB{
    @Override
    public void start() {
        System.out.println("Udisk start work");
    }

    @Override
    public void stop() {
        System.out.println("Udisk stop work");
    }
}
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("printer start work");
    }

    @Override
    public void stop() {
        System.out.println("printer stop work");
    }
}
