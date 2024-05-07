package src.behavioral.p18_chainOfResponsibility;

public abstract class Logger {
    public static int OUTPUTINFO = 1; // Výpis výsledků
    public static int ERRORINFO = 2; // Výpis chyb
    public static int DEBUGINFO = 3; // Pomocný výpis pro odhalení chyb

    protected int levels;
    protected Logger nextLevelLogger; // propojený list

    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String msg) {
        if (this.levels <= levels) {
            displayLogInfo(msg);
        }
        if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(levels, msg);
        }
    }

    protected abstract void displayLogInfo(String msg);
}
