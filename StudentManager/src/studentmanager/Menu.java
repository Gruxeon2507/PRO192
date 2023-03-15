/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class menu {
    public void menuDisplay(){
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        System.out.println("\t1. Create");
        System.out.println("\t2. Find and Sort");
        System.out.println("\t3. Update/Delete");
        System.out.println("\t4. Report");
        System.out.println("\t5. Exit");
    }
    public void readingInput(){
        int input;
        Scanner sc= new Scanner(System.in);
        input = sc.nextInt();
        switch(input){
            case 1:
                break;
            case 2:
                break;
        }
    }
}
