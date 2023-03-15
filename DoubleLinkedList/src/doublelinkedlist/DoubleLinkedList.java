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
public class DoubleLinkedList {

    /**
     * @param args the command line arguments
     */
    Node head, tail;

    DoubleLinkedList() {
        head = tail = null;
    }

    int size() {
        Node p = head;
        int count = 0;
        while (p != null) {
            p = p.next;
            count++;
        }
        return count;
    }

    void set(int index, int val) {
        Node p = head;
        int count = 0;
        if (head == null || index >= size()) {
            return;
        } else {
            while (p != null) {
                if (count == index) {
                    p.inf = val;
                    break;
                }
                p = p.next;
                count++;
            }
        }

    }

    void delete(int index) {
        Node p = head;
        int count = 0;
        if (head == null || index >= size()) {
            return;
        } else {
            if (index == 0) {
                head=p.next;
                head.prev=null;
            } else if (index == size() - 1) {

                        tail=tail.prev;
                        tail.next=null;

            } else {
                while (p != null) {
                    if (count == index) {
                        p.prev.next = p.next;
                        p.next.prev = p.prev;
                        break;
                    }
                    p = p.next;
                    count++;
                }
            }

        }
    }

}
