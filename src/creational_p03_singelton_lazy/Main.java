package src.creational_p03_singelton_lazy;

import src.creational_p02_singelton_enum.SimpleCounter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lazy singlton example: ");

        CommonStorage commonStorageA = CommonStorage.getInstance();
        CommonStorage commonStorageB = CommonStorage.getInstance();

        System.out.println("commonStorageA: " + commonStorageA);
        System.out.println("commonStorageB: " + commonStorageB);

        System.out.println("Are counter same? " + (commonStorageA == commonStorageB));

        commonStorageA.addValue(1);
        commonStorageB.addValue(2);

        System.out.println(commonStorageA.getValues());
        System.out.println(commonStorageB.getValues());
    }
}
