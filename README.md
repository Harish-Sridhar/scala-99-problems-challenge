# scala-99-problems-challenge
This is a fun project to solve the scala-99-problem

# Credit
The credit to this project goes to the `Phil Gold` or others who came up with problems and solutions.  
Following is the original link.  
http://aperiodic.net/phil/scala/s-99/

# Overview

These are an adaptation of the Ninety-Nine Prolog Problems written by Werner Hett at the Berne University of Applied Sciences in Berne, Switzerland. I (Phil Gold) have altered them to be more amenable to programming in Scala. Feedback is appreciated, particularly on anything marked TODO.

The problems have different levels of difficulty. Those marked with a single asterisk (*) are easy. If you have successfully solved the preceeding problems you should be able to solve them within a few (say 15) minutes. Problems marked with two asterisks (**) are of intermediate difficulty. If you are a skilled Scala programmer it shouldn't take you more than 30-90 minutes to solve them. Problems marked with three asterisks (***) are more difficult. You may need more time (i.e. a few hours or more) to find a good solution. The difficulties were all assigned for the Prolog problems, but the Scala versions seem to be of roughly similar difficulty.

Your goal should be to find the most elegant solution of the given problems. Efficiency is important, but clarity is even more crucial. Some of the (easy) problems can be trivially solved using built-in functions. However, in these cases, you learn more if you try to find your own solution.


## Working with lists

In Scala, lists are objects of type List[A], where A can be any type. Lists are effective for many recursive algorithms, because it's easy to add elements to the head of a list, and to get the tail of the list, which is everything but the first element.

The solutions to the problems in this section will be in objects named after the problems (P01, P02, etc.). You can compile the source files with scalac and thereafter use import to bring the functions into scope. Some of the problems can be solved easily by using imported solutions to previous problems.

In many cases, there's more than one reasonable approach. The files linked here may include multiple solutions, with all but one commented out. They'll also indicate whether there's a builtin method in Scala that accomplishes the task.

###P01 (*) Find the last element of a list.
Example:
```scala
scala> last(List(1, 1, 2, 3, 5, 8))
   res0: Int = 8
```

### P02 (*) Find the last but one element of a list.
Example:
```scala
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5

```

### P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:
```scala
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```

### P04 (*) Find the number of elements of a list.
Example:
```scala
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```

### P05 (*) Reverse a list.
Example:
```scala
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```