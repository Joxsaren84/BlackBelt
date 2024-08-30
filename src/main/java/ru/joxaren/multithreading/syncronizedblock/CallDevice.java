package ru.joxaren.multithreading.syncronizedblock;

public class CallDevice {

    static final Object lock = new Object();

    void mobileCall(){
        synchronized (lock) {
            System.out.println("Mobile call starts!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call end!");
        }
    }

    void skypeCall(){
        synchronized (lock) {
            System.out.println("Skype call starts!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call end!");
        }
    }

    void whatsappCall(){
        synchronized (lock){
            System.out.println("Whatsapp call starts!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsapp call end!");
        }
    }

}
