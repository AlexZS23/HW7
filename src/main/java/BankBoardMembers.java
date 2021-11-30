public class BankBoardMembers {

    private String memberPosition;
    private String memberSurname;
    private String memberName;


    public BankBoardMembers(String memberPosition, String memberSurname, String memberName) {
        this.memberPosition = memberPosition;
        this.memberSurname = memberSurname;
        this.memberName = memberName;
    }

    @Override
    public String toString(){
        return "Management of the Bank: " + memberSurname + " " + memberName + " who has a position of " + memberPosition;
    }
}
