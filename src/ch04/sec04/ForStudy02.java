package ch04.sec04;

public class ForStudy02 {
  public static void main(String[] args){
    for(int i=1; i<5; i++){
      System.out.println("Hello, World!");
    }

    System.out.println("------------------");

    // i<15는 수정 불가능. 나머지는 수정 가능
    // Hello, World! 콘솔에 5회씩 출력
    for(int i = 10; i < 15; i++) {
      System.out.println("Hello, World!");
    }

    System.out.println("------------------");

    // i--는 수정 불가능. 나머지는 수정 가능
    // Hello, World! 콘솔에 3회 출력
    for(int i=4; i>1; i--){
      System.out.println("Hello, World!");
    }
  }
}
