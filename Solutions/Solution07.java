import java.util.Arrays;

public class Solution07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);
        int rootIdx = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                rootIdx = i;
                break;
            }
        }
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, rootIdx + 1), Arrays.copyOfRange(inorder, 0, rootIdx));
        root.right = buildTree(Arrays.copyOfRange(preorder, rootIdx + 1, preorder.length), Arrays.copyOfRange(inorder, rootIdx + 1, inorder.length));
        return root;

    }
}
