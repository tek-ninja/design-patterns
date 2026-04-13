package Prototype;

 class PricingRules implements Cloneable{
      double surgeMultiplier;
      double taxRate;

    public PricingRules(double surgeMultiplier, double taxRate) {
        this.surgeMultiplier = surgeMultiplier;
        this.taxRate = taxRate;
    }

    public PricingRules clone() {
        return new PricingRules(this.surgeMultiplier, this.taxRate);
    }
}
