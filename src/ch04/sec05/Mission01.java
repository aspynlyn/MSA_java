package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    /*
    합계를 구할 수를 입력하세요(종료 0)
    >> 100
    >> 200
    >> 300
    >> 400
    >> 500
    >> 0
    합계 : 1000
     */


    int sum = 0;

    System.out.println("합계를 구할 숫자를 입력하세요. (종료: 0) ");

    while (true) {
      System.out.print(">>");
      int input = scanner.nextInt();


      if (input == 0) {
        System.out.println("합계: " + sum);
        break;
      } else {
        sum += input;
      }
    }
    scanner.close();

  }
}

