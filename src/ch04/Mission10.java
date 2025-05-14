package ch04;

public class Mission10 {
  public static void main(String[] args){
    int star = (int)(Math.random() * 4.0) + 3;
    System.out.println(star);

    for(int i=0; i<star; i++){
      for(int k=0; k<star; k++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
    System.out.println("------------");

    int star2 = star * star;

    for (int i = 1; i <= star2; i++) {
      System.out.print("*");
      if (i % star == 0) {
        System.out.println();
      }
    }
  }
}
