package ch04.sec07;

import java.util.Scanner;

public class Mission01 {
  public static void main(String[] args) {
    /*
    (프린트 반복 실행)
    ---------------------------------
            1.예금 | 2.출금 | 3.잔고 | 4.종료
            ---------------------------------
            선택 >


            (실행 예시)
    선택 > 1 (엔터)
            예금액 > 10000 (엔터)

            [[ 프린트 ]]

    선택 > 2 (엔터)
            출금액 > 2000 (엔터)

            [[ 프린트 ]]

    선택 > 3 (엔터)
            잔고 > 8,000원

            [[ 프린트 ]]

    선택 > 4 (엔터)

            프로그램 종료
     */

    Scanner scanner = new Scanner(System.in);
    int balance = 0;

    while (true) {
      System.out.println("---------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("---------------------------------");
      System.out.print("선택 > ");

      int choice = scanner.nextInt();

      if (choice == 1) {
        System.out.print("예금액 > ");
        int deposit = scanner.nextInt();
        balance += deposit;
      } else if (choice == 2) {
        System.out.print("출금액 > ");
        int withdraw = scanner.nextInt();
        if (withdraw > balance) {
          System.out.println("잔액이 부족합니다");
        } else {
          balance -= withdraw;
        }
      } else if (choice == 3) {
        System.out.printf("현재잔액 > %,d원\n", balance);
      } else if (choice == 4) {
        System.out.println("종료");
        break;
      } else {
        System.out.println("올바른 번호를 입력해주세요");
      }
    }
    scanner.close();
  }
}