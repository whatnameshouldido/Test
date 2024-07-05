//package com.studymavernspringboot.test.BankTest;
//
//import java.util.Scanner;
//
//public class BankApplication {
//    private AccountService accountService = new AccountService();
//
//    public void head() {
//        System.out.println("------------------------------------------------");
//        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
//        System.out.println("------------------------------------------------");
//    }
//
//    public int getChoice(Scanner scanner) throws Exception {
//        System.out.print("선택> ");
//        String a = scanner.nextLine();
//        return Integer.parseInt(a);
//    }
//
//    public void addAccount(Scanner scanner) throws Exception {
//        System.out.println("--------------");
//        System.out.println("계좌생성");
//        System.out.println("--------------");
//
//        System.out.print("계좌번호: ");
//        String acNum = scanner.nextLine();
//        System.out.print("계좌주: ");
//        String owner = scanner.nextLine();
//        System.out.print("초기입금액: ");
//        String myMoney = scanner.nextLine();
//        int money = Integer.parseInt(myMoney);
//
//        boolean newAc = this.accountService.addAccount(new Account(owner, acNum, money));
//
//        if(newAc) {
//            System.out.println("결과: 계좌가 생성되었습니다.");
//        }
//        else {
//            System.out.println("이미 있는 계좌번호 입니다. 다시 입력해주세요");
//        }
//    }
//
//    public void printAccount() { //계좌 목록 출력
//        for (Account account : this.accountService.getAllAccount()) {
//            System.out.println(account.toString());
//        }
//    }
//
//    public void pushMoney(Scanner scanner) throws Exception {
//        Account result = printThis(scanner, "예금");
//        if (result == null) {
//            System.out.println("에러: 계좌가 존재하지 않습니다.");
//            return;
//        }
//        if (this.accountService.giveMoney(result.getAcNum(), result.getMyMoney())) {
//            System.out.println("결과: 예금이 성공되었습니다.");
//        }
//    }
//
//    public void pullMoney(Scanner scanner) throws Exception {
//        Account result = printThis(scanner, "출금");
//        if (result == null) {
//            System.out.println("에러: 계좌가 존재하지 않습니다.");
//            return;
//        }
//        if (this.accountService.takeMoney(result.getAcNum(), result.getMyMoney())) {
//            System.out.println("결과 : 출금이 성공되었습니다.");
//        }
//        else {
//            System.out.println("에러 : 출금에 실패하였습니다.");
//        }
//    }
//
//    private Account printThis(Scanner scanner, String title) {
//        System.out.println("--------------");
//        System.out.println(title);
//        System.out.println("--------------");
//
//        System.out.print("계좌번호 : ");
//        String acNum = scanner.nextLine();
//        Account account = this.accountService.chooseAccount(acNum);
//        if (account == null) {
//            return null;
//        }
//        System.out.print(title + "액: ");
//        String myMoney = scanner.nextLine();
//        int money = Integer.parseInt(myMoney);
//
//        return new Account("강준서", acNum, money);
//    }
//
//    public static void main(String[] args) {
//        try {
//            BankApplication bank = new BankApplication();
//            Scanner scanner = new Scanner(System.in);
//            boolean run = true;
//            while(run) {
//                bank.head();
//                int select = bank.getChoice(scanner);
//                switch (select) {
//                    case 1:
//                        bank.addAccount(scanner);
//                        break;
//                    case 2:
//                        bank.printAccount();
//                        break;
//                    case 3:
//                        bank.pushMoney(scanner);
//                        break;
//                    case 4:
//                        bank.pullMoney(scanner);
//                        break;
//                    case 5:
//                        System.out.print("정말로 종료하시겠습니까? Y N : ");
//                        String answer = scanner.nextLine();
//                        if(answer.equalsIgnoreCase("Y")) {
//                            System.out.println("프로그램을 종료합니다.");
//                            run = false;
//                        }
//                        else if(answer.equalsIgnoreCase("N")) {
//                            continue;
//                        }
//                        else {
//                            System.out.println("잘못된 입력입니다. 계속하려면 아무 키나 누르세요.");
//                            scanner.nextLine();
//                        }
//                        break;
//
//                    default:
//                        System.out.println("잘못된 입력입니다.");
//                        break;
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//    }
//
//}