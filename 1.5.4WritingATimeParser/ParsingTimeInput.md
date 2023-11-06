# 1.5.4 – Parsing Time Input

Objective: To practice parsing ```String```s and getting a feel for the amount of effort required to handle user input.

What you need to do: Write and thoroughly test the following method:
```public static int parseTime(String timeStr)```

This method should take a ```String``` representing the current time of day and return an int representing the number of minutes elapsed since midnight. For example, 3:17 PM would be represented by the number 917, since there are 917 minutes since midnight (15 hours * 60 minutes per hour = 900 minutes, plus 17 extra minutes). If the input is invalid, return -1.

The rules for what is considered a valid time ```String``` are as follows:
- Each time ```String``` must consist of a time portion possibly followed by an (optional) AM/PM portion
- Per the time portion:
    - It must be either 3 or 4 digits, with or without a colon, but with no spaces between them. If the colon is present, it must appear immediately before the final two digits.
    - The first digit (3-digit version) or two digits (4-digit version) represent the hour, which must be between 1 and 12 (AM/PM clock) or between 0 and 23 (24-hour clock).
    - The last two digits represent the minutes, which must be between 00 and 59.
    - A leading zero is permitted if the hour is one digit long.
- Per the AM/PM portion:
    - It is completely case-insensitive.
    - There can be no space between the two letters
    - If omitted, it is assumed that a 24-hour clock is being used.
- Any number of spaces at the beginning of the ```String```, the end of the ```String```, or between the time and AM/PM portions are permitted and are to be ignored.
- No space is required between the time and AM/PM portion.
- Any additional characters beyond the time portion, AM/PM portion, and allowed spaces are not permitted.

In order to handle the widest range of possible user input, you must accept input in any of the following forms:

|input String|equivalent to|return value|note|
|-|-|-|-|
|"10:08 AM"|10:08 AM|608|"standard form"|
|"6:45 pm"|6:45 PM|1125|lowercase is fine|
|"03:12 AM"|3:12 AM|192|one leading zero is ok|
|" 7:23 Pm "|7:23 PM|1163|extra space/mixed case is ok|
|"444AM"|4:44 AM|284|spaces/punctuation optional|
|"0534"|5:34 AM|334|lack of AM/PM = 24-hr clock|
|"23:59"|11:59 PM|1439|how 24-hr clock handles PM|
|"800"|8:00 AM|480|leading zero optional|
|"0035"|12:35 AM|35|zero hour in 24-hour clock|

However, each of the following inputs is invalid, and ```parseTime``` should return -1:

|input String|reason|
|-|-|
|"10 08 AM"|no spaces are permitted in the time portion|
|"4:14 P M"|no spaces are permitted in the AM/PM portion|
|"006:45 pm"|time portion must not exceed 4 digits|
|"012:30 am"|same reason|
|"9:5 PM"|second part must have 2 digits|
|"102:3"|misplaced colon|
|"1:47 AMM"|no extra characters are permitted|
|"PM 7:37"|the two portions are out of order|
|"4:67 AM"|the minutes are out of range|
|"2553"|the hour is out of range|
|"noon"|nope|

Your testing code should simply read a ```String``` from the user and print the result of calling ```parseTime``` on it.
Try out all sorts of combinations of input to make sure it works.

Turn in: your ```.java``` file, complete with ```parseTime``` and ```main``` methods.