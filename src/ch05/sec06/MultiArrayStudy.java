package ch05.sec06;

public class MultiArrayStudy {
  /* 2차원 배열
  int[] arr1 = {10, 20, 30};
  int[] arr2 = {40, 50, 60};

  int[][] parent = {arr1, arr2};
 */
  public static void main(String[] args) {
    int[] arr1 = {10, 20, 30};
    int[] arr2 = {40, 50, 60};

    int[][] parent = {arr1, arr2};
    System.out.println(parent[0][1]); // 20
    System.out.println(parent[1][1]); // 50
  }
}
