Given the root of a Binary Search Tree (BST), return the minimum absolute difference between
the values of any two different nodes in the tree.

Input: root = [4,2,6,1,3]
output: 1

in bst the tree is in the ascending order if we move from the left to right :

[1,2,3,4,6]
since i need to find the min difference we can just do the diff between neighbour in the inorder.
