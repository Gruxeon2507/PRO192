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
public class part3 {
        public static void main(String[] args) {
            String[] name;
            int n;
            Scanner input=new Scanner(System.in);
            System.out.print("Number of student name: ");
            n= input.nextInt();
            input=new Scanner(System.in);
            name=new String[n];
            for(int i=0;i<n;i++){
                System.out.print("name["+i+"]: ");
                name[i]=input.nextLine();
                name[i]=name[i].toUpperCase();
            }
            for(int i=0;i<n;i++){
                System.out.println(name[i]);
            }
        }
}
