package ch04.sec04;

public class ForStudy {
  /*
  인덱스 초기화 : 인덱스는 반복 몇번할지 기준값
  조건식 : 인덱스 값을 비교하여 go할지 die할지 결정
  실행문 : 반복 실행하고 싶은 내용
  인덱스 증감식 : 인덱스값을 증가하거나 감소시킨다
  0~3까지의 항은 작성 필수는 아님(생략가능)

  for(0:인덱스초기화 ; 1:조건식; 3:인덱스 증감식 ){
      2:실행문
  }

  실행순서 (0번은 최초 1회만 실행)
  0 > 1 > 2 > 3
    > 1 > 2 > 3
    반복이 계속되는데 1번 조건식에서 false가 되는 순간 for문을 빠져나온다
   */
  public static void main(String[] args) {
    int i1 = 0;
    System.out.println(i1++);
    System.out.println(i1++);
    System.out.println(i1++);
    System.out.println(i1++);
    System.out.println(i1++);
    System.out.println(i1++);
    System.out.println(i1++);

    System.out.println("------------------");

    for(int i2=0; i2<7; i2++){
      System.out.println(i2);
    }
  }
}
