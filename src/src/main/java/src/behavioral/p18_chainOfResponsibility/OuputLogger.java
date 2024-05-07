package src.behavioral.p18_chainOfResponsibility;

public class OuputLogger extends Logger {
    public OuputLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("OUTPUT INFO: " + msg);
    }
}
