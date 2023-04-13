package implementations;

import enums.CoffeeType;

public class AuditInfo {

    float totalPrice = 0f;

    float milkConnsumed = 0f;

    float waterConsumed = 0f;

    float beansConsumed = 0f;

    public AuditInfo(float totalPrice, float milkConnsumed, float waterConsumed, float beansConsumed) {
        this.totalPrice = totalPrice;
        this.milkConnsumed = milkConnsumed;
        this.waterConsumed = waterConsumed;
        this.beansConsumed = beansConsumed;
    }
}
