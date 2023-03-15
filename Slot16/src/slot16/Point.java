/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot16;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Point {
    int x,y;
    Point() { x=0; y=0; }
    Point(int xx, int yy){
        x=xx;
        y=yy;
    }

    public String toString() {
        return "["+x+","+y+"]";
}
}

