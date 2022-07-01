package tddTesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testsClass.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {

    @Test
    @DisplayName("Deposit Money, Increase Balance")

    public void depositMoneyBalanceIncreaseTest(){
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(500);
        jennyAccount.deposit(200);
        //check
        assertEquals(700 , jennyAccount.getBalance());
    }
    @Test
    @DisplayName("Deposit Money, Increase Balance")

    public void depositMoney(){
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(700);
        //check
        assertEquals(700 , jennyAccount.getBalance());
    }
    @Test
    @DisplayName("Withdrawal Tests")
    public void withdrawWorkersTest() {
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(6000);
        jennyAccount.withdraw(2000);
        //check
        assertEquals(4000 , jennyAccount.getBalance());
    }

    @Test
    @DisplayName("To test if I enter a Negative Deposits Amount")
    public void negativeDeposits(){
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(-500);
        //check
        assertEquals(0 , jennyAccount.getBalance());
    }
}
