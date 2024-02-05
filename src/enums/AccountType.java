package enums;

public enum AccountType {
    SAVINGS("Savings Account", "SAV"),
    CHECKING("Checking Account", "CHK"),
    INVESTING("Investing Account", "INV"),
    LOAN("Loan Account", "LON");

    private String name;
    private String code;

    AccountType(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
