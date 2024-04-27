package src.structural.p11_bridge;

public class Coffee implements Drink{
    @Override
    public String getVolume() {
        return "500 ml";
    }

    @Override
    public boolean isAddictive() {
        return true;
    }

    @Override
    public int getNumberOfSugarLumps() {
        return 0;
    }

    @Override
    public String getTaste() {
        return "bitter";
    }

    @Override
    public String toString() {
        return "Coffe{"
                + "volume=" + getVolume()
                + "taste=" + getTaste()
                + "sugar=" + getNumberOfSugarLumps()
                + "}";
    }
}
