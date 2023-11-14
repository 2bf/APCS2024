# 1.6.1 – Magic Squares

Objective: To become accustomed to working with 2-D arrays, including referencing cells and determining the number of rows and number of columns in a 2-D array.

What you need to do: write and test a method
```public static boolean isMagicSquare(int[][] grid)```
which returns ```true``` if and only if grid contains a 3-by-3 magic square. A magic square is a square array of numbers in which the sum of each row, column, and the two main diagonals are the same. For example, these are magic squares:

||||
|---|---|---|
| 8 | 1 | 6 |
| 3 | 5 | 7 |
| 4 | 9 | 2 |

||||
|----|----|----|
| 17 |  3 | 13 |
|  7 | 11 | 15 |
|  9 | 19 |  5 |

||||
|---|---|---|
| 7 | 7 | 7 |
| 7 | 7 | 7 |
| 7 | 7 | 7 |

||||
|---|---|---|
| -1 |  1 | 0 |
|  1 |  0 | -1 |
|  0 | -1 | 1 |

Note: your method should only return ```true``` if the array passed is a 3-by-3 magic square. If either the number of rows or the number of columns of the array is not 3, or the sum of any row, column, or diagonal is different, then your method should return ```false```.

Advanced version: expand your method to work with any square 2-D array, from 1-by-1 upwards. (Note: any 1- by-1 array is automatically a magic square.) You would have a different check at the beginning, though—you would return ```false``` if the number of rows and number of columns are unequal, not if they're not 3. You can test your code with the following magic square I stole off of findthefactors.com:

||||||||
|-|-|-|-|-|-|-|
| 30 | 39 | 48 |  1 | 10 | 19 | 28 |
| 38 | 47 |  7 |  9 | 18 | 27 | 29 |
| 46 |  6 |  8 | 17 | 26 | 35 | 37 |
|  5 | 14 | 16 | 25 | 34 | 36 | 45 |
| 13 | 15 | 24 | 33 | 42 | 44 |  4 |
| 21 | 23 | 32 | 41 | 43 |  3 | 12 |
| 22 | 31 | 40 | 49 |  2 | 11 | 20 |

Turn in: Your ```.java``` file, complete with both the ```isMagicSquare``` and main`` methods.