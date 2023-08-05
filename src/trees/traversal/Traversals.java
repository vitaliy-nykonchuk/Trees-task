package trees.traversal;

import trees.core.TreeNode;

public class Traversals {

    private static void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.value + " ");
            inorderTraversal(node.right);
        }
    }

    private static void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    private static void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void performTraversals(TreeNode root) {
        System.out.println("Inorder traversal:");
        inorderTraversal(root);
        System.out.println("\n");

        System.out.println("Preorder traversal:");
        preorderTraversal(root);
        System.out.println("\n");

        System.out.println("Postorder traversal:");
        postorderTraversal(root);
        System.out.println("\n");
    }
}
