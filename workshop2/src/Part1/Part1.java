/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;


import java.util.Scanner;
public class Part1 {
    public static void main(String[] args){
        int check=0;
        do {
            try{
                System.out.println("enter the number:");
                Scanner sc = new Scanner(System.in);
                int number;
                number = sc.nextInt();
                if(number<1)
                    throw new Exception();
                System.out.println("The number is: "+number);
                check = 1;
            }catch (Exception e){
                System.out.println("The number is invalid, please enter again");
               
            }

        }while (check == 0);
                
    }
    
}
