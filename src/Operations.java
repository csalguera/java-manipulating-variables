public class Operations {
  public static void main(String[] args) {
    int expression1 = 5 % 2 - (4 * 2 - 1);

    // (): 4 * 2 = 8
    // 5 % 2 - (8 - 1)
    // (): 8 - 1 = 7
    // 5 % 2 - 7
    // %: 5 % 2 = 1
    // 1 - 7 = -6

    System.out.println(expression1);
    
    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
    // System.out.println(expression2);
    int expression3 = 5 * 4 % 3 - 2 + 1;
    // System.out.println(expression3);
  }
}