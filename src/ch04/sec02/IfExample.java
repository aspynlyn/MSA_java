package ch04.sec02;

public class IfExample {
  public static void main(String[] args){
    boolean result = true;
    result = false;

    int score = 93;

    if(score >= 90){
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A입니다.");
      // 소괄호 안에는 boolean타입만 들어올 수 있음
    }
    if(score < 90){
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B입니다");
    }
    // if문 두개는 서로 영향을 미치지 않음 각각의 조건문임
  }
}
