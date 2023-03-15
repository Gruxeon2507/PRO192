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
import java.util.Iterator;
import java.util.Vector;
public class UseVector {
    public static void main(String[] args){
        Vector v = new Vector();
        v.add(15);
        v.add("Hello");
        v.add(new Point());
        v.add(new Point(5,7));
        System.out.println(v);
        v.remove(2);
        System.out.println(v);
        for(int i=0;i<v.size();i++){
            System.out.print(v.get(i)+", ");
            System.out.println();
        }
        Iterator iter = v.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
            
        }
    }
}
