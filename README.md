## Problem

https://leetcode.com/problems/insert-delete-getrandom-o1/description/

### Problem Solving Approach

You are tasked with implementing a set.

1. Internally, you should use a list, a hashmap, and random.
2. The list is used for storing values, the random is for selecting a value randomly among the stored values.
3. The hashmap is used for fast value lookup with O(1) time complexity.
4. Initialize the instance in the constructor.
5. In the insert method, check the hashmap to ensure there are no duplicate values before adding the value.
6. In the remove method, check the hashmap to ensure the value exists, then remove the value from the list.
7. When removing, replace the removed value with the last element of the list, update the hashmap accordingly, and remove the last element.
8. The getRandom method should select a random index from the list and return the corresponding value.