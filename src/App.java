public class App {
  public static void main(String[] args) {
    // Introduction -------------------------------------------------------------------------------------------------------------------
    // We can manipulate Java variables via the usage of expressions, arithmetic operators, and more
    
    // Java has built-in arithmetic operations that perform calculations on numeric values:
    
    // declare initial balance
    double balance = 20000.99;
    // declare deposit amount
    double depositAmount = 1000.00;
    // store result of calculation in our original variable
    balance = balance + depositAmount;
    System.out.println(balance);
    // balance is now 21000.99
    // balance + depositAmount is an expression
    
    // the data types of variables determine which operations can be performed to manipulate it
    
    // the data type of an expression is determined by the resulting value
    
    // an expression of two int values will evaluate to an int value
    
    // an expression of two double values will evaluate to a double value
    
    // Addition and Subtraction -------------------------------------------------------------------------------------------------------------------
    // The + operator used in the previous example added the values of balance and depositAmount
    // If we wanted to withdraw, rather than deposit, the - operator would be used
    double withdrawAmount = 500;
    balance = balance - withdrawAmount;
    System.out.println(balance);
    // balance is now 20500.99
    // assuming no amount would have been deposited, then balance would be 19500.99
    
    // addition and subtraction work with the int type values
    // if we had 60 pictures of cats and we took 24 more, we could use the following expression:
    int numPicturesOfCats = 60 + 24;
    System.out.println(numPicturesOfCats);
    // value is 84
    
    // we can use the ++ (increment operator) to increment the value by 1
    numPicturesOfCats++;
    System.out.println(numPicturesOfCats);
    // value is now 85
    
    // we can use the -- (decrement operator) to decrement the value by 1
    numPicturesOfCats--;
    System.out.println(numPicturesOfCats);
    // value is 84, once more
    
    // Multiplication and Division -------------------------------------------------------------------------------------------------------------------
    // Supposing and employer is calculating our paycheck and depositing it to our bank
    // We worked 40 hours at a rate of $15.50/hr
    // Java calculates this with the * multiplication operator
    double paycheckAmount = 40 * 15.5;
    System.out.println(paycheckAmount);
    // value is 620.00

    // If we want to see how many hours our total balance represents, we use the / division operator
    double newBalance = 20010.5;
    double hourlyRate = 15.5;
    double hoursWorked = newBalance / hourlyRate;
    System.out.println(hoursWorked);
    // value is 1291.00

    // division has different results with integers
    // the / operator does integer division. which means that any remainder is lost
    int evenlyDivided = 10 / 5;
    System.out.println(evenlyDivided);
    // value is 2
    int unevenlyDivided = 10 / 4;
    System.out.println(unevenlyDivided);
    // value is also 2 because 0.5, the remainder, is lost

    // int doesn't round the decimal, but floors it

    // if we try to divide by 0, we will get an ArithmeticException error as a result
    int divideByZero = 100 / 0;
    System.out.println(divideByZero);
  }
}