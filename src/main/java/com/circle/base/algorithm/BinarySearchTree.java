package com.circle.base.algorithm;

/**
 * @Description
 * @Author eden
 * @Date 2018/4/26 上午11:39
 */
public class BinarySearchTree<K extends Comparable, V> {


    public static void main(String[] args) {
        BinarySearchTree<String, String> btree = new BinarySearchTree<>();
        btree.put("1", "1321231");
        btree.put("7", "213321312");
        btree.put("2", "231321");
        btree.put("5", "231321");
        btree.put("3", "231321");
        btree.put("4", "231321");
        btree.put("8", "231321");
        btree.put("10", "231321");
    }

    private Node<K, V> root;

    public V getValue(K k){
        return getValue(root, k);
    }

    /**
     * 递归
     * @param node
     * @param k
     * @return
     */
    private V getValue(Node<K, V> node, K k){
        if(node == null){
            return null;
        }
        int cmp = node.compareTo(k);
        if(cmp==0){
            return root.value;
        }else if(cmp>0){
            return getValue(node.getLeft(), k);
        }else{
            return getValue(node.getRight(), k);
        }
    }

    public void put(K k, V v){
        root = put(root, k, v);
    }

    private Node put(Node<K, V> node, K k, V v){
        if(node == null){
            return new Node(k, v, null, null);
        }
        int cmp = node.compareTo(k);
        if(cmp==0){
            node.setValue(v);
        }else if(cmp>0){
            node.setLeft(put(node.left, k, v));
        }else{
            node.setRight(put(node.right, k, v));
        }
        return node;
    }

    private class Node<K extends Comparable, V> implements Comparable<K>{

        private K key;
        private V value;
        private Node<K, V> left;
        private Node<K, V> right;

        @Override
        public int compareTo(K k) {
            return key.compareTo(k);
        }

        public Node(K key, V value, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getLeft() {
            return left;
        }

        public void setLeft(Node<K, V> left) {
            this.left = left;
        }

        public Node<K, V> getRight() {
            return right;
        }

        public void setRight(Node<K, V> right) {
            this.right = right;
        }
    }
}
