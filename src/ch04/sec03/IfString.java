package ch04.sec03;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class IfString {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("성별을 입력해 주세요. (w/m) >");
    String gender = scanner.next();
    System.out.println("gender: " + gender);

    if("w".equals(gender)){
      System.out.println("당신은 여자입니다.");
    }else if("m".equals(gender)){
      System.out.println("당신은 남자입니다.");
    }else{
      System.out.println("올바른 문자를 입력하세요.");
    }

    if("w".equalsIgnoreCase(gender) || "m".equalsIgnoreCase(gender)){
      System.out.println("w".equalsIgnoreCase(gender) ? "당신은 여자입니다" : "당신은 남자입니다");
    }else{
      System.out.println("성별을 입력해주세요");
    }
    // 객체를 비교하는 equals메소드는 문자열을 비교할 때 쓰는데 변수와 리터럴을 비교한다면 리터럴이 앞에 오는 게 안전함 리터럴은 null이 아닌 상수이므로 null객체에서 equals를 호출할 일이 없어 에러가 안터짐
  }
}
