## Java Manipulating Variables

## Contents

* [GuessingGame](https://github.com/csalguera/java-manipulating-variables#guessing-game)
* [PlusAndMinus](https://github.com/csalguera/java-manipulating-variables#plusandminus)
* [MultAndDivide](https://github.com/csalguera/java-manipulating-variables#multiplication-and-division)
* [Modulo](https://github.com/csalguera/java-manipulating-variables#modulo)
* [BakeSale](https://github.com/csalguera/java-manipulating-variables#bakesale)
* [Operations](https://github.com/csalguera/java-manipulating-variables#operations)
* [GreaterLessThan](https://github.com/csalguera/java-manipulating-variables#greaterlessthan)
* [EqualNotEqual](https://github.com/csalguera/java-manipulating-variables#equalnotequal)
* [GreaterThanEqualTo](https://github.com/csalguera/java-manipulating-variables#greaterthanequalto)
* [Song](https://github.com/csalguera/java-manipulating-variables#song)
* [Zoo](https://github.com/csalguera/java-manipulating-variables#zoo)
* [Final](https://github.com/csalguera/java-manipulating-variables#final)
* [BankAccount](https://github.com/csalguera/java-manipulating-variables#bankaccount)

## Guessing Game

```
public class GuessingGame {
  public static void main(String[] args) {   
    int mystery1 = 8 + 6;
    int mystery2 = 8 - 6;
  }
}
```

In the file `GuessingGame.java`, we have defined two `integers` `mystery1` and `mystery2`.

We will talk about these operators, among others, in the rest of the lesson.

Use `System.out.println()` to `print` the `variable` that holds a `value of 2`.

## PlusAndMinus

```
public class PlusAndMinus {
  public static void main(String[] args) {
    int zebrazInZoo = 8;
    int giraffesInZoo = 4;
  }
}
```

Create an `int variable` called `animalsInZoo` that holds the amount of `zebras` `plus` the amount of `giraffes` at the zoo.

Then, `print` your `animalsInZoo` variable.

Two of the zebras have been traded to a neighboring rival zoo. `Subtract 2` from the number of `zebras` and `store` the `result` in a `variable` called `numZebrasAfterTrade`.

Then, `print` the `numZebrasAfterTrade` variable!

## MultAndDivide

```
public class MultAndDivide {
  public static void main(String[] args) {
    double subtotal = 30;
    double tax = 0.0875;
  }
}
```

In `main()`, there is a `variable` called `subtotal`, which represents the subtotal of an amount to pay on a bill, and a `variable` called `tax`, which represents the tax rate that will be applied to that subtotal.

Create a `double` `variable`, `total`, that holds `subtotal` `plus` the `product of subtotal and tax`.

`Print` the `total` variable!

There were 4 people who bought this meal together and want to split the cost.

Create a `double` `variable` called `perPerson` that holds `total` `divided by 4`.

`Print` the `perPerson` variable!

### Modulo

```
public class Modulo {
  public static void main(String[] args) {
    int students = 26;
  }
}
```

You are trying to split up students into groups of 3. How many students will be left out once the groups are made?

Create a `variable` called `leftOut` that holds the `modulo` of `students` and `3`. Then, `print` the `variable`!

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

You are in charge of keeping track of how many cookies there are at the bake sale. This value is represented by the `variable` `numCookies`.

A `customer` comes and `buys` `3 cookies`. Use the appropriate compound assignment operator to reflect this change.

Another `customer` `buys` `half` of the remaining `cookies`.

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

Take a look at the expressions in `Operations.java`.

`Solve` for the value of `each` of the `expressions` on your own.

To find out if your calculations are right, `uncomment` the `print` `statements` and `run` the `code`.

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

`Print` the `expression` that checks if the amount of `credits` you have earned, `creditsEarned`, is `greater than` the number of credits you need to graduate, `creditsToGraduate`.

Create a `variable` called `creditsAfterSeminar` that holds the amount of credits earned after taking a seminar, which is worth `creditsOfSeminar` credits. `creditsAfterSeminar` should be the `sum` of `creditsEarned` and `creditsOfSeminar`.

`Print` out whether `creditsToGraduate` is `less than` `creditsAfterSeminar`.

## EqualNotEqual

```
public class EqualNotEqual {
  public static void main(String[] args) {
    int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;
  }
}
```

You have unearthed two unlabeled albums, record A and record B.

To see if these are the same album, you’re going to compare the number of songs on each one, and the total length of the albums.

First, `create` a `variable` called `sameNumberOfSongs` that stores `whether` the two `albums` have the `same` `number of songs`.

Now, `create` a `variable` called `differentLength` that stores the result of checking `whether` the two `album lengths` are not the `same`.

## GreaterThanEqualTo

```
public class GreaterThanEqualTo {
  public static void main(String[] args) {
    double recommendedWaterIntake = 8;
    double daysInChallenge = 30;
    double yourWaterIntake = 235.5;
  }
}
```

You have been trying to complete a 30 day challenge to drink enough water per day.

`Create` a `double` `variable` called `totalRecommendedAmount` and set it to the `product` of the recommended water intake `recommendedWaterIntake` and the amount of days in the challenge `daysInChallenge`.

`Create` a `boolean` `variable` called `isChallengeComplete` and set it to the result of checking if your intake, `yourWaterIntake`, is `at least as much` as the `totalRecommendedAmount`.

Then, `print` the `isChallengeComplete` `variable`.

## Song

```
public class Song {
  public static void main(String[] args){
    String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
    String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
  }       
}
```

We have three lines from a song in `Song.java`.

First, `print` out whether `line1` and `line2` are the `same`.

Now, `print` whether `line2` and `line3` are `equal`.

## Zoo

```
public class Zoo {
  public static void main(String[] args){
    int animals = 12;
    String species = "zebra";
  }       
}
```

In our zoo, we have a certain number of animals, stored in `animals`, of a certain species, stored in `species`.

Use `+` to make a new `String` `variable` called `zooDescription`. It should hold a `String` that looks like:

```
Our zoo has <animals> <species>s!
```

For example, if we had `5` `animals` that were all of the `species` `Masai Giraffe`, the `String` would say:

```
Our zoo has 5 Masai Girrafes!
```

`Print` out the `variable` `zooDescription`!

## Final

```
public class Final {
  public static void main(String[] args) {
    
  }
}
```

Create an `unchangeable` `double` `variable` called `pi` and set its value to `3.14`.

`Print` the value of `pi`.

On a new line, try to `change` the `value` of `pi`.

What happens when the program is run?

## BankAccount

```
public class BankAccount {
  public static void main(String[] args) {
    double balance = 1000.75;
    double amountToWithdraw = 250;
  }
}
```

To review, let’s try building some of the bank account functionality we talked about throughout the lesson.

First, `create` a new `double` `variable` called `updatedBalance`, and store `balance` with `amountToWithdraw` `subtracted` from it.

Now, you’ve decided to split your balance evenly 3 ways and give it to your three best friends.

`Create` a `double` `variable` called `amountForEachFriend` that holds your `updated balance` `divided by 3`.

Your friends each want to buy a concert ticket with the money you’ve given them. The `tickets` cost `250`!

`Create` a `boolean` called `canPurchaseTicket` and set it equal to `whether` or not `amountForEachFriend` is `at least enough` to `purchase` a concert `ticket`.

Then, use `System.out.println()` to `print` `canPurchaseTicket`.

How much money did you give your friends, anyway?

Use `+` and `System.out.println()` to `print` out:

```
I gave each friend <amountForEachFriend>...
```

with the value of `amountForEachFriend` where `<amountForEachFriend>` is.
