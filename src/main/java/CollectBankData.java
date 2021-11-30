public class CollectBankData {

    public static void main(String[] args) {

        BankProducts bankProducts = new BankProducts("Deposit", 3, 100.00);
        BankInformation bankInformation = new BankInformation(2);
        BankInformation bankInformationData = new BankInformation("Alfa", "Kyiv, Horkoho, 12 str.");
        BankBoardMembers bankBoardMembers = new BankBoardMembers("CEO", "Ivanov", "Oleh");

        System.out.print(bankInformationData.toString());
        System.out.println(" and has rating " + bankInformation.hashCode());
        System.out.println(bankBoardMembers.toString());
        System.out.println(bankProducts.toString());
    }
}
