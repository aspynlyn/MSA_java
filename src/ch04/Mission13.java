package ch04;

public class Mission13 {
  public static void main(String[] args) {
    int star = (int)(Math.random() * 6) + 3;
    System.out.println("star: " + star);

    for(int i = 1; i <= star; i++){
      for(int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
