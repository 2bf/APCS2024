# 1.6.2 – Row Strings

Objective: To continue to develop skills working with 2-D arrays. To begin to understand the nature of 2-D arrays as "arrays of arrays".

What you need to do: Write and test a method

```//precondition: characters contains at least 1 row and 1 column
public static String[] rowStrings(char[][] characters)
```

which concatenates the characters in each row of the array and returns an array of Strings, consisting of the rows of the original array. Let's go to an example. If this code appeared in a method (such as main):

```char[][] letters = {
    {'G','r','e','a','t'},
    {'W','h','i','t','e'},
    {'S','h','a','r','k'}
};
String[] words = rowStrings(letters);
```

then the variable ```words``` would point to the array ```["Great","White","Shark"];```

Note: using a constructor and understanding the nature of 2-D arrays can result in this method being done in a very small number of lines.

For the advanced version, if a row contains a space character ```' '```, that row should be treated as multiple words and should be put into separate elements in the returned array. Note that this version is considerably longer than the basic version. You may assume that any spaces will not occur in either the first or last column of the array.

For example, if this code were in the ```main``` method:
```
char[][] letters = {
    {'G','r','e','a','t'},
    {'W','h','i','t','e'},
    {'S','h','a','r','k'},
    {'D','o',' ','d','o'},
    {'D','o',' ','d','o'},
    {'D','o',' ','d','o'}
};
String[] words = rowStrings(letters);
```
then the variable words would point to the array
```
["Great","White","Shark","Do","do","Do","do","Do","do"]
```

Turn in: your ```.java``` file, complete with ```rowStrings``` and ```main``` methods.