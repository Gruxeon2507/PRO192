/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcodetalent2021;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            tree.insert(temp);
        }
        String result = tree.inOrder(tree.root);
        
        System.out.println(result.substring(0, result.length()-1));
        result = tree.postOrder(tree.root);
        System.out.println(result.substring(0, result.length()-1));
    }
}

class Node1 {

    int count;
    Node1 left;
    Node1 right;
    int value;

    public Node1(int value) {
        this.value = value;
        left = null;
        right = null;
        count = 1;
    }
}

class Tree {

    Node1 root;

    public boolean isEmpty() {
        return (root == null);
    }

    public void insert(int x) {
        if (isEmpty()) {
            root = new Node1(x);
            return;
        }
        Node1 p = root;
        Node1 par = p;
        while (p != null) {
            if (x > p.value) {
                par = p;
                p = p.right;
            } else if (x < p.value) {
                par = p;
                p = p.left;
            } else {
                p.count++;
                return;
            }
        }
        if (x > par.value) {
            par.right = new Node1(x);
        } else {
            par.left = new Node1(x);
        }
    }

    public String visit(Node1 p) {
        String visit = "";
        for (int i = 0; i < p.count; i++) {
            visit = visit + p.value + ",";
        }
        return visit;
    }

    public String inOrder(Node1 p) {
        if (p == null) {
            return "";
        }
        String result="";
        result+=inOrder(p.left);
        result+=visit(p);
        result+=inOrder(p.right);
        return result;
    }

    public String postOrder(Node1 p) {
        if (p == null) {
            return "";
        }
            String result="";
         result+=visit(p);   
        result+=postOrder(p.left);
        result+=postOrder(p.right);
                
        return result;

    }
}
