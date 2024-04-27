package src.creational.p03_singelton_lazy;

import java.util.ArrayList;
import java.util.List;

public class CommonStorage {
    // vytvoří se až ve chvíli, kdy ho potřebuji
    private static CommonStorage instance;

    public static CommonStorage getInstance() {
        if (instance == null) { // lazy double checked
            synchronized (CommonStorage.class) {
                if (instance == null) {
                    instance = new CommonStorage();
                }
            }
        }
        return instance;
    }

    private List<Integer> values = new ArrayList<>();

    private CommonStorage() {
        System.out.println("Lazy singleton created.");
    }

    public void addValue(int value) {
        values.add(value);
    }

    public List<Integer> getValues() {
        return values;
    }
}
