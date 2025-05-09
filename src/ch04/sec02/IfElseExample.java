package ch04.sec02;

public class IfElseExample {
  public static void main(String[] args){
    boolean result = true;
    result = false;

    int score = 93;

    if(score >= 90){
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A입니다.");
      // 소괄호 안에는 boolean타입만 들어올 수 있음
    }else{
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B입니다");
      // if else는 if문으로 묶어진 하나의 조건문
    }
  }
}
