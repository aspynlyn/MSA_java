package ch04;

public class Mission04 {
  public static void main(String[] args) {
    int score = (int) (Math.random() * 201.0);


      if (score > 89 && score < 101) {
      System.out.println("A학점");
    } else if (score > 79 && score < 90) {
      System.out.println("B학점");
    } else if (score > 69 && score < 80) {
      System.out.println("C학점");
    } else if (score < 70) {
      System.out.println("D학점");
    }else if(score > 100 || score < 0){
      System.out.println("측정불가");
    }

    if(score > 100 || score < 0){ // 0미만 혹은 100초과인 경우
    System.out.println("측정불가");
    }else if (score > 89) { // 90 ~ 100
      System.out.println("A학점");
    } else if (score > 79) { // 80 ~ 89
      System.out.println("B학점");
  } else if (score > 69) { // 70 ~ 79
      System.out.println("C학점");
    } else{ // ~ 69
      System.out.println("D학점");
    }
    // 총 범위에서 점수가 인식 가능한 범위로 먼저 거르면 그 뒤로는 연산이 위의 식처럼 최대 최소를 다 지정할 필요 없이 차례대로 최소만 지정해줘도 돼서 식이 간편하고 일처리가 빨라짐
  }
}
