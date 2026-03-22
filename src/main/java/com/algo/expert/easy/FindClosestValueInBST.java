package com.algo.expert.easy;

public class FindClosestValueInBST {

    public static int findClosestValueInBST(BST tree, int target) {
        int closest = tree.value;
        BST currentNode = tree;
        if (target > closest) {
            while (currentNode != null) {
                if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
                    closest = currentNode.value;
                }
                currentNode = currentNode.right;
            }
        } else {
            while (currentNode != null) {
                if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
                    closest = currentNode.value;
                }
                currentNode = currentNode.left;
            }
        }
        return closest;
    }


    public static void main(String[] args) {
        BST root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.right = new BST(15);
        root.right.right = new BST(22);
        System.out.println(findClosestValueInBST(root, 3));
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}