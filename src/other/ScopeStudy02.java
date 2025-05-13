package other;

public class ScopeStudy02 {
  public static void main(String[] args){
    int sum = 0;

    for(int i=0; i<10; i++){
       sum = 0;
      System.out.println(i);
      // for문은 반복될 때 마다 새로운 스코프가 만들어지는 개념 그래서 값이 유지되어야 하는 것들은 상위 스코프로 빼고 작업해야함.
    }
  }
}
