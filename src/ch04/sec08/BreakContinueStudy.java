package ch04.sec08;

public class BreakContinueStudy {
  public static void main(String[] args){
    for(int i = 0; i<10; i++){
      if(i==5){
        break;
        // 반복문 박살내고 바로 빠져나옴
      }
      System.out.println(i);
    }

    System.out.println("-----------------");

    for(int j = 0; j<10; j++){
      if(j==5){
        continue;
        // 아래 코드가 실행이 안되고 바로 증감식으로 감(스킵)
      }
      System.out.println(j);
    }
  }
}
