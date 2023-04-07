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

    // (): 2 * 2 = 4
    // (3 + (4 - 5)) + 6 - 5
    // (): 4 - 5 = -1
    // (3 + -1) + 6 - 5
    // (): 3 + -1 || 3 - 1 = 2
    // 2 + 6 - 5
    // +: 2 + 6 = 8
    // 8 - 5 = 3

    System.out.println(expression2);
    
    int expression3 = 5 * 4 % 3 - 2 + 1;

    // *: 5 * 4 = 20
    // 20 % 3 - 2 + 1
    // %: 20 % 3 = 2
    // 2 - 2 + 1
    // -: 2 - 2  = 0
    // 0 + 1 = 1

    System.out.println(expression3);
  }
}