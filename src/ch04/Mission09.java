package ch04;

public class Mission09 {
  public static void main(String[] args){
    // 2~9사이의 랜덤값
    int dan = (int)(Math.random() * 8.0) + 2;
    System.out.println("dan: " + dan);

    for(int i = 1; i < 10; i++){
      System.out.printf("%d x %d = %d\n", dan, i, dan*i);
    }
  }
}
