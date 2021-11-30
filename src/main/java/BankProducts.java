public class BankProducts {

    private String productName;
    private int productMinTermMonth = 0;
    private double productMinSum = 0;

    public BankProducts(String productName, int productMinTermMonth, double productMinSum) {
        this.productName = productName;
        this.productMinTermMonth = productMinTermMonth;
        this.productMinSum = productMinSum;
    }

    @Override
    public String toString(){
        return "Their " + productName + " has a minimal term of " + productMinTermMonth + " months and the minimal sum of " + productMinSum + " USD.";
    }
}
