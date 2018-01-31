# Hashset Challenge

## How to run

To compile and run

```
javac Hashset.java
java Hashset
```

## Challenge

In computer science, a set is an abstract data type that can store certain values, without any particular order, and no repeated values(Wikipedia). `{1,2,3}` is an example of a set, but `{1,2,2}` is not a set. Today you will learn how to use sets in java by solving this problem.

You are given _n_ pairs of strings. Two pairs `(a,b)` and `(c,d)` are identical if `a=c` and `b=d`. That also implies `(a,b)` is not same as `(b,a)`. After taking each pair as input, you need to print number of unique pairs you currently have.

Complete the code in the editor to solve this problem.

**Input Format**

In the first line, there will be an integer _T_ denoting number of pairs. Each of the next _T_ lines will contain two strings seperated by a single space.

**Output Format**

Print  lines. In the  line, print number of unique pairs you have after taking  pair as input.

**Sample Input**

```
5
john tom
john mary
john tom
mary anna
mary anna
```

**Sample Output**

```
1
2
2
3
3
```

***Explanation***

- After taking the first input, you have only one pair: (john,tom)
- After taking the second input, you have two pairs: (john, tom) and (john, mary)
- After taking the third input, you still have two unique pairs.
- After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
- After taking the fifth input, you still have three unique pairs.

This Challenge was taken from Challenge taken from https://www.hackerrank.com/challenges/java-hashset/problem