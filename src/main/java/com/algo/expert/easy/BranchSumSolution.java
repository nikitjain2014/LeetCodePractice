package com.algo.expert.easy;

import java.util.ArrayList;

public class BranchSumSolution {

    public static ArrayList<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> sums = new ArrayList<Integer>();
        calculateBranchSums(root, 0, sums);
        return sums;
    }

    public static void calculateBranchSums(BinaryTree node, int runningSum, ArrayList<Integer> sums) {
        if (node == null) return;

        int newRunningSum = runningSum + node.value;
        if (node.left == null && node.right == null) {
            sums.add(newRunningSum);
            return;
        }
        calculateBranchSums(node.left, newRunningSum, sums);
        calculateBranchSums(node.right, newRunningSum, sums);
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);
        root.left.right = new BinaryTree(5);
        root.left.right.left = new BinaryTree(10);
        root.right = new BinaryTree(3);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        ArrayList<Integer> sums = branchSums(root);
        System.out.println(sums);
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
