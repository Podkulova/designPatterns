package src.structural.p11_bridge;

public class Tea implements Drink{
    @Override
    public String getVolume() {
        return "200 ml";
    }

    @Override
    public boolean isAddictive() {
        return false;
    }

    @Override
    public int getNumberOfSugarLumps() {
        return 2;
    }

    @Override
    public String getTaste() {
        return "sweet";
    }

    @Override
    public String toString() {
        return "Tea{"
                + "volume=" + getVolume()
                + "taste=" + getTaste()
                + "sugar=" + getNumberOfSugarLumps()
                + "}";
    }
}
