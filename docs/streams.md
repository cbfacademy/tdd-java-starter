# Java Streams Exercises

#### <u>Exercise 1</u>

Given a list of words, create another list that contains only the odd-length words from the first list, converted to uppercase.

```java
final List<String> words = 
      List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

// Determine whether a given number is odd
final Predicate<Integer> isOdd = number -> number % 2 != 0;

// Determine whether a given word has an odd number of characters
final Predicate<String> oddLengthed = word -> isOdd.test(word.length());

final List<String> oddLengthedWords = 
        words.stream()
                .filter(oddLengthed)
                .map(String::toUpperCase)
                .toList();
```


#### <u>Exercise 2</u>

Given a list of words, create another list that contains the longest words from the input list.

```java
final List<String> words = 
      List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel");

// Determine the length of the longest word in the list
final int maxLength = 
        words.stream()
                .mapToInt(String::length)
                .max()
                .getAsInt();

final List<String> longestWords =
        words.stream()
                .filter(word -> word.length() == maxLength)
                .toList();
```


#### <u>Exercise 3</u>

From the given list, select the list of words whose length is greater than the word’s position in the list (starting from 0).

```java
final List<String> words = 
      List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel");

final List<String> result =
        // range from 0 to size of the list (excluded)
        IntStream.range(0, words.size())
            .filter(position -> words.get(position).length() > position)
            .mapToObj(words::get)
            .toList();
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

**Solution:**

```java
final BigInteger factorial =
        // range from 1 to 21 (included)
        LongStream.rangeClosed(1, 21)
            .mapToObj(BigInteger::valueOf)
            .reduce(BigInteger.ONE, BigInteger::multiply);
```

#### <u>Exercise 5</u>

Given a stream of integers, compute separate sums, one for the even values, and the other for the odd values in the stream. Since the input is a stream, this requires making a single pass over the stream.

```java
final IntStream random = new Random(987523).ints(20, 0, 100);

final Predicate<Integer> isEven = number -> number % 2 == 0;
final Map<Boolean, Integer> sums =
        random.boxed()
            .collect(
                // partition by even (vs. odd) numbers
                Collectors.partitioningBy( 
                    isEven,
                    // adding current number to accumulated sum
                    Collectors.summingInt(number -> number) 
                )
            );

// Sum of all even numbers
final Integer evenSum = sums.get(Boolean.TRUE);

// Sum of all odd numbers (rest)
final Integer oddSum = sums.get(Boolean.FALSE);
```
