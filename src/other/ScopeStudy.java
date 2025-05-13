package other;

public class ScopeStudy {
  /*
  스코프: 변수가 살아있는 범위 (LifeCycle)
          변수가 선언이 되면 자기 자신을 감싸고 있는 중괄호 안에서만 살아있음
          즉, 중괄호를 벗어나면 죽음 효력 사라짐
   */
  public static void main(String[] args){
    int num = 10;
    System.out.println(num);

    for(int i=0; i<10; i++){
      // int i=10; 같은 스코프 안에서의 같은 이름의 변수 선언은 한 번만 하면 됨
    }
   // System.out.println(i); // 변수 i가 선언 된 스코프를 벗어난 위치이기 때문에 값을 불러올 수 없음
  }
}
