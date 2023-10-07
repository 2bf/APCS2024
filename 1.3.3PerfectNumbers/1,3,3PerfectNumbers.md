# 1.3.3 – Perfect Numbers

Objective: To practice writing methods involving for loops and accumulators. To begin to consider aspects of efficiency in context.

What you need to do: Write and test the method
```public static boolean isPerfect(int n)```
which returns ```true``` if n is a perfect number and ```false``` if it is not.

A perfect number n is a positive integer which is equal to the sum of all its proper divisors, that is, all positive integers less than n that are factors of n.
For example,
- 6 is a perfect number since the proper divisors of 6 are 1, 2, and 3, and 1 + 2 + 3 = 6.
- 28 is a perfect number since 1 + 2 + 4 + 7 + 14 = 28.
- 15 is not a perfect number since 1 + 3 + 5 = 9, which is not 15.

Write a ```main``` method to test your method.

Once you have tested your ```isPerfect``` method, I want you to change your ```main``` method to print all perfect numbers less than 50,000,000. There are five of them, and I will be surprised if your program finds the fifth one during the class period. (Yes, you can look them up online, but where’s the fun in that?)

Turn in: your ```.java``` file, containing your ```isPerfect``` method and your perfect-number-searching ```main``` method.
