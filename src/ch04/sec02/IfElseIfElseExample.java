package ch04.sec02;

public class IfElseIfElseExample {
  public static void main(String[] args){
    boolean result = true;
    result = false;

    int score = 60;

    if(score >= 90){
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A입니다.");
      // 소괄호 안에는 boolean타입만 들어올 수 있음
    }else if(score >= 80){
      System.out.println("점수가 80~89입니다.");
      System.out.println("등급은 B입니다");
    }else{
      System.out.println("점수가 80점 미만입니다.");
      System.out.println("등급은 C입니다");
    }
    System.out.println("끝");
    // if문 안에서 true인 값을 찾으면 가장 먼저 찾은 값 하나만 실행하고 바로 if문을 빠져나옴 else가 있으면 값이 다 없을 떄 else의 값으로 출력됨
    // if, else는 한 조건문에서 한번씩만. if else는 무제한
  }
}
