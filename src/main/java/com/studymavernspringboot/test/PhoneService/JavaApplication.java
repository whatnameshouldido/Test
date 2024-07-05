//package com.studymavernspringboot.test.PhoneService;
//
//import java.util.Scanner;
//
//public class JavaApplication {
//    public static void main(String[] args) {
//        if ( args.length < 2 ) {
//            System.out.println("Error : You need program arguments (-j/-t) (filename) !");
//            return;
//        }
//        Console console = new Console();
//        Scanner input = new Scanner(System.in);
//        boolean run = true;
//
//        try {
//            console.setPhoneBookService(new PhoneBookServiceImple(args[0], args[1]));
//        } catch (Exception e) {
//            throw new RuntimeException("Error : " + e.getMessage());
//        }
//        while (run) {
//            try {
//                console.printTitle();
//                int choice = console.getChoice(input);
//                switch (choice) {
//                    case 1:
//                        console.insert(input);
//                        break;
//                    case 2:
//                        console.printList();
//                        break;
//                    case 3:
//                        console.update(input);
//                        break;
//                    case 4:
//                        console.delete(input);
//                        break;
//                    case 5:
//                        console.searchByName(input);
//                        break;
//                    case 6:
//                        console.searchByGroup(input);
//                        break;
//                    case 7:
//                        console.searchByPhone(input);
//                        break;
//                    case 8:
//                        console.searchByEmail(input);
//                        break;
//                    case 9:
//                        run = false;
//                        System.out.println("프로그램을 종료합니다..."); //+프로그램 종료 시 프로그램을 종료합니다 출력
//                        break;
//                    default:
//                        System.out.println("!!! 잘못된 입력입니다. !!!");
//                        break;
//                }
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//}