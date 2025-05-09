package ch02.sec01;

public class VariableExchangeExample {
  public static void main(String[] args){
    int x = 3, y = 5;
    System.out.println("x: " + x + ", y: " + y); // x: 3, y: 5

    int z;
    z = x;
    x = y;
    y = z;

    System.out.println("x: " + x + ", y: " + y);
    // 기존의 x=3과 y=5에서 x와 y의 값을 바꾸는 것 스와핑이라고 함 새로운 공간을 하나 만들어 기존의 값 하나를 보관하고 기존의 값을 복사하고 보관된 값을 다시 옮겨오는 과정
  }
}
