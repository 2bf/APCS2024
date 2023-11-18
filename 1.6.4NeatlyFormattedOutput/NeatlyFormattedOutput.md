# 1.6.4 – Formatted Table

Objective: To utilize a previously-written helper method. To use the printf method to format output. To practice utilizing proper formatting to facilitate communication of output to the user.

What you need to do: Write and test the method
```public static void printTable(int[][] table)```
which prints a 2-D array of integers in a neatly formatted output. Why is this necessary, when we have already written a printArray method? Well, consider the code below:
```
int[][] table = {{23, 0, 425, -25},
                 {1856, 24601, 7, 92},
                 {-3, 18, -2053, 13}};
printArray(table);
```
Based on the basic ```printArray``` method covered in the videos, the output would look like this:
```
23 0 425 -25
1856 24601 7 92
-3 18 -2053 13
```
Although this is technically correct, it is not particularly user-friendly. The data would look a lot better if it were arranged in a grid, like this:
```
23   0     425   -25
1856 24601 7     92
-3   18    -2053 13
```
In addition, it would look a little better if the width of each column were the same:
```
23    0     425   -25
1856  24601 7     92
-3    18    -2053 13
```
Plus, it's customary for numerical data to be right-justified in each column, so the output of the ```printTable``` method you write (if passed this table) should look like this:
```
   23     0   425   -25 
 1856 24601     7    92 
   -3    18 -2053    13 
```
The easiest way to do this is to utilize the ```printf``` method, which I will review in class. Notice that each column has a width equal to the length of the widest number in the table.

Note: you must use your ```maxLength``` method from the previous assignment to obtain full credit.

Turn in: your ```.java``` file, containing your ```printTable```, ```maxLength```, and ```main``` methods.