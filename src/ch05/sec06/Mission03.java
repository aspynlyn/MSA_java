package ch05.sec06;

import java.util.Arrays;

public class Mission03 {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50, 60};
    System.out.println(Arrays.toString(arr));
    System.out.println("----------");
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {

      System.out.print(arr[i]);
      if (i != arr.length - 1) {
        System.out.print(", ");
      }

      if(i == 0 ) {
        System.out.printf("[%d",arr[i]);
      } else {
        System.out.printf(", %d",arr[i]);
      }

      System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));

    }
    System.out.print("]");

    System.out.printf("[%d", arr[0]);
    for (int i = 1; i < arr.length; i++){
      System.out.printf(", %d", arr[i]);
    }
    System.out.print("]");
  }
}