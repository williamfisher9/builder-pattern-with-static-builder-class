package pojo;

import enums.AccountType;
import enums.Currency;

import java.math.BigDecimal;

public class Account {
    private AccountType accountType;
    private BigDecimal balance;
    private String accountNumber;
    private String iban;
    private boolean overdraftAllowed;
    private Currency currency;

    public Account(AccountBuilder builder){
        this.accountNumber = builder.getAccountNumber();
        this.balance = builder.getBalance();
        this.accountType = builder.getAccountType();
        this.iban = builder.getIban();
        this.currency = builder.getCurrency();
        this.overdraftAllowed = builder.isOverdraftAllowed();
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIban() {
        return iban;
    }

    public boolean isOverdraftAllowed() {
        return overdraftAllowed;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountType=" + accountType +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", iban='" + iban + '\'' +
                ", overdraftAllowed=" + overdraftAllowed +
                ", currency=" + currency +
                '}';
    }

    public static class AccountBuilder {
        private AccountType accountType;
        private BigDecimal balance;
        private String accountNumber;
        private String iban;
        private boolean overdraftAllowed;
        private Currency currency;

        public AccountType getAccountType() {
            return accountType;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getIban() {
            return iban;
        }

        public boolean isOverdraftAllowed() {
            return overdraftAllowed;
        }

        public Currency getCurrency() {
            return currency;
        }

        public AccountBuilder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public AccountBuilder setBalance(BigDecimal balance) {
            this.balance = balance;
            return this;
        }

        public AccountBuilder setAccountType(AccountType accountType) {
            this.accountType = accountType;
            return this;
        }

        public AccountBuilder setIban(String iban) {
            this.iban = iban;
            return this;
        }

        public AccountBuilder setCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public AccountBuilder setOverdraftAllowed(boolean allowed) {
            this.overdraftAllowed = allowed;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
