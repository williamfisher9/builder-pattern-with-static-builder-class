import enums.AccountType;
import enums.Currency;
import pojo.Account;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account savingsAccount = new Account.AccountBuilder()
                .setAccountNumber("00192839288001")
                .setCurrency(Currency.USD)
                .setBalance(BigDecimal.ZERO)
                .setAccountType(AccountType.SAVINGS)
                .build();

        Account usdCheckingAccount = new Account.AccountBuilder()
                .setAccountNumber("00192839288002")
                .setCurrency(Currency.USD)
                .setOverdraftAllowed(true)
                .setBalance(BigDecimal.ZERO)
                .setAccountType(AccountType.CHECKING)
                .setIban("US001TXUSD293940293392")
                .build();

        Account jpyCheckingAccount = new Account.AccountBuilder()
                .setAccountNumber("00177228356002")
                .setCurrency(Currency.JPY)
                .setOverdraftAllowed(true)
                .setIban("US001TXJPY6373899293392")
                .setBalance(BigDecimal.ZERO)
                .setAccountType(AccountType.CHECKING)
                .build();

        System.out.println(savingsAccount);
        System.out.println(usdCheckingAccount);
        System.out.println(jpyCheckingAccount);
    }
}