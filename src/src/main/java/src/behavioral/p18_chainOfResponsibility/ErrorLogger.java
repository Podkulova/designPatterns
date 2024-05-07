package src.behavioral.p18_chainOfResponsibility;

public class ErrorLogger extends Logger {
    public ErrorLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("ERROR: " + msg);
    }
}
