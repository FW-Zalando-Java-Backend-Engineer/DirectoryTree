package com.tree;

/**
 * Demo BST
 *
 */
public class App {
    public static void main( String[] args ) {
        DirectoryTree dt = new DirectoryTree();
        dt.add("Downloads");
        dt.add("Music");
        dt.add("Documents");
        dt.add("Photos");

        System.out.println("Directory listing:");
        dt.listInOrder().forEach(System.out :: println);


    }
}
