package ch05.sec06;

public class Mission04 {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    // arr배열이 가지고 있는 숫자 모두를 더한 값 출력

    int sum = 0;
    for(int i = 0; i< arr.length; i++){
      sum += arr[i];
    }
    System.out.println(sum);
  }
}
