/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcodetalent2021;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemU {

    public static void main(String[] args) {
        ArrayList<Node> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        int value1, value2;
        value1 = sc.nextInt();
        value2 = sc.nextInt();
        Node temp = new Node(value2, null);
        list.add(new Node(value1, temp));
        for (int i = 1; i < n; i++) {
            value1 = sc.nextInt();
            value2 = sc.nextInt();
            Node temp1=null;
            Node temp2=null;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).value==value1){
                    temp1 = list.get(j);
                }
                if(list.get(j).value==value1){
                    temp2=list.get(j);
                }
            }
            if(temp1!=null)
        }
    }
}

class Node {

    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
