// importing libraries

import java.util.List;
import java.util.ArrayList;

public class BST<K extends Comparable<K>, V> {
    private Node root;

    // Node class for the binary search tree
    private class Node {
        private K key;
        private V val;
        private Node left, right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }

    }

    // Inserts a key-value pair into the binary search tree
    public void put(K key, V value) {
        root = put(root, key, value);
    }

    // Recursive helper method to insert a key-value pair into the binary search tree
    private Node put(Node node, K key, V val) {
        if (node == null) {
            return new Node(key, val);
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = put(node.left, key, val);
        } else if (cmp > 0) {
            node.right = put(node.right, key, val);
        } else {
            node.val = val; // Update value if key already exists
        }
        return node;
    }

    // Retrieves the value associated with a given key in the binary search tree
    public V get(K key) {
        Node node = get(root, key);
        return node != null ? node.val : null;
    }

    // Recursive helper method to search for a key in the binary search tree
    private Node get(Node node, K key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.left, key);
        } else if (cmp > 0) {
            return get(node.right, key);
        } else {
            return node;
        }
    }


















}