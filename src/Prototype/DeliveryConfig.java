package Prototype;

 class DeliveryConfig {
    int maxDistance;
    int estimatedTime;

    public DeliveryConfig(int maxDistance, int estimatedTime) {
        this.maxDistance = maxDistance;
        this.estimatedTime = estimatedTime;
    }

    public DeliveryConfig clone() {
        return new DeliveryConfig(this.maxDistance, this.estimatedTime);
    }
}
