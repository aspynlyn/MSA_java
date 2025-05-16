package ch04.sec03;

import java.util.Scanner;

public class Mission03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("점수를 입력해 주세요 >");
    int score = scanner.nextInt();
    System.out.println("score: " + score);

    /*
    100점 초과이거나 0점 미만이면 "잘 못된 점수 입니다." 출력
    100점이면 A+
    98점이상이면 A+
    94이상 97이하 A0
    90이상 93이하 A-

    88점 이상 89이하 B+
    84점 이상 87이하 B0
    80점 이상 83이하 B-

    78점 이상 79이하 C+
    74점 이상 77이하 C0
    70점 이상 73이하 C-

    나머지 D
    */

    if (score > 100 || score < 0) {
      System.out.println("잘못된 점수 입니다.");
    } else if (score == 100) {
      System.out.println("학점: A+");
    } else {
      String grade = "";
      int first = score / 10;

      switch (first) {
        case 9:
          if (score >= 98) grade = "A+";
          else if (score >= 94) grade = "A0";
          else grade = "A-";
          break;
        case 8:
          if (score >= 88) grade = "B+";
          else if (score >= 84) grade = "B0";
          else grade = "B-";
          break;
        case 7:
          if (score >= 78) grade = "C+";
          else if (score >= 74) grade = "C0";
          else grade = "C-";
          break;
        default:
          grade = "D";
      }

      System.out.println("학점: " + grade);
    }

    System.out.println("----------------");


    if (score > 100 || score < 0) {
      System.out.print("잘못된 점수 입니다.");
    } else if (score == 100) {
      System.out.println("A+");
    } else if (score >= 90) {
      switch (score % 10) {
        case 8, 9:
          System.out.println("A+");
          break;
        case 4, 5, 6, 7:
          System.out.println("A0");
          break;
        default:
          System.out.println("A-");
          break;
      }
    } else if (score >= 80) {
      switch (score % 10) {
        case 8, 9:
          System.out.println("B+");
          break;
        case 4, 5, 6, 7:
          System.out.println("B0");
          break;
        default:
          System.out.println("B-");
          break;
      }
    } else if (score >= 70) {
      switch (score % 10) {
        case 8, 9:
          System.out.println("C+");
          break;
        case 4, 5, 6, 7:
          System.out.println("C0");
          break;
        default:
          System.out.println("C-");
          break;
      }
    } else {
      System.out.println("D");
    }

    System.out.println("----------------");

    String grade = "D";
    String sigh = "0";

    if(score > 100 || score < 0) {
      System.out.println("잘못된 점수입니다.");
    } else {
      switch ( score / 10 ) {
        case 10, 9: grade = "A"; break;
        case 8: grade = "B"; break;
        case 7: grade = "C"; break;
      }

      int modResult = score % 10;
      if( score < 70 ) {
        sigh = "";
      } else if(score == 100 || modResult >= 8) {
        sigh = "+";
      } else if( modResult <= 3 ) {
        sigh = "-";
      }
      System.out.printf("%s%s\n", grade, sigh);
    }


    scanner.close();
  }
}
