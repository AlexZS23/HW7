public class BankInformation {

    private int bankRating = 1;
    private String bankName;
    private String bankAddress;

    public BankInformation(String bankName, String bankAddress) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
    }

    public BankInformation(int bankRating) {
        this.bankRating = bankRating;
    }

    public BankInformation(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public int hashCode(){
        return bankRating;
    }

    @Override
    public String toString(){
        return "Bank " + bankName + " is located at " + bankAddress;
    }
}
