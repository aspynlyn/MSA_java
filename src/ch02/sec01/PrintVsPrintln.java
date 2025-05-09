package ch02.sec01;

public class PrintVsPrintln {
  public static void main(String[] args){
    //print
    System.out.print("안녕");
    System.out.print("안녕");
    System.out.print("안녕");

    System.out.println("---------------");

    //println
    System.out.println("hi");
    System.out.println("hi");
    System.out.println("hi");
    // println은 개행처리를 해줌

    //print + 개행(이스케이프 문자 \n)
    System.out.print("안녕\n");
    System.out.print("안녕\n");
    System.out.print("안녕\n");
    /* System.out.print("안녕\\n");
    System.out.print(\"안녕\" \n");
    \로 ""같은 것들을 문자로 나타낼 수 있음
     */

    //printf
    int age = 22;
    String name = "홍길동";
    float height = 172.5f;
    // age, name, height 변수를 활용하여 아래처럼 출력시켜주세요
    // 제 이름은 홍길동이고 나이는 22살이며 키는 172.5입니다

    System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살이며 키는 " + height + "cm입니다.");
    System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.1fcm입니다.\n", name, age, height);
    // s:문자열 d:정수 f:실수 %s와 %d를 자주 씀
  }
}
