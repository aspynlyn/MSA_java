package ch04.sec03;

public class StringEqualStudy {
  public static void main(String[] args) {
    // p.158
    // !!!!!!!!!!!중요!!!!!!!!!!!!!

    String str1 = "hello";
    String str2 = "hello"; // 값이 같으면 변수의 이름이 달라도 같은 주소값을 줌

    System.out.printf("1.%s == %s : %b\n", str1, str2, str1 == str2); // String은 주소값을 저장하는 타입이기 때문에 == 비교를 하면 주소값끼리 비교함
    System.out.printf("2.%s == %s : %b\n", str1, str2, str1.equals(str2)); // 값비교할 때는 .equals() 사용

    String str3 = new String("hello");
    String str4 = new String("hello"); // new를 붙이면 무조건 새로운 주소값을 씀

    System.out.printf("1.%s == %s : %b\n", str3, str4, str3 == str4);
    System.out.printf("2.%s == %s : %b\n", str3, str4, str3.equals(str4));
  }


}
