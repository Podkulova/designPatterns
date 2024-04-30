package src.structural.p15_facade;

import java.util.Random;

public class ProductAvailability implements ProductAvailablityService{
    @Override
    public boolean isAvaible(Integer productId) {
        return new Random().nextBoolean(); // vygenerujeme náhodně
    }
}
