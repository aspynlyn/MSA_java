package ch04.sec03;

public class SwitchStudy {
  public static void main(String[] args){
    /*
    switch에서는 관계연산자 사용 못함 오로지 == equal만 가능
    case에 맞는 값이 있으면 진입하고 break;키워드를 만날때까지 모두 실행함

    범위나 숫자 비교하는 것 같은 거엔 쓸 필요 없음

    switch(변수){
    case 값1:
        처리1;
        break;

    case 값1:
        처리1;
        break;

      [....]

    default:
        나머지처리;
        break; 가장 마지막 조건이기 때문에 있어도되고 없어도 됨

       */

    int num = 5;

    switch(num){
      case 1:
        System.out.println("1입니다");
      case 2:
      case 3:
        System.out.println("2or3입니다");
      break;
      default :
        System.out.println("값이 없습니다");
      case 4:
        System.out.println("4입니다");
    }
  }
}
