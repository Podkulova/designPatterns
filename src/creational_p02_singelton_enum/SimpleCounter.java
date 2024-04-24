package src.creational_p02_singelton_enum;

public enum  SimpleCounter {
    INSTANCE;
    private int currentCount = 0;
    public int getCurrentCount() {
        return currentCount;
    }
    public void increment() {
        currentCount++;
    }
}
