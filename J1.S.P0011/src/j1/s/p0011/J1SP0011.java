/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class J1SP0011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in, out;
        in = inputformat();
        int input = inputnumber(in);
        out = outputformat();
    }

    public static int inputformat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select base number input(1-3): ");
        System.out.println("1: Binary");
        System.out.println("2: Decimal");
        System.out.println("3: Hexadecimal");
        int in;
        in = sc.nextInt();
        while (in != 1 || in != 2 || in != 3) {
            System.out.println("Invalid input, please enter again");
            in = sc.nextInt();
        }
        return in;
    }

    public static int inputnumber(int in) {
        Scanner sc = new Scanner(System.in);

  
        if (in == 1) {
            int check = 0;
            int input;
            while (check == 0) {
                input = sc.nextInt();
                while (input > 0) {
                    if (input % 10 > 1) {
                        System.out.println("Invalid input,please enter again");
                        check++;
                        break;
                    }
                    input/=10;
                }
                if(check==0) return input;
                else check=0;
            }

        } else if (in == 2) {
            int input = sc.nextInt();
            return input;
        } else {
            String input;
            input = sc.next();
            return input;
        }
    }

    public static int outputformat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select base number output(1-3): ");
        System.out.println("1: Binary");
        System.out.println("2: Decimal");
        System.out.println("3: Hexadecimal");
        int in;
        in = sc.nextInt();
        while (in != 1 || in != 2 || in != 3) {
            System.out.println("Invalid output, please enter again");
            in = sc.nextInt();
        }
        return in;
    }

    public static void convert()
}
