package ch04;

public class Mission08 {
  public static void main(String[] args) {
    int sum = 0;


    // 1부터 100까지 모두 더한 값
    for(int i = 1; i < 101; i++){
      sum += i;
    }

    System.out.println("sum: " + sum);

  }
}
