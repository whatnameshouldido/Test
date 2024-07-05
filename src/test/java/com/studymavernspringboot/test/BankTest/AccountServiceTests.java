//package com.studymavernspringboot.test.BankTest;
//
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//public class AccountServiceTests {
//    @Test
//    public void addAccountTest() {
//        AccountService accountService = new AccountService();
//
//        accountService.clear();
//        accountService.addAccount("강준서", "111-111", 50000);
//        assertThat(accountService.size()).isEqualTo(1);
//
//        Account choose = accountService.chooseAccount("111-111");
//        assertThat(choose).isNotNull();
//        assertThat(choose.getOwner()).isEqualTo("강준서");
//        assertThat(choose.getMyMoney()).isEqualTo(50000);
//
//
//        accountService.addAccount("KJS", "111-111", 20000);
//        assertThat(accountService.size()).isEqualTo(1);
//    }
//
//    @Test
//    public void moneyIn() {
//        AccountService accountService = new AccountService();
//        accountService.addAccount("강준서", "111-111", 50000);
//        accountService.addAccount("KJS", "222-222", 30000);
//        assertThat(accountService.size()).isEqualTo(2);
//
//        boolean result = accountService.giveMoney("222-222", 70000);
//        assertThat(result).isEqualTo(true);
//
//        Account choose = accountService.chooseAccount("222-222");
//        assertThat(choose).isNotNull();
//        assertThat(choose.getMyMoney()).isEqualTo(100000);
//
//        boolean result1 = accountService.giveMoney("111-111", 20000);
//        assertThat(result1).isEqualTo(true);
//
//        Account choose1 = accountService.chooseAccount(("111-111"));
//        assertThat(choose1).isNotNull();
//        assertThat(choose1.getMyMoney()).isEqualTo(70000);
//
//        Account choose2 = accountService.chooseAccount("444-444");
//        assertThat(choose2).isNull();
//    }
//
//    @Test
//    public void moneyOut() {
//        AccountService accountService = new AccountService();
//        accountService.addAccount("강준서", "111-111", 50000);
//        assertThat(accountService.size()).isEqualTo(1);
//
//        boolean result = accountService.takeMoney("111-111", 20000);
//        assertThat(result).isEqualTo(true);
//
//        Account choose = accountService.chooseAccount("111-111");
//        assertThat(choose).isNotNull();
//        assertThat(choose.getMyMoney()).isEqualTo(30000);
//
//        Account choose2 = accountService.chooseAccount("222-222");
//        assertThat(choose2).isNull();
//
//        boolean result2 = accountService.takeMoney("111-111", 50000);
//        assertThat(result2).isEqualTo(false);
//    }
//}
