package ch04;

public class Mission14 {
  public static void main(String[] args){
    int star = (int)(Math.random() * 6.0) + 4;
    System.out.println("star: " + star);

    for(int i = 1; i<=star; i++){
      int blank = star - i;
      for(int j = 1; j <= blank; j++){
        System.out.print(" ");
      }
      for(int k=1; k<=i; k++){
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("------------");

    int totalStar = star * star;
    int line = 1;
    int printedChar = 0;

    for (int i = 1; i <= totalStar; i++) {
      if (printedChar < star - line) {
        System.out.print(" ");
      } else if (printedChar < star) {
        System.out.print("*");
      }

      printedChar++;

      if (printedChar == star) {
        System.out.println();
        line++;
        printedChar = 0;

        if (line > star) break;
      }
    }

    System.out.println("------------");

    for(int i=star; i>0; i--){
      for(int j=1; j<=star; j++){
        System.out.print(j < i ? " " : "*");
      }
      System.out.println();
    }
  }
}
