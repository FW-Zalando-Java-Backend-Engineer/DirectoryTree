package com.tree;

/**
 *  a helper class:
 * Represents a folder or file in a binary tree directory.
 */
public class DirectoryNode {
    private String name;
    private DirectoryNode left;
    private DirectoryNode right;

    public DirectoryNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public DirectoryNode getLeft() {
        return left;
    }

    public DirectoryNode getRight() {
        return right;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLeft(DirectoryNode left) {
        this.left = left;
    }

    public void setRight(DirectoryNode right) {
        this.right = right;
    }
}
