# Java Streams Exercises

#### <u>Exercise 1</u>

Given a list of words, create another list that contains only the odd-length words from the first list, converted to uppercase.

```java
final List<String> input = 
      List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

```


#### <u>Exercise 2</u>

Given a list of words, create another list that contains the longest words from the input list.

```java
final List<String> input = 
      List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel");
```


#### <u>Exercise 3</u>

From the given list, select the list of words whose length is greater than the word’s position in the list (starting from 0).

```java
final List<String> input = 
      List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel");
```


#### <u>Exercise 4</u>

Compute the value of factorial of 21. This value is larger than the `Long.MAX_VALUE` in Java, so you must use `BigInteger`.

The factorial of a number n is the multiplication of all whole numbers starting from n down to 1. It is given by the formula: `factorial(n) = n * factorial(n -1)`

**Examples:**

```bash
factorial(4) = 4 * 3 * 2 * 1
factorial(3) = 3 * 2 * 1
factorial(2) = 2 * 1
factorial(1) = 1

and the special case: 
    factorial(0) = 1
```

#### <u>Exercise 5</u>

Given a stream of integers, compute separate sums, one for the even values, and the other for the odd values in the stream. Since the input is a stream, this requires making a single pass over the stream.

```java
final IntStream input = new Random(987523).ints(20, 0, 100);

```
