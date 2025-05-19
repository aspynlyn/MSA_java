package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int answer = (int)(Math.random() * 100.0) + 1;
    System.out.println("answer: " + answer);
    /* 1-100사이 숫자를 입력해주세요 > 50
    Down!
            1-100사이 숫자를 입력해주세요 > 25
    Up!

            맞출때까지 반복한다.

            정답!!

    */
    System.out.println("1부터 100사이의 숫자를 입력해주세요");

    while(true){
      System.out.print(">>");
      int input = scanner.nextInt();

      if(input > answer){
        System.out.println("Down!");
      }else if(input < answer){
        System.out.println("Up!");
      }else{
        System.out.println("정답!");
        break;
      }


    }
    scanner.close();
  }
}
