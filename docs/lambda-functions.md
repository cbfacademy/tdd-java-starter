# Lambda Functions Exercises


#### <u>Exercise 1</u>

Write a lambda function that is a predicate, and tests whether a string is longer than 4 characters.

**<u>Solution</u>**

```java
final Predicate<String> longerThanFourCharacters = word -> word.length() > 4;
```

----

#### <u>Exercise 2</u>

Write a method reference that is a predicate, and tests whether a string is empty.

**<u>Solution</u>**

```java
final Predicate<String> emptyString = String::isEmpty;
```

----

#### <u>Exercise 3</u>

Write a lambda function that wraps a given string in parentheses.

**<u>Solution</u>**

```java
final Function<String, String> wrapInParentheses = word -> "(" + word + ")";
```

----

#### <u>Exercise 4</u>

Write a constructor reference that returns a new, empty `StringBuilder`.

**<u>Solution</u>**

```java
final Supplier<StringBuilder> newStringBuilder = StringBuilder::new;
```

----

#### <u>Exercise 5</u>

Write three lambda functions such that:

- the first function converts a null reference to an empty string
- the second function returns the length of a string
- the third function is a single function that converts null references and then gets the string’s length.

**<u>Solution</u>**

```java
final Function<String, String> unNullify = word -> word == null ? "" : word;
final Function<String, Integer> getLength = String::length;
final Function<String, Integer> composed = unNullify.andThen(getLength);
```