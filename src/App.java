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
    // int divideByZero = 100 / 0;
    // System.out.println(divideByZero);

    // Modulo -------------------------------------------------------------------------------------------------------------------
    // The % modulo operator gives us the remainder after two numbers are divided
    int cookiesBaked = 10;
    int cookiesLeftover = 10 % 3;
    System.out.println(cookiesLeftover);
    // cookiesLeftover holds 1
    // 1 is the remainder after cookies are handed out in batches of 3
    
    // modulo helps determine if a number is even or odd
    System.out.println(7 % 2);
    // 1 is leftover, therefore odd
    System.out.println(8 % 2);
    // no remainder, therefore even
    System.out.println(9 % 2);
    // 1 leftover again, odd

    // Compound Assignment and Operators -------------------------------------------------------------------------------------------------------------------
    // we can adjust the value of variables
    int numCupcakes = 12;
    System.out.println(numCupcakes);
    // numCupcakes is 12
    // numCupcakes = numCupcakes + 8;
    // System.out.println(numCupcakes);
    // numCupcakes is now 20
    
    // we had to write our variable name twice with the + operator
    // we can use the compound += assignment operator to shorten the syntax
    numCupcakes += 8;
    System.out.println(numCupcakes);
    // numCupcakes is 20; just like using the + operator
    
    // assignment operator can be used on all arithmetic operators
    // Addition ------- +=
    // Subtraction ---- -=
    // Multiplication - *=
    // Division ------- /= 
    // Modulo --------- %=
    
    int moduloNum = 15;
    moduloNum %= 3;
    System.out.println(moduloNum);

    // Order of Operations -------------------------------------------------------------------------------------------------------------------
    // if multiple operators are placed inside a single expression, which operation would evaluate first?
    int num = 5 * (10 - 4) + 4 / 2;
    // Subtraction because it is in parentheses
    
    // Operations that share priority/precedence are evaluated from left-to-right
    // The order is:
    // 1. Parentheses
    // 2. Exponents
    // 3. Modulo/Multiplication/Division
    // 4. Addition/Subtraction
    
    // dissect the previous expression:
    // 5 * (10 - 4) + 4 / 2
    // Parentheses is first, 10 - 4 = 6
    // 5 * 6 + 4 / 2
    // Multiplication and Division have priority over Addition
    // Multiplicaiton is evaluated first because it's to the left of Division
    // 5 * 6 = 30
    // 30 + 4 / 2
    // Division has priority
    // 4 / 2 = 2
    // 30 + 2 = 32
    System.out.println(num);
    // evaluates to 32, like mentioned above

    // Greater Than or Less Than -------------------------------------------------------------------------------------------------------------------
    // Java has relational operators for numeric data types that make boolean comparisons
    // these include < (less than) and > (greater than)

    double newerBalance = 20000.1;
    double amountToWithdraw = 5000.1;
    System.out.println(amountToWithdraw < newerBalance);
    // prints true because amountToWithdraw value is less than newerBalance value

    double myBalance = 200.5;
    double costOfBuyingNewLaptop = 1000.5;
    boolean canBuyLaptop = myBalance > costOfBuyingNewLaptop;
    System.out.println(canBuyLaptop);
    // prints false because myBalance value is less than costOfBuyingNewLaptop
  }
}