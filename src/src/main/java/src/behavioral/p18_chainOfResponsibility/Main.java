package src.behavioral.p18_chainOfResponsibility;

public class Main {

    // vytvoříme řetěz odpovědnosti
    private static Logger doChaining() {
        Logger outputLogger = new OuputLogger(Logger.OUTPUTINFO);

        Logger errorLoger = new ErrorLogger(Logger.ERRORINFO);
        outputLogger.setNextLevelLogger(errorLoger);

        Logger debugLogger = new DebugLogger(Logger.DEBUGINFO);
        errorLoger.setNextLevelLogger(debugLogger);

        return outputLogger;
    }

    public static void main(String[] args) {
        Logger chainlogger = doChaining();

        chainlogger.logMessage(Logger.OUTPUTINFO, "This is OUTPUT info log.");

        System.out.println("--------------------------------");

        chainlogger.logMessage(Logger.ERRORINFO, "This is ERROR log.");

        System.out.println("--------------------------------");

        chainlogger.logMessage(Logger.DEBUGINFO, "This is DEBUG log.");
    }
}
