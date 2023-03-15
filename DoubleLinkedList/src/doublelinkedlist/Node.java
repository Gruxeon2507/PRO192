/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Node {
    int inf;
    Node next,prev;
    public Node(int x){
        inf=x;
        next=prev=null;
    }
    public Node(int x, Node next, Node prev){
        inf=x;
        this.next=next;
        this.prev=prev;
    }
}
