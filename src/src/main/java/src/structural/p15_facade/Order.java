package src.structural.p15_facade;

import jakarta.persistence.criteria.CriteriaBuilder;

public interface Order {
    boolean isAvailable(Integer productId);
    void pay(Integer productId, int amount);
    void deliveryProduct(Integer productId, int amount, String recipient);
}
