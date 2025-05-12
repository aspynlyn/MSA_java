package ch04;

public class Mission03 {
  public static void main(String [] args){
    int value = (int)(Math.random() * 100.0) + 1;
    // 1 ~ 100사이의 랜덤값 나오게
    if(value % 2 == 0){
      System.out.printf("%d는(은) 짝수입니다.\n", value );
    }else{
      System.out.printf("%d는(은) 홀수입니다.\n", value );
    }

    String oddEven = "홀";
    if(value % 2 == 0){
      oddEven = "짝";
    }
    System.out.printf("%d는(은) %s수입니다.\n", value, oddEven);
    // 개발자들은 코드가 겹치는 걸 안좋아함

    System.out.printf("%d는(은) %s수입니다.\n", value, value % 2 == 0 ? "짝" : "홀"); // 삼항식 활용
  }
}
