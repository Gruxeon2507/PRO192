/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

import java.util.Scanner;
public class Part2 {
    public static void main(String[] args){
        int check=0;
        do{
            try{
                String s="";
                Scanner sc = new Scanner(System.in);
                String example="SE\\d{3}";
                System.out.println("Enter the string: ");
                s=sc.next();
                if(!s.matches(example))
                    throw new Exception();
                System.out.println("The string is "+ s);
                check =1;
            }
            catch(Exception e){
                System.out.println("The string is invalid, please enter again");
            }
        }while(check==0);
        
    }
}
