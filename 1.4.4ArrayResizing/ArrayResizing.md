# 1.4.4 – Array Resizing

Objective: To learn how to work around the fact that Java doesn't allow you to resize arrays.

What you need to do: Write and test the method
```
//postcondition: the contents of array are unchanged.
public static int[] resize(int[] array, int newLength)
```
which takes as arguments an existing array and an integer representing the desired new length of the array. This method returns a newly-instantiated array representing a lengthening or shortening of the argument array. In class, we will discuss exactly why you can't just resize the argument array (hint: arrays can't actually be resized).

If the length of the new array is greater than the length of the original array, the extra spaces should be filled with zeroes. If the length of the new array is less than the length of the original array, then spaces will be removed from the right end. Here are some examples to help:
| array | newLength | returned | array |
| - | - | - | - |
| [1, 2, 3, 4] | 6 | [1, 2, 3, 4, 0, 0] |
| [1, 2, 3, 4] | 2 | [1, 2] |
| [3, 1, 4, 1, 5, 9] | 3 | [3, 1, 4] |
| [3, 1, 4, 1, 5, 9] | 7 | [3, 1, 4, 1, 5, 9, 0] |
| [2, 5, 1, 2, 3] | 5 | [2, 5, 1, 2, 3] |
| [9, 2, 5] | 0 | [] |

The method is fairly straightforward. You need to:
a) instantiate a new array of appropriate length
b) copy the correct number of elements into the new array
c) return the new array
How would you use this method? Well, if you simply wanted to add an extra space onto the end of an existing array called ```nums```, you could use the line of code

```nums = resize(nums, nums.length + 1);```

Turn in: your .java file, containing your resize and main methods.
