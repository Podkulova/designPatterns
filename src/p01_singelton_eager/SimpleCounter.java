package src.p01_singelton_eager;

public class SimpleCounter {
    private static final SimpleCounter INSTANCE = new SimpleCounter();
    public static SimpleCounter getInstance() {
        return INSTANCE;
    }
    private SimpleCounter() {
        System.out.println("SimpleCounter created.");
    }
    private int currentCount = 0;
    public int getCurrentCount() {
        return currentCount;
    }
    public void increment() {
         currentCount++;
    }
    public void decrement() {
        if (currentCount > 0) {
            currentCount--;
        }
    }
    public void decrement(int n) {
        if (n <= currentCount) {
            currentCount -= n;
        } else {
            // vyjímka
        }
    }
}
