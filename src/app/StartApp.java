package app;

import trees.core.BinaryTree;
import trees.traversal.Traversals;

public class StartApp {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Traversals.performTraversals(tree.root);
    }
}
