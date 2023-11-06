# 1.5.2 – Capitalize Method

Objective: to gain practice in working with various instance methods of the String class.

What you need to do: Write and test the method
```public static String capitalize(String str)```
which takes a String argument and returns a new String consisting of str, with the first character in uppercase and all the remaining characters in lowercase. Non-letter characters are unaffected. Here are some examples:

|str|value returned by capitalize(str)|
|-|-|
|"bobby"|"Bobby"|
|"ILENE"|"Ilene"|
|"yOU-tUbER"|"You-tuber"|
|"l33t haXXor"|"L33t haxxor"|
|"3-Point shot"|"3-point shot"|

Once again, this method is somewhat easier to write if you use the ```substring``` method, but can be accomplished (a bit more awkwardly, I'll admit) by using a combination of a ```for``` loop, the ```toCharArray```, ```charAt```, ```toUpperCase```, ```toLowerCase```, and ```String``` constructor methods.

Turn in: Your ```.java``` file, complete with ```main``` method.
