package ch02.sec01;

public class VariableUseExample {
  public static void main(String[] args){
    int hour = 3; // 변수 선언과 초기화(변수에 처음 값이 들어가는 것) 동시에 가능
    int minute = 5;
    System.out.println(hour + "시간 " + minute + "분");
      /* (1) hour + "시간"
      (2) 3 + "시간"
      (3) "3"(자동 형변환) + "시간 "
      (4) "3시간 "
      (5) "3시간 " + minute
      (6) "3시간 " + 5
      (7) "3시간 " + "5"
      (8) "3시간 5"
      (9) "3시간 5" + "분"
      (10) "3시간 5분" */

    int totalMinute = minute + hour * 60; // 185
    System.out.println("총 " + totalMinute + "분");
    자바 공부 화이팅 열심히 하도록
  }

}
