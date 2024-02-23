package exception;

import java.io.IOException;

public class ExceptionPropogation {
    void m() throws IOException {
        int x = 28 + 3;
        throw new java.io.IOException("Device error");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String args[]) {
        ExceptionPropogation obj = new ExceptionPropogation();
        obj.p();
        System.out.println("Normal flow");
    }
}
