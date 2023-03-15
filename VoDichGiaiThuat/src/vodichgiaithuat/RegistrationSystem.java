/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodichgiaithuat;

/**
 *
 * @author Nguyen Hoang Minh
 */
import java.util.Scanner;
public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = 0;
        sc.nextLine();
        String[] array = new String[n];
        String[] array1 = new String[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){


            for(int j=0;j<i;j++){
                if(array[i].compareTo(array[j])==0){
                    check++;
                }
            }
        if(check==0){ System.out.println("OK");
        array1[i]=array[i];
        }
        else{
            array1[i]=array[i]+check;
            System.out.println(array1[i]);
        }
        check=0;
        }

    }
}
