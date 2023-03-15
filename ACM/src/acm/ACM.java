/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class ACM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Number> number = new ArrayList<>();
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            if(number.isEmpty()){
                number.add(new Number(input));
            }
            else{
                if(number.contains(new Integer(input))){
                    
                    number.get(number.indexOf(input)).count++;
                    
                }
                else{
                    number.add(new Number(input));
                }
                
            }
           int min = Integer.MAX_VALUE;
            boolean check =false;
            for(int j=0;j<number.size();j++){
                if(number.get(j).count==1 && min > number.get(j).value){
                    check = true;
                    min = number.get(j).value;
                }
            }
            if(check == false) System.out.println("-1");
            else System.out.println(min);
        }
    }
    
}
class Number{
    int value;
    int count;
    public Number(int value){
        this.value=value;
        count=1;
    }
    public Number(int value, int count){
        this.count = count;
        this.value = value;
    }
}