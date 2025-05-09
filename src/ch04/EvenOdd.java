package ch04;

public class EvenOdd {
  public static void main(String[] args) {
    // 홀, 짝 + 랜덤숫자

    int num = 87;
    // mod %연산자 사용. 나머지값 구함
    System.out.printf("%d / %d = %d\n", num, 5, num / 5);
    System.out.printf("%d %% %d = %d\n", num, 5, num % 5);

    // mod를 활용해 짝, 홀 구분

    if(num % 2 == 0){
      System.out.printf("%d는(은) 짝수입니다.\n", num);
    }else{
      System.out.printf("%d는(은) 홀수입니다.\n", num);
    }
    System.out.println("됐지?");
  }
}
