/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1;

/**
 *
 * @author Nguyen Hoang Minh
 */
import java.util.Scanner;
public class part2 {
    public static void main(String[] args) {
        float num1,num2;
        String operator;
        Scanner input= new Scanner(System.in);
        System.out.print("Number 1= ");
        num1= input.nextFloat();
        System.out.print("Number 2= ");
        num2= input.nextFloat();

        int check=0;
        int result;
        while (check==0){
        input=new Scanner(System.in);    
        System.out.print("Input the operator");
        operator=input.nextLine();
        switch (operator){
            case "+":
                System.out.print("The result of " + num1 + operator+ num2+"= "+(num1+num2));
                check=1;
                break;
            case "-":
                System.out.print("The result of " + num1 + operator+ num2+"= "+(num1-num2));
                check=1;
                break;
            case "*":
                System.out.print("The result of" + num1 + operator+ num2+"= "+(num1*num2));
                check=1;
                break;
             case "/":
                System.out.print("The result of " + num1 + operator+ num2+"= "+(num1/num2));
                check=1;
                break; 
             default:
                System.out.print("Invalid operator, please enter again");
                 
        }
        }
    }
    
    
    
}
