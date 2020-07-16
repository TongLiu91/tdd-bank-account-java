package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void newAccountWithZeroBalance() {
        Account account = new Account();
        assertEquals(account.balance(), 0);
    }

    @Test
    public void firstDeposit() {
        Account account = new Account();
        account.deposit(10);
        assertEquals(account.balance(), 10);
    }

    @Test
    public void withdraw() {
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);
        assertEquals(account.balance(), 5);
    }

    @Test
    public void transfer() {
        Account from = new Account();
        Account to = new Account();

        from.deposit(10);
        to.deposit(20);

        Account.transfer(from, to, 3);
        assertEquals(from.balance(), 7);
        assertEquals(to.balance(), 23);
    }
    /*
    @Test
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }
    */
}
