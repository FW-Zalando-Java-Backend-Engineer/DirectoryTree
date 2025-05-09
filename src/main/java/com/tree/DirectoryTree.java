package com.tree;

import java.util.*;


/**
 * This Class represents a binary search tree (BST) where each node holds a directory name(a {@code String}).
 * It's used to store and retrieve directory names in sorted order.
 * */
public class DirectoryTree {
    // This is the root of the binary tree.
    private DirectoryNode root; // It starts as null (empty tree) and grows as you add directories.

    /**
     * Adds a new directory name into the tree.
     * */
    // 2. add("B")
    public  void add(String name){
        // Delegates to insert() method which does recursive BST insertion.
        // Updates the root (important when the tree is initially empty).
        this.root = insert(this.root, name); // 1. this.root = insert(null, "A"); -> [left:null, name:"A",right: null]
                                             // 2. this.root = insert([left:null, name:"A",right: null], "B")
                                            //  2. -> [null, "A", [null, "B", null]]
    }

    private DirectoryNode insert(DirectoryNode node, String name){
        if (node == null) return new DirectoryNode(name); // 1. new DirectoryNode("A") -> [left:null, name:"A",right: null]
        if(name.compareTo(node.getName()) < 0){
            node.setLeft(insert(node.getLeft(), name));
            //node.left = insert(node.left, name);
        }else{
            node.setRight(insert(node.getRight(), name)); // 2. node.right =  insert(null, "B"); -> [null, "B", null]
            //node.right = insert(node.right, name);
        }

        return node;//2. -> [null, "A", [null, "B", null]]

    }

    /**
     * Returns all directory names in sorted alphabetical order.
     * */
    public List<String> listInOrder(){
        List<String> result = new ArrayList<>();
        inorder(this.root, result);
        return result;
    }

    private void inorder(DirectoryNode node, List<String> result){
        if (node != null){
            inorder(node.getLeft(), result);
            result.add((node.getName()));
            inorder(node.getRight(), result);
        }
    }


}
