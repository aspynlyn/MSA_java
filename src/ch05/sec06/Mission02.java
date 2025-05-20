package ch05.sec06;

import java.util.Arrays;

public class Mission02 {
  public static void main(String[] args){
    int[] arr = new int[2];
    arr[0]=10;
    arr[1]=20;
    //-----------------------(이 공간안에서 10, 20 리터럴 사용 금지



    int num=arr[1];
    arr[1]=arr[0];
    arr[0]=num;


    //-----------------------

    System.out.println(Arrays.toString(arr));
    // [20, 10]
  }
}
