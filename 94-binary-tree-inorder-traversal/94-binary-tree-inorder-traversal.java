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
    private List<Integer> result = new LinkedList<Integer>();
    
    public void inorder(TreeNode cur) {
        if (cur == null) return;
        
        inorder(cur.left);
        result.add(cur.val);
        inorder(cur.right);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        
        return result;
    }
}