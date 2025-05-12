package ch04;

public class Mission01 {
  public static void main(String[] args) {
    // 응용력 테스트

    // 5 ~ 10 사이 랜덤값이 나올 수 있게 해주세요

    for(int i=0; i<1000; i++){
      int result = (int)(Math.random() * 6.0)+ 5;
      // (Math.random() * 6 + 5) 이렇게 5가 괄호 안에 있으면 double타입인 Math.random과 int타입인 6이 만나 6이 형변환을 하는데 5도 괄호에 들어가있으면 5도 형변환을 해야함 일이 많아짐
      // (int)(Math.random() * 6 + 5);
      //(1) random()메소드는 double값을 리턴 (0.7이 나온다는 가정하에)
      //(2) 0.7 * 6 >> 정수타입 6이 더블타입 6.0으로 자동형변환
      //(3) 0.7 * 6.0 >> 4.2
      //(4) 4.2 + 5 >> 4.2 + 5.0으로 5가 자동형변환
      //(5) 4.2 + 5.0 >> 9.2
      //(6) (int)9.2 >> 더블타입 9.2가 정수타입 9로 강제 형변환

      //(int)(Math.random() * 6.0)+ 5;
      //(1) 0.7 * 0.6 >> 4.2
      //(2) (int)4.2 >> 4로 강제형변환
      //(3) 4 + 5 >> 9

      if (result < 5 || result > 10) {
        System.out.println("틀렸음!");
        break;
      }
    }
    System.out.println(("-- 끝 --"));
  }
}
