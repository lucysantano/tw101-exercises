package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;
    List<String> names = new ArrayList<String>();

    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }

    public void add(String nameOfNewNode) {
        if(nameOfNewNode == name){
            return;
        }
        else if(nameOfNewNode.compareTo(name)<0) {
            if (left == null) {
                left = new Node(nameOfNewNode);
                return;
            } else {
                left.add(nameOfNewNode);
            }
        }
        else if (nameOfNewNode.compareTo(name)>0){
            if(right == null){
                right = new Node(nameOfNewNode);
                return;
            }
            else{
                right.add(nameOfNewNode);
            }

        }


    }

    public List<String> names() {
        inOrderTraversal(this);
        return names;
    }

    private void inOrderTraversal(Node node) {
        if(node.left != null){
            inOrderTraversal(node.left);
        }
        names.add(node.name);
        if(node.right != null){
            inOrderTraversal(node.right);
        }
    }
}
