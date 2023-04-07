## Java Manipulating Variables

## Guessing Game

```
public class GuessingGame {
  public static void main(String[] args) {   
    int mystery1 = 8 + 6;
    int mystery2 = 8 - 6;
  }
}
```

In the file GuessingGame.java, we have defined two integers mystery1 and mystery2.

We will talk about these operators, among others, in the rest of the lesson.

Use System.out.println() to print the variable that holds a value of 2.

## PlusAndMinus

```
public class PlusAndMinus {
  public static void main(String[] args) {
    int zebrazInZoo = 8;
    int giraffesInZoo = 4;
  }
}
```

Create an int variable called animalsInZoo that holds the amount of zebras plus the amount of giraffes at the zoo.

Then, print your animalsInZoo variable.

Two of the zebras have been traded to a neighboring rival zoo. Subtract 2 from the number of zebras and store the result in a variable called numZebrasAfterTrade.

Then, print the numZebrasAfterTrade variable!

## Multiplication and Division

```
public class MultAndDivide {
  public static void main(String[] args) {
    double subtotal = 30;
    double tax = 0.0875;
  }
}
```

In main(), there is a variable called subtotal, which represents the subtotal of an amount to pay on a bill, and a variable called tax, which represents the tax rate that will be applied to that subtotal.

Create a double variable, total, that holds subtotal plus the product of subtotal and tax.

Print the total variable!

There were 4 people who bought this meal together and want to split the cost.

Create a double variable called perPerson that holds total divided by 4.

Print the perPerson variable!

### Modulo

```
public class Modulo {
  public static void main(String[] args) {
    int students = 26;
  }
}
```

You are trying to split up students into groups of 3. How many students will be left out once the groups are made?

Create a variable called leftOut that holds the modulo of students and 3. Then, print the variable!

## BakeSale

```
public class BakeSale {
	public static void main(String[] args) {   
		int numCookies = 17;


    // Add your code above
    System.out.println(numCookies);
	}
}
```

You are in charge of keeping track of how many cookies there are at the bake sale. This value is represented by the variable numCookies.

A customer comes and buys 3 cookies. Use the appropriate compound assignment operator to reflect this change.

Another customer buys half of the remaining cookies.

Use the appropriate compound assignment operator to reflect this change.

## Operations

```
public class Operations {
	public static void main(String[] args) { 

    int expression1 = 5 % 2 - (4 * 2 - 1);
    // System.out.println(expression1);

    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
    // System.out.println(expression2);

    int expression3 = 5 * 4 % 3 - 2 + 1;
    // System.out.println(expression3);

	}
}
```

Take a look at the expressions in Operations.java.

Solve for the value of each of the expressions on your own.

To find out if your calculations are right, uncomment the print statements and run the code.

## GreaterLessThan

```
public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
	}
}
```

Print the expression that checks if the amount of credits you have earned, creditsEarned, is greater than the number of credits you need to graduate, creditsToGraduate.

Create a variable called creditsAfterSeminar that holds the amount of credits earned after taking a seminar, which is worth creditsOfSeminar credits. creditsAfterSeminar should be the sum of creditsEarned and creditsOfSeminar.

Print out whether creditsToGraduate is less than creditsAfterSeminar.