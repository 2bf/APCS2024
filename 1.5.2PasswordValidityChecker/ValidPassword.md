# 1.5.3 – Valid Password

Objective: to practice using ```String``` methods, working with characters, and/or using information from the Unicode character set.

What you need to do: write and test the method
```public static boolean isValidPassword(String password)```

This method should return true if the argument is a valid password according to the rules below, and false if it is not. To be valid, a password must:
- be at least 6 characters long
- be no more than 16 characters long
- not contain any spaces
- contain at least three of the following:
  - A capital letter ('A' through 'Z')
  - A lowercase letter ('a' through 'z')
  - A digit ('0' through '9')
  - Any character not fitting the previous 3 categories (i.e. punctuation)

I'm not going to give you a lot of advice on this one. The only thing that I will suggest is that, since you need all four conditions above to be true for the password to be valid, that you instead check each condition to see if the password is invalid. Since violating any of the rules above automatically makes the password invalid, you could check each condition above in turn and return false if any of them is not met. If the program gets past all your checks and has not returned false, you can safely assume the password is valid.

Turn in: your ```.java``` file, including the ```isValidPassword``` method and ```main``` method.
