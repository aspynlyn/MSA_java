package ch04.sec03;

import java.util.Random;

public class Mission01 {
  public static void main(String[] args){
    int month = (int)(Math.random() * 16.0);

    // switch 이용하여
    // month값이 12, 1, 2라면 "겨울"
    // month값이 3, 4, 5라면 "봄"
    // month값이 6, 7, 8라면 "여름"
    // month값이 9, 10, 11라면 "가을"
    // 나머지는 "해당 계절이 없습니다"

    System.out.println("month : " + month);

    switch (month){
      case 12:
      case 1:
      case 2:
        System.out.println("겨울");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("봄");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("여름");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("가을");
        break;
      default:
        System.out.println("해당 계절이 없습니다");
    }

    switch (month){
      case 12, 1, 2 :
        System.out.println("겨울");
        break;
        case 3, 4, 5 :
        System.out.println("봄");
          break;
        case 6, 7, 8 :
        System.out.println("여름");
          break;
        case 9, 10, 11 :
        System.out.println("가을");
          break;
      default:
        System.out.println("해당 계절이 없습니다");
    }
    // 원래는 첫번째처럼 해야하는데 업데이트 되면서 case의 값을 ,로 여러개 설정할 수 있게 됨

  }
}
