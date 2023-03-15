package vodichgiaithuat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyen Hoang Minh
 */
import java.util.Scanner;

public class AWayToLongWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].length() > 10) {
                String number = Integer.toString(arr[i].length() - 2);
                arr[i] = arr[i].charAt(0) + number + arr[i].charAt(arr[i].length() - 1);
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
