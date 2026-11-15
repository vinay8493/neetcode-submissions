/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {

        if(findHeight(root) == -1)
        return false;

        return true;
        
    }

    private int findHeight(TreeNode root){
        if(root == null)
        return 0;

        int lh = 1+findHeight(root.left);
        int rh = 1+findHeight(root.right);

        if(Math.abs(lh-rh) > 1 || lh == 0 || rh == 0)
        return -1;

        return Math.max(lh, rh);
    }
}
