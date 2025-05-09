/* class 이름은 Pascal Case로 작성 나머지는 다 Camel Case로 작성 반드시 지킬 것
 class 이름은 파일 이름과 무조건 같아야함 만약 바꾸고싶으면 shift+F6으로 바꿔
 메인 메소드는 굉장이 중요한 메소드 프로그램의 시작점
 메소드의 정의 : 메소드를 만드는 것
 메소드 호출 : 메소드를 사용하는 것
 메소드가 호출되면 메소드 내용이 한 줄 한 줄씩 실행됨
소괄호가 있으면 메소드
파라먼트
 */
public class Main {
  public static void main(String[] args) { // 메소드의(Method) 메인 메소드
    System.out.printf("Hello and welcome!"); // 콘솔에 내용을 출력해라

    for (int i = 1; i <= 5; i++) { // 반복문. for-loop

      System.out.println("i = " + i);
    }
  }
}
