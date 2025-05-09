package ch04;

public class RandomNumber {
  public static void main(String[] args){
    // API, Math.random() double 타입 리턴, 0.000000~0.999999. 절대 1이 나올 수 없음
    System.out.println(Math.random());

    double value = 0.99999;
    double result = value * 10.0; // 9.9999
    System.out.println("result : " + result);

    int intResult = (int)result; // 강제 형변환, 명시적 형변환 9.9999 -> 9로 변환
    System.out.println("insResult : " + intResult);

    double value2 = 0.00002;
    System.out.println("value2: " + (int)(value2 * 10.0));

    System.out.println((int)(Math.random() * 10.0)); // 0 ~ 9
  }
}
