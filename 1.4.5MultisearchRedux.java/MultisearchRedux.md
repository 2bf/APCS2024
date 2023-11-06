# 1.4.5 – Multisearch Redux

Objective: To use array resizing in context. To understand the downside of frequent array resizing.

What you need to do: Start with your .java file from the previous assignment, containing a (functional) resize method.

Write a method
```public static int[] multiSearch(int[] array, int key)```
which has identical functionality to the method from assignment 1.4.3. However, you may only use one ```for``` loop in the method. To accomplish this, you should start with a zero-length array and resize it every time a new index is added to the array. In other words, follow this general plan:
- Create a zero-length result array
- Go through every element of the array passed to the method. If you find a match for key,
  - Resize the result array (one element longer than it is now)
  - Add the index to the result array
- Return the result array
- 
Write a ```main``` method to test your method. Once you know that ```multiSearch``` works, I want you to try this (in the main method):

- Instantiate an array containing 10000 elements.
- Multisearch it for a key of zero.
- See how long this takes.

If it doesn't take too long, try larger array sizes. Thought questions: why is this so inefficient? Was our original ```multiSearch``` method this inefficient?

Turn in: Your ```.java``` file, containing all methods used.
