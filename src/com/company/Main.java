package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}


class FindElements {
    Set<Integer> set;

    public FindElements(TreeNode root) {
        set = new HashSet<>();
        if (root == null)
            return;
        set.add(0);
        recover(root, 0);
    }

    private void recover(TreeNode root, int val) {
        if (root.left != null) {
            int left = 2 * val + 1;
            set.add(left);
            recover(root.left, left);
        }

        if (root.right != null) {
            int right = 2 * val + 2;
            set.add(right);
            recover(root.right, right);
        }
    }

    public boolean find(int target) {
        return set.contains(target);
    }
}

