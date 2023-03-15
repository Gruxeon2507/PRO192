/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arguments.to.method.main;

/**
 *
 * @author Nuke Duke
 */
import java.lang.Math;
import java.util.Scanner;
class temp_number{
    static float sum(float a,float b){

        if (a>b) return (float) Math.ceil(a+b);
        else return (float) Math.floor(a+b);
    }

    
}
public class ArgumentsToMethodMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        float a,b;
        Scanner input= new Scanner(System.in);
        System.out.println("a= ");
        a= input.nextFloat();
        System.out.println("b= ");
        b= input.nextFloat();    
        System.out.println("Sum: "+ temp_number.sum(a,b));
        
    }

}
