package ch05.sec06;

public class CopyStudy {
  public static void main(String[] args){
    //int[] arr1 = new int[10];
    int[] arr2 = {10, 20, 30};
    //int[] arr3 = new int[] {10, 20, 30};

    int[] temp = arr2;
    temp[1] = 200;
  }
}
