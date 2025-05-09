package com.tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class DirectoryTreeTest {
    @Test
    void testInOrderListing(){
        DirectoryTree tree = new DirectoryTree();
        tree.add("Zeta");
        tree.add("Alpha");
        tree.add("Gamma");

        List<String> ordered = tree.listInOrder();
        assertEquals(List.of("Alpha", "Gamma", "Zeta"), ordered);

    }
}
