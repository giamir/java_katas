# Java Katas [![Build Status](https://travis-ci.org/giamir/java_katas.svg?branch=master)](https://travis-ci.org/giamir/java_katas)

### Triangle Exercises
##### Easiest exercise ever

Print one asterisk to the console.<br>
Example:
```
*
```

##### Draw a horizontal line

Given a number n, print n asterisks on one line.<br>
Example when n=8:
```
********
```

##### Draw a vertical line

Given a number n, print n lines, each with one asterisks. <br>
Example when n=3:
```
*
*
*
```

##### Draw a right triangle

Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.).<br>
Example when n=3:
```
*
**
***
```

### Diamond Exercises
##### Isosceles Triangle

Given a number n, print a centered triangle.<br>
Example for n=3:
```
  *
 ***
*****
```

##### Diamond

Given a number n, print a centered diamond.<br>
Example for n=3:
```
  *
 ***
*****
 ***
  *
```

##### Diamond with Name

Given a number n, print a centered diamond with your name in place of the middle line.<br>
Example for n=3:
```
  *
 ***
Giamir
 ***
  *
```

### FizzBuzz Exercise

FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to certain rules.

Create a FizzBuzz() method that prints out the numbers 1 through 100.<br>
Instead of numbers divisible by three print "Fizz".<br>
Instead of numbers divisible by five print "Buzz".<br>
Instead of numbers divisible by three and five print "FizzBuzz".

Sample Output:
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

### Prime Factors Exercise
Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.

For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.
