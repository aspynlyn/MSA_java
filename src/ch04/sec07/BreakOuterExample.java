package ch04.sec07;

public class BreakOuterExample {
  public static void main(String[] args){
    Loof:
    for(int i=2; i<=9; i++){
      for(int k=1; k<=9; k++){
        if(k==5){
          break Loof;
        }
        System.out.printf("%d x %d = %d\n", i, k, i*k);
      }
    }
  }
}
