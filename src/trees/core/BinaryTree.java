package trees.core;

public class BinaryTree {
    public TreeNode root;

    public BinaryTree() {
        initializeTree();
    }

    private void initializeTree() {
        root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(13);
        root.right.right.left.left = new TreeNode(9);
        root.right.right.left.left.right = new TreeNode(11);
        root.right.right.left.left.right.right = new TreeNode(15);
    }
}
