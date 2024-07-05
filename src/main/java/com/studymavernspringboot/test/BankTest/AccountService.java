//package com.studymavernspringboot.test.BankTest;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AccountService {
//    private List<Account> accountList = new ArrayList<>();
//
//
//    public int size() {
//        return this.accountList.size();
//    }
//
//    public void clear() {
//        this.accountList.clear();
//    }
//
//    public boolean addAccount(String owner, String acNum, int myMoney) {
//        return addAccount(new Account(owner, acNum, myMoney));
//    }
//
//    public boolean addAccount(Account account) {
//        Account find = chooseAccount(account.getAcNum());
//        if (find == null) {
//            return this.accountList.add(account);
//        }
//        return false;
//    }
//
//    public List<Account> getAllAccount() {
//        return this.accountList;
//    }
//
//    public boolean giveMoney(String acNum, int myMoney) {
//        Account account = this.chooseAccount(acNum);
//        if (account == null) {
//            return false;
//        }
//        if (myMoney > 0) {
//            account.setMyMoney(account.getMyMoney() + myMoney);
//            return true;
//        }
//        else
//            return false;
//    }
//
//    public boolean takeMoney(String acNum, int myMoney) {
//        Account account = this.chooseAccount(acNum);
//        if (account == null) {
//            return false;
//        }
//        else if (account.getMyMoney() < myMoney) {
//            return false;
//        }
//        else {
//            account.setMyMoney(account.getMyMoney() - myMoney);
//            return true;
//        }
//    }
//
//    public Account chooseAccount(String acNum) {
//        if (acNum == null) {
//            return null;
//        }
//        for (Account account : accountList) {
//            if (acNum.equals(account.getAcNum())) {
//                return account;
//            }
//        }
//        return null;
//    }
//}
