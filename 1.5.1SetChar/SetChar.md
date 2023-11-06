# 1.5.1 – The setChar Method

Objective: To understand the nature of String as an array of char. To utilize the ```toCharArray``` and ```String``` constructor methods to convert between the two forms.

What you need to do: Write and test the following 2 overloaded methods:
```
//precondition: ch.length() == 1
public static String setChar(String str, int index, String ch)
public static String setChar(String str, int index, char ch)
```

This overloaded method should return a new String containing the result when the character at position
```
index in str has been replaced by ch. For example, the code:
String word = “touch”;
System.out.println(word);
word = setChar(word, 3, “g”); //calls String version
System.out.println(word);
word = setChar(word, 0, ‘r’); //calls char version
System.out.println(word);
word = setChar(word,4,(char)(word.charAt(4)–3));//calls char version
System.out.println(word);
```
would output
```
touch
tough
rough
rouge
```
If you know how the ```substring``` method works, you can use that. Otherwise, I would suggest calling the ```toCharArray()``` method on ```str``` to convert it to an array of ```char```, changing the appropriate character, and then using the ```String``` constructor to convert the array back to a new ```String``` before returning it.

Don't forget, it is quite legal to do one of your two methods by calling the other one.

Turn in: Your ```.java``` file, containing the two methods plus your ```main```.
