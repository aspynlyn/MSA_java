package ch03.sec07;

public class LogicalOperatorExample {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 0;

    System.out.printf("%d > %d : %b\n", num1, num2, num1 > num2);
    System.out.printf("5 > 0 && 5 > 2 : %b\n", 5 > 0 && 5 > 2);
    // &&연산자(and) 모든 식이 다 true여야 true 도출. 하나라도 false면 false


    System.out.printf("5 > 0 || 5 < 2 : %b\n", 5 > 0 || 5 < 2);
    // ||연산자(or) 모든 식이 다 false여야 false 도출.하나라도 true면 true

    System.out.printf("!(5 < 0 || 5 < 2) : %b\n", !(5 < 0 || 5 < 2));
    System.out.printf("!false : %b\n", !false);
  }
}
