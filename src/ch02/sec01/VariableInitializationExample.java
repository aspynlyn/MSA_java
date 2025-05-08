package ch02.sec01;

public class VariableInitializationExample {
  public static void main(String[] args){
    int value; // 변수 선언(변수명 당 최초 한번), 선언을 할 때 데이터 타입 지정
    // 변수 사용 방법 2가지 : 읽기(read), 쓰기(write)(변경)
    value = 10;
    /* 에러(예외) 종류 2가지
          - 컴파일 에러 : 실행 못함. 컴파일(컴퓨터가 코드를 해석하는 것) 자체가 불가능
          - 런타임 에러 : 샐행하는 도중에 에러 발생 */
    int result = value + 10; // value 아래의 빨간 언더라인 : 컴파일에러
    System.out.println(result);
  }
}
